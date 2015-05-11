package jflexneatbeans;
import static jflexneatbeans.Token.*;

%%

%public
%class Lexer
%type Token

%unicode

%line
%column
%char


%{
    public String lexeme;
    public int linea;
    public int columna;
    public String lineaIdentificador = "";
    
    //Variables contadoras
    public int contErrores = 0;
    public int contSeparadores = 0;
    public int contOperadores = 0;
    public int contLiteralesBooleanos = 0;
    public int contLiteralesString = 0;
    public int contLiteralesHexadecimales = 0;
    public int contLiteralesOctales = 0;
    public int contLiteralesDecimales = 0;
    public int contLiteralesPtoFlotantes = 0;
    public int contLiteralesNull = 0;
    public int contIdentificadores = 0;
    public int contReservadas = 0;


    public StringBuilder string = new StringBuilder();
%}

/* SALTO DE LINEA Y CUALQUIER CARACTER */
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

WhiteSpace = {LineTerminator} | [ \t\f]

/* COMENTARIOS*/
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

/* IDENTIFICADORES */
Identifier = [a-zA-Z][:jletterdigit:]*

/* LITERALES ENTEROS */
DecLiteral = 0 | [1-9][0-9]*
DecLongLiteral    = {DecLiteral} [lL]

HexLiteral = 0 [xX] 0* {HexDigit}
HexDigit          = [0-9a-fA-F]+
HexLongLiteral    = 0 [xX] 0* {HexDigit} [lL]

OctLiteral = 0+ [1-3]? {OctDigit}
OctDigit          = [0-7]+
OctLongLiteral    = 0+ 1? {OctDigit} {1,21} [lL]
    
/* LITERALES PUNTO FLOTANTE */        
FloatLiteral  = ({FLit1}|{FLit2}) {Exponent}? [fF]
DoubleLiteral = ({FLit1}|{FLit2}) {Exponent}?

FLit1    = [0-9]+ \. [0-9]* 
FLit2    = \. [0-9]+ 
Exponent = [eE] [+-]? [0-9]+

/* LITERALES STRING */
StringCharacter = [^\r\n\"\\]
SingleCharacter = [^\r\n\'\\]


/* PALABRAS RESERVADAS */
PR = auto|break|bool|char|const|continue|default|do|double|else|enum|extern|float|for|
goto|if|int|long|register|return|short|signed|sizeof|static|struct|switch|typedef|
union|unsigned|void|volatile|while

/* SEPARADORES */
SEPARADOR = "("|")"|"{"|"}"|"["|"]"|";"|","|"."

/* OPERADORES */
OPERADORES = =|"=="|"+"|"*"|"-"|"/"|"<"|"<="|">"|">="|"!="|"!"|"||"|"&&"|"<<"|"<<="|
">>"|">>="|"~"|"&"|"&="|"|"|"|="|"("|")"|"["|"]"|"{"|"}"|"."|"->"|"++"|"--"|
"(type)"|"*"|"&"|"new"|"true"|"false"|"%"|"#include"|"delete"|"#define"|"-="
|"+="|"#import"|"?:"|"#ifdef"|"#else"|"#endif"|"#pragma"|"#undef"|"#error"

%state STRING, CHARLITERAL

%%

<YYINITIAL> {

  /* PALABRAS RESERVADAS */
  {PR}                           { lexeme=yytext(); linea=yyline; columna=yycolumn; return RESERVADA; }
  
  /* LITERALES BOOLEANOS */
  "true"                         { contLiteralesBooleanos++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALBOOLEANO; }
  "false"                        { contLiteralesBooleanos++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALBOOLEANO; }
  
  /*LITERAL NULL*/
  "null"                         { contLiteralesNull++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALNULL; }
  
  /* SEPARADORES */
  {SEPARADOR}                    { contSeparadores++; lexeme=yytext(); linea=yyline; columna=yycolumn; return SEPARADOR; }
  
    /* OPERADORES */
  {OPERADORES}                   { contOperadores++; lexeme=yytext(); linea=yyline; columna=yycolumn; return OPERADOR; }
  
/* string literal */
  \"                             { yybegin(STRING); string.setLength(0); }


  {DecLiteral}                   { contLiteralesDecimales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALDECIMAL;}
  {DecLongLiteral}               { contLiteralesDecimales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALDECIMAL;}

  {HexLiteral}                   { contLiteralesHexadecimales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALHEXADECIMAL;}
  {HexLongLiteral}               { contLiteralesHexadecimales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALHEXADECIMAL;}
 
  {OctLiteral}                   { contLiteralesOctales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALOCTAL;}
  {OctLongLiteral}               { contLiteralesOctales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALOCTAL;}
  
  {FloatLiteral}                 { contLiteralesPtoFlotantes++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALPTOFLOTANTE; }
  {DoubleLiteral}                { contLiteralesPtoFlotantes++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALPTOFLOTANTE; }

  /* COMENTARIOS */
  {Comment}                      { /* ignorar */ }

  /* ESPACIO EN BLANCO */
  {WhiteSpace}                   { /* ignorar */ }

  /* IDENTIFICADORES */ 
  {Identifier}                   { linea = yyline + 1; contIdentificadores++; lineaIdentificador = lineaIdentificador + ", " + linea; lexeme=yytext(); linea=yyline; columna=yycolumn; return IDENTIFICADOR;}  
}

<STRING> {
  \"                             { yybegin(YYINITIAL); contLiteralesString++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALSTRING; }
  
  {StringCharacter}+             { string.append( yytext() ); }
  
  /* escape sequences */
  "\\b"                          { string.append( '\b' ); }
  "\\t"                          { string.append( '\t' ); }
  "\\n"                          { string.append( '\n' ); }
  "\\f"                          { string.append( '\f' ); }
  "\\r"                          { string.append( '\r' ); }
  "\\\""                         { string.append( '\"' ); }
  "\\'"                          { string.append( '\'' ); }
  "\\\\"                         { string.append( '\\' ); }
  \\[0-3]?{OctDigit}?{OctDigit}  { char val = (char) Integer.parseInt(yytext().substring(1),8);
                        				   string.append( val ); }
  
  /* error cases */
  \\.                            { contErrores++; return ERROR; }
  {LineTerminator}               { contErrores++; return ERROR; }
}

. { contErrores++; return ERROR;}    
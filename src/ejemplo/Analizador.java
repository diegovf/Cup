
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package ejemplo;

import java.io.*;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analizador extends java_cup.runtime.lr_parser {
    Reader reader;
    @Override
 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Analizador() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analizador(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analizador(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\010\000\002\003\003\000\002\007\007" +
    "\000\002\004\003\000\002\004\002\000\002\005\003\000" +
    "\002\005\002\000\002\006\003\000\002\006\002\000\002" +
    "\010\010\000\002\010\006\000\002\011\007\000\002\011" +
    "\005\000\002\012\003\000\002\012\003\000\002\012\003" +
    "\000\002\012\003\000\002\012\003\000\002\012\003\000" +
    "\002\013\006\000\002\013\004\000\002\014\004\000\002" +
    "\014\003\000\002\014\004\000\002\014\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\006\003\005\024\006\001\002\000\010\002" +
    "\067\003\005\024\006\001\002\000\010\002\ufffd\003\ufffd" +
    "\024\ufffd\001\002\000\004\020\010\001\002\000\010\002" +
    "\uffff\003\uffff\024\uffff\001\002\000\006\016\ufffa\025\014" +
    "\001\002\000\004\016\030\001\002\000\006\016\ufffb\017" +
    "\023\001\002\000\004\021\020\001\002\000\004\026\015" +
    "\001\002\000\004\013\016\001\002\000\004\027\017\001" +
    "\002\000\006\016\ufff4\017\ufff4\001\002\000\004\022\021" +
    "\001\002\000\004\023\022\001\002\000\010\002\ufffe\003" +
    "\ufffe\024\ufffe\001\002\000\004\025\024\001\002\000\004" +
    "\026\025\001\002\000\004\013\026\001\002\000\004\027" +
    "\027\001\002\000\006\016\ufff5\017\ufff5\001\002\000\006" +
    "\016\ufff8\026\031\001\002\000\016\004\057\005\054\006" +
    "\055\013\056\014\061\015\060\001\002\000\006\016\ufff9" +
    "\017\052\001\002\000\004\016\034\001\002\000\006\021" +
    "\ufff6\026\035\001\002\000\012\007\046\010\045\011\042" +
    "\012\043\001\002\000\006\017\040\021\ufff7\001\002\000" +
    "\004\021\ufffc\001\002\000\004\026\041\001\002\000\012" +
    "\007\046\010\045\011\042\012\043\001\002\000\004\027" +
    "\050\001\002\000\006\017\uffe6\021\uffe6\001\002\000\006" +
    "\017\uffeb\021\uffeb\001\002\000\006\017\uffe8\021\uffe8\001" +
    "\002\000\004\027\047\001\002\000\006\017\uffe9\021\uffe9" +
    "\001\002\000\006\017\uffe7\021\uffe7\001\002\000\006\017" +
    "\uffea\021\uffea\001\002\000\004\026\053\001\002\000\016" +
    "\004\057\005\054\006\055\013\056\014\061\015\060\001" +
    "\002\000\004\027\ufff0\001\002\000\004\027\uffef\001\002" +
    "\000\004\027\uffec\001\002\000\004\027\ufff1\001\002\000" +
    "\004\027\uffed\001\002\000\004\027\uffee\001\002\000\004" +
    "\027\063\001\002\000\006\016\ufff3\017\ufff3\001\002\000" +
    "\004\027\065\001\002\000\006\016\ufff2\017\ufff2\001\002" +
    "\000\010\002\001\003\001\024\001\001\002\000\004\002" +
    "\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\006\002\003\003\006\001\001\000\004\003" +
    "\065\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\004\010\007\012\010\011\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\005\032\011\031" +
    "\001\001\000\004\012\063\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\006\036\013\035\001\001\000\004" +
    "\014\050\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\014\043\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analizador$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analizador$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Analizador$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production.
     * @return  */
    @Override
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
    @Override
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
    @Override
  public int error_sym() {return 1;}



	public static void main(String args[]) throws Exception{
		//new parser(new Yylex(new FileInputStream(args[0]))).parse();
                Reader reader = new FileReader("src\\ejemplo\\entrada.txt");
		new Analizador(new Yylex(reader)).parse();
	}
    @Override
	public void syntax_error(Symbol s){
		report_error("Error de sintaxis. Linea: " + (s.right + 1) +
		" Columna: " + s.left + ". Texto: \"" + s.value + "\"", null);
	}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analizador$actions {
  private final Analizador parser;

  /** Constructor */
  CUP$Analizador$actions(Analizador parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analizador$do_action_part00000000(
    int                        CUP$Analizador$act_num,
    java_cup.runtime.lr_parser CUP$Analizador$parser,
    java.util.Stack            CUP$Analizador$stack,
    int                        CUP$Analizador$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analizador$result;

      /* select the action based on the action number */
      switch (CUP$Analizador$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Lista ::= Lista Sentencia 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Lista",0, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Lista EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)).value;
		RESULT = start_val;
              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analizador$parser.done_parsing();
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Lista ::= Sentencia 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Lista",0, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Sentencia ::= FOR PARIZQ Expresion PARDER LLAVEIZQ LLAVEDER 
            {
              Object RESULT =null;
		 System.out.println("Sentencia analizada correctamente. Sin errores."); 
              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Sentencia",1, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-5)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Sentencia ::= error 
            {
              Object RESULT =null;
		 System.out.println("Error sintactico en la sentencia"); 
              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Sentencia",1, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Expresion ::= E1 PYCOMA E2 PYCOMA E3 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Expresion",5, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-4)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // E1 ::= Inicializacion 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("E1",2, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E1 ::= 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("E1",2, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // E2 ::= Condicion 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("E2",3, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // E2 ::= 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("E2",3, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // E3 ::= Incremento 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("E3",4, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E3 ::= 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("E3",4, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Inicializacion ::= Inicializacion COMA INT ID IGUAL NUMERO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Inicializacion",6, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-5)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Inicializacion ::= INT ID IGUAL NUMERO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Inicializacion",6, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-3)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Condicion ::= Condicion COMA ID Comp NUMERO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Condicion",7, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-4)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Condicion ::= ID Comp NUMERO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Condicion",7, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Comp ::= DIFERENTE 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Comp",8, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Comp ::= MAYORIGUAL 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Comp",8, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Comp ::= MENORIGUAL 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Comp",8, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Comp ::= MAYOR 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Comp",8, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Comp ::= MENOR 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Comp",8, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Comp ::= IGUAL 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Comp",8, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Incremento ::= Incremento COMA ID Inc 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Incremento",9, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-3)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Incremento ::= ID Inc 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Incremento",9, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Inc ::= MENOSNUM NUMERO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Inc",10, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Inc ::= MENOSUNO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Inc",10, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Inc ::= MASNUM NUMERO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Inc",10, ((java_cup.runtime.Symbol)CUP$Analizador$stack.elementAt(CUP$Analizador$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Inc ::= MASUNO 
            {
              Object RESULT =null;

              CUP$Analizador$result = parser.getSymbolFactory().newSymbol("Inc",10, ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador$stack.peek()), RESULT);
            }
          return CUP$Analizador$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analizador$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analizador$do_action(
    int                        CUP$Analizador$act_num,
    java_cup.runtime.lr_parser CUP$Analizador$parser,
    java.util.Stack            CUP$Analizador$stack,
    int                        CUP$Analizador$top)
    throws java.lang.Exception
    {
              return CUP$Analizador$do_action_part00000000(
                               CUP$Analizador$act_num,
                               CUP$Analizador$parser,
                               CUP$Analizador$stack,
                               CUP$Analizador$top);
    }
}

}

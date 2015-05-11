/* The following code was generated by JFlex 1.6.1 */

package ejemplo;
import static ejemplo.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>src/ejemplo/Lexer.flex</tt>
 */
public class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int CHARLITERAL = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\7\1\3\1\2\1\73\1\74\1\1\16\7\4\0\1\3\1\64"+
    "\1\22\1\70\1\7\1\67\1\66\1\23\1\55\1\56\1\5\1\61"+
    "\1\57\1\21\1\17\1\4\1\10\1\15\2\15\4\15\2\11\1\72"+
    "\1\57\1\62\1\60\1\63\1\71\1\0\4\14\1\20\1\16\5\6"+
    "\1\12\13\6\1\13\2\6\1\57\1\24\1\57\1\0\1\7\1\0"+
    "\1\25\1\31\1\36\1\43\1\33\1\44\1\47\1\37\1\42\1\6"+
    "\1\34\1\35\1\45\1\40\1\30\1\53\1\6\1\32\1\41\1\27"+
    "\1\26\1\54\1\51\1\46\1\52\1\50\1\57\1\65\1\57\1\67"+
    "\6\7\1\75\32\7\2\0\4\7\4\0\1\7\2\0\1\7\7\0"+
    "\1\7\4\0\1\7\5\0\27\7\1\0\37\7\1\0\u01ca\7\4\0"+
    "\14\7\16\0\5\7\7\0\1\7\1\0\1\7\21\0\165\7\1\0"+
    "\2\7\2\0\4\7\10\0\1\7\1\0\3\7\1\0\1\7\1\0"+
    "\24\7\1\0\123\7\1\0\213\7\1\0\5\7\2\0\236\7\11\0"+
    "\46\7\2\0\1\7\7\0\47\7\7\0\1\7\1\0\55\7\1\0"+
    "\1\7\1\0\2\7\1\0\2\7\1\0\1\7\10\0\33\7\5\0"+
    "\3\7\15\0\5\7\6\0\1\7\4\0\13\7\5\0\112\7\4\0"+
    "\146\7\1\0\11\7\1\0\12\7\1\0\23\7\2\0\1\7\17\0"+
    "\74\7\2\0\145\7\16\0\66\7\4\0\1\7\5\0\56\7\22\0"+
    "\34\7\104\0\1\7\1\0\13\7\67\0\33\7\1\0\144\7\2\0"+
    "\12\7\1\0\7\7\1\0\7\7\1\0\3\7\1\0\10\7\2\0"+
    "\2\7\2\0\26\7\1\0\7\7\1\0\1\7\3\0\4\7\2\0"+
    "\11\7\2\0\2\7\2\0\4\7\10\0\1\7\4\0\2\7\1\0"+
    "\5\7\2\0\16\7\7\0\1\7\5\0\3\7\1\0\6\7\4\0"+
    "\2\7\2\0\26\7\1\0\7\7\1\0\2\7\1\0\2\7\1\0"+
    "\2\7\2\0\1\7\1\0\5\7\4\0\2\7\2\0\3\7\3\0"+
    "\1\7\7\0\4\7\1\0\1\7\7\0\20\7\13\0\3\7\1\0"+
    "\11\7\1\0\3\7\1\0\26\7\1\0\7\7\1\0\2\7\1\0"+
    "\5\7\2\0\12\7\1\0\3\7\1\0\3\7\2\0\1\7\17\0"+
    "\4\7\2\0\12\7\1\0\1\7\17\0\3\7\1\0\10\7\2\0"+
    "\2\7\2\0\26\7\1\0\7\7\1\0\2\7\1\0\5\7\2\0"+
    "\11\7\2\0\2\7\2\0\3\7\10\0\2\7\4\0\2\7\1\0"+
    "\5\7\2\0\12\7\1\0\1\7\20\0\2\7\1\0\6\7\3\0"+
    "\3\7\1\0\4\7\3\0\2\7\1\0\1\7\1\0\2\7\3\0"+
    "\2\7\3\0\3\7\3\0\14\7\4\0\5\7\3\0\3\7\1\0"+
    "\4\7\2\0\1\7\6\0\1\7\16\0\12\7\11\0\1\7\7\0"+
    "\3\7\1\0\10\7\1\0\3\7\1\0\27\7\1\0\12\7\1\0"+
    "\5\7\3\0\10\7\1\0\3\7\1\0\4\7\7\0\2\7\1\0"+
    "\2\7\6\0\4\7\2\0\12\7\22\0\2\7\1\0\10\7\1\0"+
    "\3\7\1\0\27\7\1\0\12\7\1\0\5\7\2\0\11\7\1\0"+
    "\3\7\1\0\4\7\7\0\2\7\7\0\1\7\1\0\4\7\2\0"+
    "\12\7\1\0\2\7\17\0\2\7\1\0\10\7\1\0\3\7\1\0"+
    "\51\7\2\0\10\7\1\0\3\7\1\0\5\7\10\0\1\7\10\0"+
    "\4\7\2\0\12\7\12\0\6\7\2\0\2\7\1\0\22\7\3\0"+
    "\30\7\1\0\11\7\1\0\1\7\2\0\7\7\3\0\1\7\4\0"+
    "\6\7\1\0\1\7\1\0\10\7\22\0\2\7\15\0\72\7\4\0"+
    "\20\7\1\0\12\7\47\0\2\7\1\0\1\7\2\0\2\7\1\0"+
    "\1\7\2\0\1\7\6\0\4\7\1\0\7\7\1\0\3\7\1\0"+
    "\1\7\1\0\1\7\2\0\2\7\1\0\15\7\1\0\3\7\2\0"+
    "\5\7\1\0\1\7\1\0\6\7\2\0\12\7\2\0\4\7\40\0"+
    "\1\7\27\0\2\7\6\0\12\7\13\0\1\7\1\0\1\7\1\0"+
    "\1\7\4\0\12\7\1\0\44\7\4\0\24\7\1\0\22\7\1\0"+
    "\44\7\11\0\1\7\71\0\112\7\6\0\116\7\2\0\46\7\1\0"+
    "\1\7\5\0\1\7\2\0\53\7\1\0\u014d\7\1\0\4\7\2\0"+
    "\7\7\1\0\1\7\1\0\4\7\2\0\51\7\1\0\4\7\2\0"+
    "\41\7\1\0\4\7\2\0\7\7\1\0\1\7\1\0\4\7\2\0"+
    "\17\7\1\0\71\7\1\0\4\7\2\0\103\7\2\0\3\7\40\0"+
    "\20\7\20\0\125\7\14\0\u026c\7\2\0\21\7\1\0\32\7\5\0"+
    "\113\7\3\0\3\7\17\0\15\7\1\0\7\7\13\0\25\7\13\0"+
    "\24\7\14\0\15\7\1\0\3\7\1\0\2\7\14\0\124\7\3\0"+
    "\1\7\3\0\3\7\2\0\12\7\41\0\3\7\2\0\12\7\6\0"+
    "\130\7\10\0\53\7\5\0\106\7\12\0\35\7\3\0\14\7\4\0"+
    "\14\7\12\0\50\7\2\0\5\7\13\0\54\7\4\0\32\7\6\0"+
    "\12\7\46\0\34\7\4\0\77\7\1\0\35\7\2\0\13\7\6\0"+
    "\12\7\15\0\1\7\130\0\114\7\4\0\12\7\21\0\11\7\14\0"+
    "\164\7\14\0\70\7\10\0\12\7\3\0\61\7\122\0\3\7\1\0"+
    "\43\7\11\0\347\7\25\0\u011a\7\2\0\6\7\2\0\46\7\2\0"+
    "\6\7\2\0\10\7\1\0\1\7\1\0\1\7\1\0\1\7\1\0"+
    "\37\7\2\0\65\7\1\0\7\7\1\0\1\7\3\0\3\7\1\0"+
    "\7\7\3\0\4\7\2\0\6\7\4\0\15\7\5\0\3\7\1\0"+
    "\7\7\16\0\5\7\30\0\1\73\1\73\5\7\20\0\2\7\23\0"+
    "\1\7\13\0\5\7\5\0\6\7\1\0\1\7\15\0\1\7\20\0"+
    "\15\7\3\0\33\7\25\0\15\7\4\0\1\7\3\0\14\7\21\0"+
    "\1\7\4\0\1\7\2\0\12\7\1\0\1\7\3\0\5\7\6\0"+
    "\1\7\1\0\1\7\1\0\1\7\1\0\4\7\1\0\13\7\2\0"+
    "\4\7\5\0\5\7\4\0\1\7\21\0\51\7\u0a77\0\57\7\1\0"+
    "\57\7\1\0\205\7\6\0\11\7\14\0\46\7\1\0\1\7\5\0"+
    "\1\7\2\0\70\7\7\0\1\7\17\0\30\7\11\0\7\7\1\0"+
    "\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0\7\7\1\0"+
    "\7\7\1\0\7\7\1\0\40\7\57\0\1\7\u01d5\0\3\7\31\0"+
    "\17\7\1\0\5\7\2\0\5\7\4\0\126\7\2\0\2\7\2\0"+
    "\3\7\1\0\132\7\1\0\4\7\5\0\51\7\3\0\136\7\21\0"+
    "\33\7\65\0\20\7\u0200\0\u19b6\7\112\0\u51cd\7\63\0\u048d\7\103\0"+
    "\56\7\2\0\u010d\7\3\0\34\7\24\0\60\7\4\0\12\7\1\0"+
    "\31\7\7\0\123\7\45\0\11\7\2\0\147\7\2\0\4\7\1\0"+
    "\4\7\14\0\13\7\115\0\60\7\20\0\1\7\7\0\64\7\14\0"+
    "\105\7\13\0\12\7\6\0\30\7\3\0\1\7\4\0\56\7\2\0"+
    "\44\7\14\0\35\7\3\0\101\7\16\0\13\7\46\0\67\7\11\0"+
    "\16\7\2\0\12\7\6\0\27\7\3\0\2\7\4\0\103\7\30\0"+
    "\3\7\2\0\20\7\2\0\5\7\12\0\6\7\2\0\6\7\2\0"+
    "\6\7\11\0\7\7\1\0\7\7\221\0\53\7\1\0\2\7\2\0"+
    "\12\7\6\0\u2ba4\7\14\0\27\7\4\0\61\7\u2104\0\u016e\7\2\0"+
    "\152\7\46\0\7\7\14\0\5\7\5\0\14\7\1\0\15\7\1\0"+
    "\5\7\1\0\1\7\1\0\2\7\1\0\2\7\1\0\154\7\41\0"+
    "\u016b\7\22\0\100\7\2\0\66\7\50\0\15\7\3\0\20\7\20\0"+
    "\7\7\14\0\2\7\30\0\3\7\31\0\1\7\6\0\5\7\1\0"+
    "\207\7\2\0\1\7\4\0\1\7\13\0\12\7\7\0\32\7\4\0"+
    "\1\7\1\0\32\7\13\0\131\7\3\0\6\7\2\0\6\7\2\0"+
    "\6\7\2\0\3\7\3\0\2\7\3\0\2\7\22\0\3\7\4\0"+
    "\14\7\1\0\32\7\1\0\23\7\1\0\2\7\1\0\17\7\2\0"+
    "\16\7\42\0\173\7\105\0\65\7\210\0\1\7\202\0\35\7\3\0"+
    "\61\7\57\0\37\7\21\0\33\7\65\0\36\7\2\0\44\7\4\0"+
    "\10\7\1\0\5\7\52\0\236\7\2\0\12\7\u0356\0\6\7\2\0"+
    "\1\7\1\0\54\7\1\0\2\7\3\0\1\7\2\0\27\7\252\0"+
    "\26\7\12\0\32\7\106\0\70\7\6\0\2\7\100\0\4\7\1\0"+
    "\2\7\5\0\10\7\1\0\3\7\1\0\33\7\4\0\3\7\4\0"+
    "\1\7\40\0\35\7\203\0\66\7\12\0\26\7\12\0\23\7\215\0"+
    "\111\7\u03b7\0\107\7\37\0\12\7\20\0\73\7\2\0\1\7\22\0"+
    "\31\7\7\0\12\7\6\0\65\7\1\0\12\7\100\0\105\7\13\0"+
    "\12\7\u04a6\0\70\7\10\0\12\7\u0936\0\u036f\7\221\0\143\7\u0b9d\0"+
    "\u042f\7\u33d1\0\u0239\7\u04c7\0\105\7\13\0\57\7\20\0\21\7\u4060\0"+
    "\2\7\u2163\0\5\7\3\0\26\7\2\0\7\7\36\0\4\7\224\0"+
    "\3\7\u01bb\0\125\7\1\0\107\7\1\0\2\7\2\0\1\7\2\0"+
    "\2\7\2\0\4\7\1\0\14\7\1\0\1\7\1\0\7\7\1\0"+
    "\101\7\1\0\4\7\2\0\10\7\1\0\7\7\1\0\34\7\1\0"+
    "\4\7\1\0\5\7\1\0\1\7\3\0\7\7\1\0\u0154\7\2\0"+
    "\31\7\1\0\31\7\1\0\37\7\1\0\31\7\1\0\37\7\1\0"+
    "\31\7\1\0\37\7\1\0\31\7\1\0\37\7\1\0\31\7\1\0"+
    "\10\7\2\0\62\7\u1600\0\4\7\1\0\33\7\1\0\2\7\1\0"+
    "\1\7\2\0\1\7\1\0\12\7\1\0\4\7\1\0\1\7\1\0"+
    "\1\7\6\0\1\7\4\0\1\7\1\0\1\7\1\0\1\7\1\0"+
    "\3\7\1\0\2\7\1\0\1\7\2\0\1\7\1\0\1\7\1\0"+
    "\1\7\1\0\1\7\1\0\1\7\1\0\2\7\1\0\1\7\2\0"+
    "\4\7\1\0\7\7\1\0\4\7\1\0\4\7\1\0\1\7\1\0"+
    "\12\7\1\0\21\7\5\0\3\7\1\0\5\7\1\0\21\7\u1144\0"+
    "\ua6d7\7\51\0\u1035\7\13\0\336\7\u3fe2\0\u021e\7\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\7\36\0\140\7\200\0\360\7\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\2\3\1\4\2\5\1\6\1\3"+
    "\1\7\20\4\2\6\6\3\2\1\1\10\1\1\1\11"+
    "\1\1\1\2\1\0\1\12\1\0\1\5\1\0\1\13"+
    "\24\4\2\14\6\4\6\0\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\2\0\1\12\1\26"+
    "\1\13\1\0\17\4\1\3\16\4\12\0\1\26\1\13"+
    "\1\0\2\4\1\27\5\4\1\30\10\4\11\0\10\4"+
    "\7\0\2\4\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\76\0\174\0\272\0\370\0\272\0\u0136\0\272"+
    "\0\u0174\0\u01b2\0\u01f0\0\u022e\0\u026c\0\272\0\u02aa\0\u02e8"+
    "\0\u0326\0\u0364\0\u03a2\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8"+
    "\0\u0516\0\u0554\0\u0592\0\u05d0\0\u060e\0\u064c\0\u068a\0\272"+
    "\0\u06c8\0\u0706\0\u0744\0\u0782\0\u07c0\0\u07fe\0\u083c\0\u087a"+
    "\0\u08b8\0\u08f6\0\272\0\u0934\0\u0972\0\u09b0\0\u09ee\0\u0a2c"+
    "\0\272\0\u0a6a\0\u0aa8\0\u0ae6\0\u0b24\0\u0b62\0\u0ba0\0\u0bde"+
    "\0\u0c1c\0\u0c5a\0\u0c98\0\u0cd6\0\u0d14\0\u0d52\0\u0d90\0\u0dce"+
    "\0\u0e0c\0\u0e4a\0\u0e88\0\u0ec6\0\u0f04\0\u0f42\0\u0f80\0\u0174"+
    "\0\u0fbe\0\u0ffc\0\u103a\0\u1078\0\u10b6\0\u10f4\0\u1132\0\u1170"+
    "\0\u11ae\0\u11ec\0\u122a\0\u1268\0\u12a6\0\u12e4\0\272\0\272"+
    "\0\272\0\272\0\272\0\272\0\272\0\272\0\u1322\0\u1360"+
    "\0\272\0\u139e\0\272\0\u13dc\0\u141a\0\u1458\0\u1496\0\u14d4"+
    "\0\u1512\0\u1550\0\u158e\0\u15cc\0\u160a\0\u1648\0\u1686\0\u16c4"+
    "\0\u1702\0\u1740\0\u177e\0\u0174\0\u17bc\0\u17fa\0\u1838\0\u1876"+
    "\0\u18b4\0\u18f2\0\u1930\0\u196e\0\u19ac\0\u19ea\0\u1a28\0\u1a66"+
    "\0\u1aa4\0\u1ae2\0\u1b20\0\u1b5e\0\u1b9c\0\u1bda\0\u1c18\0\u1c56"+
    "\0\u1c94\0\u1cd2\0\u1d10\0\u1d4e\0\272\0\u1d8c\0\u1dca\0\u1e08"+
    "\0\u1e46\0\u0174\0\u1e84\0\u1ec2\0\u1f00\0\u1f3e\0\u1f7c\0\u0174"+
    "\0\u1fba\0\u1ff8\0\u2036\0\u2074\0\u20b2\0\u20f0\0\u212e\0\u216c"+
    "\0\u21aa\0\u21e8\0\u2226\0\u2264\0\u22a2\0\u22e0\0\u231e\0\u235c"+
    "\0\u239a\0\u23d8\0\u2416\0\u2454\0\u2492\0\u24d0\0\u250e\0\u254c"+
    "\0\u258a\0\u25c8\0\u2606\0\u2644\0\u2682\0\u26c0\0\u26fe\0\u273c"+
    "\0\u277a\0\u27b8\0\u27f6\0\u2834\0\u2872";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\2\6\1\7\1\10\1\11\1\4\1\12"+
    "\1\13\3\11\1\13\1\11\1\14\1\11\1\15\1\16"+
    "\2\4\1\17\1\20\1\21\1\11\1\22\1\23\1\24"+
    "\1\11\1\25\1\26\1\11\1\27\1\30\1\31\1\32"+
    "\1\33\2\11\1\34\1\11\1\35\2\11\1\36\1\37"+
    "\2\40\1\41\1\42\1\43\1\44\1\41\1\45\1\46"+
    "\1\10\1\47\1\50\1\4\1\0\1\6\1\0\1\51"+
    "\1\52\1\4\17\51\1\53\1\51\1\54\51\51\1\4"+
    "\2\0\70\4\103\0\1\6\77\0\1\55\1\56\76\0"+
    "\11\11\1\0\1\11\4\0\30\11\20\0\1\11\10\0"+
    "\1\57\1\60\1\61\1\62\1\0\1\57\1\0\1\63"+
    "\15\0\1\61\10\0\1\62\37\0\2\13\1\61\2\0"+
    "\1\13\1\0\1\63\15\0\1\61\50\0\2\63\3\0"+
    "\1\63\101\0\1\10\36\0\1\10\2\0\1\10\20\0"+
    "\11\11\1\0\1\11\4\0\1\11\1\64\26\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\13\11\1\65"+
    "\14\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\5\11\1\66\17\11\1\67\2\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\3\11\1\70\1\11\1\71"+
    "\22\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\6\11\1\72\21\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\10\11\1\73\2\11\1\74\5\11\1\75"+
    "\6\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\3\11\1\76\24\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\3\11\1\77\6\11\1\100\15\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\1\11\1\101"+
    "\4\11\1\102\21\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\2\11\1\103\7\11\1\104\2\11\1\105"+
    "\6\11\1\106\3\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\13\11\1\107\3\11\1\110\10\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\3\11\1\111"+
    "\2\11\1\112\21\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\1\113\2\11\1\114\4\11\1\115\17\11"+
    "\20\0\1\11\6\0\11\11\1\0\1\11\4\0\3\11"+
    "\1\64\24\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\12\11\1\116\15\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\3\11\1\117\24\11\20\0\1\11"+
    "\27\0\1\120\126\0\1\10\75\0\2\10\74\0\1\10"+
    "\1\0\1\41\73\0\1\10\2\0\1\41\72\0\1\10"+
    "\4\0\1\10\70\0\1\10\5\0\1\10\35\0\1\121"+
    "\4\0\1\122\6\0\1\123\1\124\7\0\1\125\114\0"+
    "\1\10\3\0\1\51\2\0\17\51\1\0\1\51\1\0"+
    "\51\51\2\0\1\4\73\0\1\4\2\0\5\4\1\126"+
    "\4\4\1\126\4\4\1\127\1\130\1\131\2\4\1\132"+
    "\1\4\1\133\1\134\5\4\1\135\3\4\1\136\26\4"+
    "\3\0\1\55\1\5\1\6\73\55\5\137\1\140\70\137"+
    "\10\0\1\57\1\60\1\141\2\0\1\57\1\0\1\63"+
    "\15\0\1\141\50\0\2\60\3\0\1\60\1\0\1\63"+
    "\66\0\2\142\2\0\3\142\1\0\1\142\4\0\1\142"+
    "\3\0\1\142\1\0\1\142\2\0\1\142\4\0\2\142"+
    "\41\0\2\63\3\0\1\63\1\143\1\0\1\144\12\0"+
    "\1\144\10\0\1\143\37\0\11\11\1\0\1\11\4\0"+
    "\2\11\1\145\25\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\14\11\1\146\1\147\12\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\1\11\1\150\26\11"+
    "\20\0\1\11\6\0\11\11\1\0\1\11\4\0\26\11"+
    "\1\151\1\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\3\11\1\152\24\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\6\11\1\153\21\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\2\11\1\154\17\11"+
    "\1\155\5\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\14\11\1\156\13\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\1\11\1\157\26\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\2\11\1\160\25\11"+
    "\20\0\1\11\6\0\11\11\1\0\1\11\4\0\13\11"+
    "\1\161\14\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\13\11\1\162\14\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\1\114\27\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\10\11\1\163\17\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\24\11\1\164"+
    "\3\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\1\165\4\11\1\166\22\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\3\11\1\167\24\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\22\11\1\170\1\171"+
    "\4\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\15\11\1\172\12\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\2\11\1\110\25\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\1\11\1\173\26\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\10\11\1\174"+
    "\6\11\1\175\10\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\10\11\1\176\17\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\5\11\1\110\22\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\3\11\1\177"+
    "\24\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\15\11\1\200\12\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\10\11\1\201\4\11\1\202\12\11\20\0"+
    "\1\11\52\0\1\203\63\0\1\204\67\0\1\205\2\0"+
    "\1\206\2\0\1\207\75\0\1\210\3\0\1\204\1\211"+
    "\63\0\1\212\74\0\1\213\53\0\1\126\4\0\1\126"+
    "\60\0\5\137\1\214\70\137\4\0\1\6\1\140\100\0"+
    "\2\142\1\215\1\0\3\142\1\0\1\142\4\0\1\142"+
    "\3\0\1\142\1\0\1\142\1\0\1\215\1\142\4\0"+
    "\2\142\41\0\2\216\3\0\1\216\3\0\1\217\37\0"+
    "\1\217\22\0\11\11\1\0\1\11\4\0\3\11\1\110"+
    "\24\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\15\11\1\220\12\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\3\11\1\221\24\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\6\11\1\222\21\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\6\11\1\223"+
    "\21\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\10\11\1\110\17\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\1\224\27\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\1\11\1\225\26\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\15\11\1\226\12\11"+
    "\20\0\1\11\6\0\11\11\1\0\1\11\4\0\6\11"+
    "\1\110\21\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\20\11\1\110\7\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\6\11\1\225\21\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\22\11\1\110\5\11"+
    "\20\0\1\11\6\0\11\11\1\0\1\11\4\0\2\11"+
    "\1\227\11\11\1\107\13\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\10\11\1\230\17\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\2\11\1\231\25\11"+
    "\20\0\1\11\6\0\11\11\1\0\1\11\4\0\1\11"+
    "\1\232\26\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\5\11\1\107\22\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\13\11\1\233\14\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\6\11\1\234\21\11"+
    "\20\0\1\11\6\0\11\11\1\0\1\11\4\0\2\11"+
    "\1\235\25\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\4\11\1\200\23\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\6\11\1\236\21\11\20\0\1\11"+
    "\6\0\11\11\1\0\1\11\4\0\1\237\27\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\14\11\1\150"+
    "\13\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\1\107\27\11\20\0\1\11\6\0\11\11\1\0\1\11"+
    "\4\0\10\11\1\156\17\11\20\0\1\11\6\0\11\11"+
    "\1\0\1\11\4\0\1\240\27\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\16\11\1\110\11\11\20\0"+
    "\1\11\53\0\1\241\65\0\1\242\64\0\1\243\104\0"+
    "\1\244\77\0\1\245\70\0\1\246\112\0\1\247\66\0"+
    "\1\250\56\0\1\251\50\0\4\137\1\6\1\214\70\137"+
    "\10\0\2\216\3\0\1\216\1\143\25\0\1\143\41\0"+
    "\2\216\3\0\1\216\66\0\11\11\1\0\1\11\4\0"+
    "\22\11\1\170\5\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\13\11\1\110\14\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\16\11\1\252\11\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\7\11\1\110"+
    "\20\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\5\11\1\221\22\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\14\11\1\253\13\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\15\11\1\254\12\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\15\11\1\255"+
    "\12\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\11\11\1\107\16\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\6\11\1\202\21\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\3\11\1\256\24\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\11\11\1\257"+
    "\16\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\2\11\1\260\25\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\1\11\1\261\26\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\2\11\1\116\25\11\20\0"+
    "\1\11\33\0\1\262\75\0\1\263\72\0\1\264\100\0"+
    "\1\10\104\0\1\263\70\0\1\265\70\0\1\266\107\0"+
    "\1\267\102\0\1\270\34\0\11\11\1\0\1\11\4\0"+
    "\6\11\1\256\21\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\2\11\1\271\25\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\13\11\1\272\14\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\11\11\1\110"+
    "\16\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\17\11\1\110\10\11\20\0\1\11\6\0\11\11\1\0"+
    "\1\11\4\0\12\11\1\110\15\11\20\0\1\11\6\0"+
    "\11\11\1\0\1\11\4\0\6\11\1\164\21\11\20\0"+
    "\1\11\6\0\11\11\1\0\1\11\4\0\10\11\1\107"+
    "\17\11\20\0\1\11\56\0\1\10\63\0\1\10\63\0"+
    "\1\10\71\0\1\273\101\0\1\274\103\0\1\244\102\0"+
    "\1\275\36\0\11\11\1\0\1\11\4\0\6\11\1\114"+
    "\21\11\20\0\1\11\6\0\11\11\1\0\1\11\4\0"+
    "\1\11\1\156\26\11\20\0\1\11\43\0\1\244\61\0"+
    "\1\10\73\0\1\10\50\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10416];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\1\1\1\11\1\1\1\11\5\1\1\11"+
    "\21\1\1\11\12\1\1\11\2\1\1\0\1\1\1\0"+
    "\1\11\1\0\35\1\6\0\1\1\10\11\2\0\1\11"+
    "\1\1\1\11\1\0\36\1\12\0\1\11\1\1\1\0"+
    "\21\1\11\0\10\1\7\0\2\1\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2534) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { contErrores++; return ERROR;
            }
          case 25: break;
          case 2: 
            { /* ignorar */
            }
          case 26: break;
          case 3: 
            { contOperadores++; lexeme=yytext(); linea=yyline; columna=yycolumn; return OPERADOR;
            }
          case 27: break;
          case 4: 
            { linea = yyline + 1; contIdentificadores++; lineaIdentificador = lineaIdentificador + ", " + linea; lexeme=yytext(); linea=yyline; columna=yycolumn; return IDENTIFICADOR;
            }
          case 28: break;
          case 5: 
            { contLiteralesDecimales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALDECIMAL;
            }
          case 29: break;
          case 6: 
            { contSeparadores++; lexeme=yytext(); linea=yyline; columna=yycolumn; return SEPARADOR;
            }
          case 30: break;
          case 7: 
            { yybegin(STRING); string.setLength(0);
            }
          case 31: break;
          case 8: 
            { string.append( yytext() );
            }
          case 32: break;
          case 9: 
            { yybegin(YYINITIAL); contLiteralesString++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALSTRING;
            }
          case 33: break;
          case 10: 
            { contLiteralesOctales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALOCTAL;
            }
          case 34: break;
          case 11: 
            { contLiteralesPtoFlotantes++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALPTOFLOTANTE;
            }
          case 35: break;
          case 12: 
            { lexeme=yytext(); linea=yyline; columna=yycolumn; return RESERVADA;
            }
          case 36: break;
          case 13: 
            { char val = (char) Integer.parseInt(yytext().substring(1),8);
                        				   string.append( val );
            }
          case 37: break;
          case 14: 
            { string.append( '\"' );
            }
          case 38: break;
          case 15: 
            { string.append( '\'' );
            }
          case 39: break;
          case 16: 
            { string.append( '\\' );
            }
          case 40: break;
          case 17: 
            { string.append( '\t' );
            }
          case 41: break;
          case 18: 
            { string.append( '\b' );
            }
          case 42: break;
          case 19: 
            { string.append( '\r' );
            }
          case 43: break;
          case 20: 
            { string.append( '\n' );
            }
          case 44: break;
          case 21: 
            { string.append( '\f' );
            }
          case 45: break;
          case 22: 
            { contLiteralesHexadecimales++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALHEXADECIMAL;
            }
          case 46: break;
          case 23: 
            { contLiteralesBooleanos++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALBOOLEANO;
            }
          case 47: break;
          case 24: 
            { contLiteralesNull++; lexeme=yytext(); linea=yyline; columna=yycolumn; return LITERALNULL;
            }
          case 48: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

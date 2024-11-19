// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: csxx.l

package lex;

import errors.GestionErroresTiny;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class AnalizadorLexicoTiny implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\2\1\1\2\2\0\1\1\22\0\1\1\1\3"+
    "\1\4\2\0\1\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\25\1\27\1\25\1\0"+
    "\1\30\1\31\1\32\1\33\2\0\1\34\1\35\1\36"+
    "\1\37\1\35\1\40\16\41\1\42\4\41\1\43\1\44"+
    "\1\45\1\46\1\47\1\41\1\0\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\2\41\1\56\1\57\1\41\1\60"+
    "\1\61\1\62\1\63\1\64\1\41\1\65\1\66\1\67"+
    "\1\70\1\71\1\41\1\72\2\41\1\73\1\74\1\75"+
    "\1\76\u0181\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\0\1\3\1\4\1\0\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\15\22\1\26\1\27\1\30\1\31\1\32\1\33\1\0"+
    "\1\34\2\0\1\35\2\36\1\37\1\40\1\0\1\1"+
    "\3\0\1\41\1\42\1\43\21\22\1\44\1\45\1\0"+
    "\1\46\1\47\1\50\12\22\1\51\7\22\1\0\1\52"+
    "\13\22\1\53\2\22\1\54\1\55\3\22\1\1\3\22"+
    "\1\56\1\22\1\57\2\22\1\60\1\61\1\62\10\22"+
    "\1\63\1\64\5\22\1\65\1\66\1\22\1\67\1\70"+
    "\4\22\1\71\1\72\3\22\1\73\1\74\1\75\4\22"+
    "\1\76\1\22\1\77\3\22\1\100\1\101";

  private static int [] zzUnpackAction() {
    int [] result = new int[179];
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
    "\0\0\0\77\0\176\0\275\0\77\0\374\0\u013b\0\77"+
    "\0\77\0\77\0\u017a\0\77\0\u01b9\0\77\0\u01f8\0\u0237"+
    "\0\u0276\0\77\0\u02b5\0\u02f4\0\u0333\0\u0372\0\77\0\77"+
    "\0\77\0\u03b1\0\u03f0\0\u042f\0\u046e\0\u04ad\0\u04ec\0\u052b"+
    "\0\u056a\0\u05a9\0\u05e8\0\u0627\0\u0666\0\u06a5\0\77\0\u06e4"+
    "\0\77\0\77\0\77\0\77\0\u0723\0\77\0\u0762\0\u07a1"+
    "\0\77\0\u0237\0\u07e0\0\77\0\77\0\u081f\0\u085e\0\u089d"+
    "\0\u08dc\0\u091b\0\77\0\77\0\77\0\u095a\0\u0999\0\u09d8"+
    "\0\u0a17\0\u0a56\0\u0a95\0\u0ad4\0\u0b13\0\u0b52\0\u0b91\0\u0bd0"+
    "\0\u0c0f\0\u0c4e\0\u0c8d\0\u0ccc\0\u0d0b\0\u0d4a\0\77\0\77"+
    "\0\u0d89\0\u089d\0\u08dc\0\u091b\0\u0dc8\0\u0e07\0\u0e46\0\u0e85"+
    "\0\u0ec4\0\u0f03\0\u0f42\0\u0f81\0\u0fc0\0\u0fff\0\u0372\0\u103e"+
    "\0\u107d\0\u10bc\0\u10fb\0\u113a\0\u1179\0\u11b8\0\u11f7\0\u0372"+
    "\0\u1236\0\u1275\0\u12b4\0\u12f3\0\u1332\0\u1371\0\u13b0\0\u13ef"+
    "\0\u142e\0\u146d\0\u14ac\0\u0372\0\u14eb\0\u152a\0\u0372\0\u0372"+
    "\0\u1569\0\u15a8\0\u15e7\0\u081f\0\u1626\0\u1665\0\u16a4\0\u0372"+
    "\0\u16e3\0\u0372\0\u1722\0\u1761\0\u0372\0\u0372\0\u0372\0\u17a0"+
    "\0\u17df\0\u181e\0\u185d\0\u189c\0\u18db\0\u191a\0\u1959\0\u0372"+
    "\0\u0372\0\u1998\0\u19d7\0\u1a16\0\u1a55\0\u1a94\0\u0372\0\u0372"+
    "\0\u1ad3\0\u0372\0\u0372\0\u1b12\0\u1b51\0\u1b90\0\u1bcf\0\u0372"+
    "\0\u0372\0\u1c0e\0\u1c4d\0\u1c8c\0\u0372\0\u0372\0\u0372\0\u1ccb"+
    "\0\u1d0a\0\u1d49\0\u1d88\0\u0372\0\u1dc7\0\u0372\0\u1e06\0\u1e45"+
    "\0\u1e84\0\u0372\0\u0372";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[179];
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
    "\1\0\2\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\7\21\1\22\1\23\1\24\1\25\10\26\1\27\1\0"+
    "\1\30\1\31\1\26\1\32\1\33\1\26\1\34\1\35"+
    "\1\36\1\26\1\37\1\40\1\41\1\26\1\42\1\26"+
    "\1\43\1\44\1\45\1\46\1\26\1\47\1\50\1\51"+
    "\1\52\131\0\1\53\44\0\4\4\1\54\40\4\1\55"+
    "\31\4\6\0\1\56\70\0\7\57\1\0\35\57\1\60"+
    "\31\57\13\0\1\61\4\0\1\62\7\63\64\0\1\64"+
    "\2\0\1\62\7\63\3\0\1\65\55\0\1\66\4\0"+
    "\1\67\75\0\1\70\32\0\1\71\20\0\1\72\22\0"+
    "\1\70\1\0\10\21\101\0\1\73\76\0\1\74\76\0"+
    "\1\75\64\0\10\26\4\0\10\26\4\0\23\26\24\0"+
    "\10\26\4\0\10\26\4\0\20\26\1\76\2\26\24\0"+
    "\10\26\4\0\10\26\4\0\13\26\1\77\7\26\24\0"+
    "\10\26\4\0\10\26\4\0\12\26\1\100\10\26\24\0"+
    "\10\26\4\0\10\26\4\0\1\101\17\26\1\102\2\26"+
    "\24\0\10\26\4\0\10\26\4\0\12\26\1\103\10\26"+
    "\24\0\10\26\4\0\10\26\4\0\10\26\1\104\12\26"+
    "\24\0\10\26\4\0\10\26\4\0\4\26\1\105\16\26"+
    "\24\0\10\26\4\0\10\26\4\0\1\106\22\26\24\0"+
    "\10\26\4\0\10\26\4\0\4\26\1\107\13\26\1\110"+
    "\2\26\24\0\10\26\4\0\10\26\4\0\4\26\1\111"+
    "\1\26\1\112\14\26\24\0\10\26\4\0\10\26\4\0"+
    "\15\26\1\113\5\26\24\0\10\26\4\0\10\26\4\0"+
    "\10\26\1\114\1\26\1\115\10\26\24\0\10\26\4\0"+
    "\10\26\4\0\13\26\1\116\7\26\100\0\1\117\6\0"+
    "\1\4\40\0\1\4\3\0\1\4\3\0\1\4\4\0"+
    "\1\4\2\0\1\4\1\0\1\4\16\0\1\120\76\0"+
    "\1\57\35\0\1\57\3\0\1\57\3\0\1\57\4\0"+
    "\1\57\2\0\1\57\1\0\1\57\25\0\1\70\1\0"+
    "\10\63\47\0\12\66\1\121\64\66\2\67\1\0\5\67"+
    "\2\0\5\67\1\0\54\67\1\0\2\67\20\0\10\122"+
    "\67\0\2\123\75\0\10\124\4\0\5\124\7\0\6\124"+
    "\41\0\10\26\4\0\10\26\4\0\6\26\1\125\14\26"+
    "\24\0\10\26\4\0\10\26\4\0\12\26\1\126\10\26"+
    "\24\0\10\26\4\0\1\127\1\26\1\130\5\26\4\0"+
    "\23\26\24\0\10\26\4\0\10\26\4\0\10\26\1\131"+
    "\12\26\24\0\10\26\4\0\10\26\4\0\12\26\1\132"+
    "\10\26\24\0\10\26\4\0\10\26\4\0\3\26\1\133"+
    "\17\26\24\0\10\26\4\0\10\26\4\0\4\26\1\134"+
    "\16\26\24\0\10\26\4\0\10\26\4\0\12\26\1\135"+
    "\10\26\24\0\10\26\4\0\10\26\4\0\17\26\1\136"+
    "\3\26\24\0\10\26\4\0\10\26\4\0\15\26\1\137"+
    "\5\26\24\0\10\26\4\0\10\26\4\0\12\26\1\140"+
    "\10\26\24\0\10\26\4\0\10\26\4\0\12\26\1\141"+
    "\10\26\24\0\10\26\4\0\10\26\4\0\12\26\1\142"+
    "\10\26\24\0\10\26\4\0\10\26\4\0\20\26\1\143"+
    "\2\26\24\0\10\26\4\0\10\26\4\0\10\26\1\144"+
    "\12\26\24\0\10\26\4\0\6\26\1\145\1\26\4\0"+
    "\23\26\24\0\10\26\4\0\10\26\4\0\10\26\1\146"+
    "\12\26\4\0\12\66\1\147\4\66\1\2\57\66\20\0"+
    "\10\26\4\0\10\26\4\0\17\26\1\150\3\26\24\0"+
    "\10\26\4\0\10\26\4\0\7\26\1\151\13\26\24\0"+
    "\10\26\4\0\10\26\4\0\10\26\1\152\12\26\24\0"+
    "\10\26\4\0\10\26\4\0\1\153\22\26\24\0\10\26"+
    "\4\0\10\26\4\0\16\26\1\154\4\26\24\0\10\26"+
    "\4\0\10\26\4\0\2\26\1\155\20\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\156\16\26\24\0\10\26"+
    "\4\0\10\26\4\0\17\26\1\157\3\26\24\0\10\26"+
    "\4\0\10\26\4\0\17\26\1\160\3\26\24\0\1\26"+
    "\1\161\1\26\1\162\2\26\1\163\1\164\4\0\10\26"+
    "\4\0\23\26\24\0\10\26\4\0\10\26\4\0\17\26"+
    "\1\165\3\26\24\0\10\26\4\0\10\26\4\0\2\26"+
    "\1\166\20\26\24\0\10\26\4\0\10\26\4\0\13\26"+
    "\1\167\7\26\24\0\10\26\4\0\10\26\4\0\4\26"+
    "\1\170\16\26\24\0\10\26\4\0\10\26\4\0\4\26"+
    "\1\171\16\26\24\0\10\26\4\0\10\26\4\0\13\26"+
    "\1\172\7\26\24\0\10\26\4\0\10\26\4\0\17\26"+
    "\1\173\3\26\4\0\12\66\1\147\4\66\1\174\57\66"+
    "\20\0\10\26\4\0\10\26\4\0\20\26\1\175\2\26"+
    "\24\0\10\26\4\0\10\26\4\0\17\26\1\176\3\26"+
    "\24\0\10\26\4\0\10\26\4\0\16\26\1\177\4\26"+
    "\24\0\10\26\4\0\10\26\4\0\4\26\1\200\16\26"+
    "\24\0\10\26\4\0\10\26\4\0\6\26\1\201\14\26"+
    "\24\0\10\26\4\0\10\26\4\0\22\26\1\202\24\0"+
    "\10\26\4\0\10\26\4\0\15\26\1\203\5\26\24\0"+
    "\10\26\4\0\10\26\4\0\15\26\1\204\5\26\24\0"+
    "\6\26\1\205\1\26\4\0\10\26\4\0\23\26\24\0"+
    "\2\26\1\206\5\26\4\0\10\26\4\0\23\26\24\0"+
    "\4\26\1\207\3\26\4\0\10\26\4\0\23\26\24\0"+
    "\10\26\4\0\4\26\1\210\3\26\4\0\23\26\24\0"+
    "\10\26\4\0\10\26\4\0\4\26\1\211\16\26\24\0"+
    "\10\26\4\0\10\26\4\0\17\26\1\212\3\26\24\0"+
    "\10\26\4\0\6\26\1\213\1\26\4\0\23\26\24\0"+
    "\10\26\4\0\10\26\4\0\4\26\1\214\16\26\24\0"+
    "\10\26\4\0\10\26\4\0\12\26\1\215\10\26\24\0"+
    "\10\26\4\0\10\26\4\0\15\26\1\216\5\26\24\0"+
    "\10\26\4\0\3\26\1\217\4\26\4\0\23\26\24\0"+
    "\10\26\4\0\10\26\4\0\13\26\1\220\7\26\24\0"+
    "\10\26\4\0\10\26\4\0\1\221\22\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\222\16\26\24\0\10\26"+
    "\4\0\10\26\4\0\10\26\1\223\12\26\24\0\10\26"+
    "\4\0\10\26\4\0\15\26\1\224\5\26\24\0\10\26"+
    "\4\0\10\26\4\0\15\26\1\225\5\26\24\0\10\26"+
    "\4\0\10\26\4\0\12\26\1\226\10\26\24\0\10\26"+
    "\4\0\10\26\4\0\16\26\1\227\4\26\24\0\10\26"+
    "\4\0\10\26\4\0\17\26\1\230\3\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\231\16\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\232\16\26\24\0\10\26"+
    "\4\0\10\26\4\0\16\26\1\233\4\26\24\0\10\26"+
    "\4\0\10\26\4\0\13\26\1\234\7\26\24\0\1\26"+
    "\1\235\1\26\1\236\2\26\1\237\1\240\4\0\10\26"+
    "\4\0\23\26\24\0\10\26\4\0\10\26\4\0\1\241"+
    "\22\26\24\0\10\26\4\0\7\26\1\242\4\0\23\26"+
    "\24\0\10\26\4\0\2\26\1\243\5\26\4\0\23\26"+
    "\24\0\10\26\4\0\10\26\4\0\17\26\1\244\3\26"+
    "\24\0\6\26\1\245\1\26\4\0\10\26\4\0\23\26"+
    "\24\0\2\26\1\246\5\26\4\0\10\26\4\0\23\26"+
    "\24\0\4\26\1\247\3\26\4\0\10\26\4\0\23\26"+
    "\24\0\10\26\4\0\10\26\4\0\4\26\1\250\16\26"+
    "\24\0\10\26\4\0\10\26\4\0\1\251\22\26\24\0"+
    "\10\26\4\0\10\26\4\0\1\252\22\26\24\0\10\26"+
    "\4\0\10\26\4\0\15\26\1\253\5\26\24\0\10\26"+
    "\4\0\10\26\4\0\16\26\1\254\4\26\24\0\10\26"+
    "\4\0\10\26\4\0\12\26\1\255\10\26\24\0\10\26"+
    "\4\0\10\26\4\0\13\26\1\256\7\26\24\0\10\26"+
    "\4\0\10\26\4\0\17\26\1\257\3\26\24\0\3\26"+
    "\1\260\2\26\1\261\1\26\4\0\10\26\4\0\23\26"+
    "\24\0\2\26\1\262\5\26\4\0\10\26\4\0\23\26"+
    "\24\0\4\26\1\263\3\26\4\0\10\26\4\0\23\26"+
    "\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7875];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\0\1\11\1\1\1\0\3\11"+
    "\1\1\1\11\1\1\1\11\3\1\1\11\4\1\3\11"+
    "\15\1\1\11\1\1\4\11\1\0\1\11\2\0\1\11"+
    "\2\1\2\11\1\0\1\1\3\0\3\11\21\1\2\11"+
    "\1\0\25\1\1\0\114\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[179];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
  private ALexOperations ops;
  private GestionErroresTiny errores;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public int columna() {return yycolumn+1;}
  public void fijaGestionErrores(GestionErroresTiny errores) {
   this.errores = errores;
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexicoTiny(java.io.Reader in) {
    ops = new ALexOperations(this);
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
          {   return ops.unidadEof();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 66: break;
          case 2:
            { return ops.bNot_token();
            }
            // fall through
          case 67: break;
          case 3:
            { return ops.mod_token();
            }
            // fall through
          case 68: break;
          case 4:
            { return ops.and_token();
            }
            // fall through
          case 69: break;
          case 5:
            { return ops.parenth_open_token();
            }
            // fall through
          case 70: break;
          case 6:
            { return ops.parenth_close_token();
            }
            // fall through
          case 71: break;
          case 7:
            { return ops.mult_token();
            }
            // fall through
          case 72: break;
          case 8:
            { return ops.add_token();
            }
            // fall through
          case 73: break;
          case 9:
            { return ops.coma_token();
            }
            // fall through
          case 74: break;
          case 10:
            { return ops.sub_token();
            }
            // fall through
          case 75: break;
          case 11:
            { return ops.dot_token();
            }
            // fall through
          case 76: break;
          case 12:
            { return ops.div_token();
            }
            // fall through
          case 77: break;
          case 13:
            { return ops.number_nat_token();
            }
            // fall through
          case 78: break;
          case 14:
            { return ops.semi_colon_token();
            }
            // fall through
          case 79: break;
          case 15:
            { return ops.lt_token();
            }
            // fall through
          case 80: break;
          case 16:
            { return ops.equals_token();
            }
            // fall through
          case 81: break;
          case 17:
            { return ops.gt_token();
            }
            // fall through
          case 82: break;
          case 18:
            { return ops.identificator_token();
            }
            // fall through
          case 83: break;
          case 19:
            { return ops.bracket_open_token();
            }
            // fall through
          case 84: break;
          case 20:
            { return ops.bracket_close_token();
            }
            // fall through
          case 85: break;
          case 21:
            { return ops.xor_token();
            }
            // fall through
          case 86: break;
          case 22:
            { return ops.curly_open_token();
            }
            // fall through
          case 87: break;
          case 23:
            { return ops.or_token();
            }
            // fall through
          case 88: break;
          case 24:
            { return ops.curly_close_token();
            }
            // fall through
          case 89: break;
          case 25:
            { return ops.not_token();
            }
            // fall through
          case 90: break;
          case 26:
            { return ops.neq_token();
            }
            // fall through
          case 91: break;
          case 27:
            { return ops.rval_char_arr_token();
            }
            // fall through
          case 92: break;
          case 28:
            { return ops.bAdd_token();
            }
            // fall through
          case 93: break;
          case 29:
            { return ops.pp_token();
            }
            // fall through
          case 94: break;
          case 30:
            { return ops.number_int_token();
            }
            // fall through
          case 95: break;
          case 31:
            { return ops.mm_token();
            }
            // fall through
          case 96: break;
          case 32:
            { return ops.type_ident_token();
            }
            // fall through
          case 97: break;
          case 33:
            { return ops.leq_token();
            }
            // fall through
          case 98: break;
          case 34:
            { return ops.equal_token();
            }
            // fall through
          case 99: break;
          case 35:
            { return ops.geq_token();
            }
            // fall through
          case 100: break;
          case 36:
            { return ops.bSub_token();
            }
            // fall through
          case 101: break;
          case 37:
            { return ops.rval_char_token();
            }
            // fall through
          case 102: break;
          case 38:
            { return ops.number_float_token();
            }
            // fall through
          case 103: break;
          case 39:
            { return ops.number_bin_token();
            }
            // fall through
          case 104: break;
          case 40:
            { return ops.number_hex_token();
            }
            // fall through
          case 105: break;
          case 41:
            { return ops.for_token();
            }
            // fall through
          case 106: break;
          case 42:
            { return ops.void_token();
            }
            // fall through
          case 107: break;
          case 43:
            { return ops.uint8_token();
            }
            // fall through
          case 108: break;
          case 44:
            { return ops.else_token();
            }
            // fall through
          case 109: break;
          case 45:
            { return ops.true_token();
            }
            // fall through
          case 110: break;
          case 46:
            { return ops.false_token();
            }
            // fall through
          case 111: break;
          case 47:
            { return ops.cursor_token();
            }
            // fall through
          case 112: break;
          case 48:
            { return ops.uint16_token();
            }
            // fall through
          case 113: break;
          case 49:
            { return ops.uint32_token();
            }
            // fall through
          case 114: break;
          case 50:
            { return ops.uint64_token();
            }
            // fall through
          case 115: break;
          case 51:
            { return ops.function_token();
            }
            // fall through
          case 116: break;
          case 52:
            { return ops.char_token();
            }
            // fall through
          case 117: break;
          case 53:
            { return ops.loop_token();
            }
            // fall through
          case 118: break;
          case 54:
            { return ops.struct_token();
            }
            // fall through
          case 119: break;
          case 55:
            { return ops.if_token();
            }
            // fall through
          case 120: break;
          case 56:
            { return ops.while_token();
            }
            // fall through
          case 121: break;
          case 57:
            { return ops.int8_token();
            }
            // fall through
          case 122: break;
          case 58:
            { return ops.uchar_token();
            }
            // fall through
          case 123: break;
          case 59:
            { return ops.int16_token();
            }
            // fall through
          case 124: break;
          case 60:
            { return ops.int32_token();
            }
            // fall through
          case 125: break;
          case 61:
            { return ops.int64_token();
            }
            // fall through
          case 126: break;
          case 62:
            { return ops.elseif_token();
            }
            // fall through
          case 127: break;
          case 63:
            { return ops.bool_token();
            }
            // fall through
          case 128: break;
          case 64:
            { return ops.float32_token();
            }
            // fall through
          case 129: break;
          case 65:
            { return ops.float64_token();
            }
            // fall through
          case 130: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

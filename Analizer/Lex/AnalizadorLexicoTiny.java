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
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\41"+
    "\1\62\1\63\1\64\1\65\1\66\1\41\1\67\1\70"+
    "\1\71\1\72\1\73\1\41\1\74\1\75\1\41\1\76"+
    "\1\77\1\100\1\101\u0181\0";

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
    "\1\41\2\0\1\42\1\43\1\44\14\22\1\45\4\22"+
    "\1\46\4\22\1\47\1\50\1\0\1\41\1\51\1\52"+
    "\1\53\11\22\1\54\4\22\1\55\7\22\1\0\1\56"+
    "\1\57\12\22\1\60\4\22\1\61\3\22\1\62\3\22"+
    "\1\1\3\22\1\63\1\22\1\64\1\65\1\54\2\22"+
    "\1\66\1\67\1\70\10\22\1\71\1\72\5\22\1\73"+
    "\1\74\1\22\1\75\1\76\4\22\1\77\1\100\3\22"+
    "\1\101\1\102\1\103\4\22\1\104\1\22\1\105\3\22"+
    "\1\106\1\107";

  private static int [] zzUnpackAction() {
    int [] result = new int[196];
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
    "\0\0\0\102\0\204\0\306\0\102\0\u0108\0\u014a\0\102"+
    "\0\102\0\102\0\u018c\0\102\0\u01ce\0\102\0\u0210\0\u0252"+
    "\0\u0294\0\102\0\u02d6\0\u0318\0\u035a\0\u039c\0\102\0\102"+
    "\0\102\0\u03de\0\u0420\0\u0462\0\u04a4\0\u04e6\0\u0528\0\u056a"+
    "\0\u05ac\0\u05ee\0\u0630\0\u0672\0\u06b4\0\u06f6\0\102\0\u0738"+
    "\0\102\0\102\0\102\0\102\0\u077a\0\102\0\u07bc\0\u07fe"+
    "\0\102\0\u0252\0\u0840\0\102\0\102\0\u0882\0\u08c4\0\u0906"+
    "\0\u0948\0\u098a\0\102\0\102\0\102\0\u09cc\0\u0a0e\0\u0a50"+
    "\0\u0a92\0\u0ad4\0\u0b16\0\u0b58\0\u0b9a\0\u0bdc\0\u0c1e\0\u0c60"+
    "\0\u0ca2\0\u039c\0\u0ce4\0\u0d26\0\u0d68\0\u0daa\0\u039c\0\u0dec"+
    "\0\u0e2e\0\u0e70\0\u0eb2\0\102\0\102\0\u0ef4\0\u0f36\0\u0906"+
    "\0\u0948\0\u098a\0\u0f78\0\u0fba\0\u0ffc\0\u103e\0\u1080\0\u10c2"+
    "\0\u1104\0\u1146\0\u1188\0\u11ca\0\u120c\0\u124e\0\u1290\0\u12d2"+
    "\0\u039c\0\u1314\0\u1356\0\u1398\0\u13da\0\u141c\0\u145e\0\u14a0"+
    "\0\u14e2\0\u039c\0\u039c\0\u1524\0\u1566\0\u15a8\0\u15ea\0\u162c"+
    "\0\u166e\0\u16b0\0\u16f2\0\u1734\0\u1776\0\u039c\0\u17b8\0\u17fa"+
    "\0\u183c\0\u187e\0\u039c\0\u18c0\0\u1902\0\u1944\0\u039c\0\u1986"+
    "\0\u19c8\0\u1a0a\0\u0882\0\u1a4c\0\u1a8e\0\u1ad0\0\u039c\0\u1b12"+
    "\0\u039c\0\u039c\0\u039c\0\u1b54\0\u1b96\0\u039c\0\u039c\0\u039c"+
    "\0\u1bd8\0\u1c1a\0\u1c5c\0\u1c9e\0\u1ce0\0\u1d22\0\u1d64\0\u1da6"+
    "\0\u039c\0\u039c\0\u1de8\0\u1e2a\0\u1e6c\0\u1eae\0\u1ef0\0\u039c"+
    "\0\u039c\0\u1f32\0\u039c\0\u039c\0\u1f74\0\u1fb6\0\u1ff8\0\u203a"+
    "\0\u039c\0\u039c\0\u207c\0\u20be\0\u2100\0\u039c\0\u039c\0\u039c"+
    "\0\u2142\0\u2184\0\u21c6\0\u2208\0\u039c\0\u224a\0\u039c\0\u228c"+
    "\0\u22ce\0\u2310\0\u039c\0\u039c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[196];
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
    "\2\26\1\36\1\26\1\37\1\40\1\41\1\26\1\42"+
    "\1\26\1\43\1\44\1\45\1\46\2\26\1\47\1\50"+
    "\1\51\1\52\134\0\1\53\47\0\4\4\1\54\40\4"+
    "\1\55\34\4\6\0\1\56\73\0\7\57\1\0\35\57"+
    "\1\60\34\57\13\0\1\61\4\0\1\62\7\63\67\0"+
    "\1\64\2\0\1\62\7\63\3\0\1\65\60\0\1\66"+
    "\4\0\1\67\100\0\1\70\32\0\1\71\22\0\1\72"+
    "\23\0\1\70\1\0\10\21\104\0\1\73\101\0\1\74"+
    "\101\0\1\75\67\0\10\26\4\0\10\26\4\0\26\26"+
    "\24\0\10\26\4\0\10\26\4\0\22\26\1\76\2\26"+
    "\1\77\24\0\10\26\4\0\10\26\4\0\7\26\1\100"+
    "\5\26\1\101\10\26\24\0\10\26\4\0\10\26\4\0"+
    "\14\26\1\102\11\26\24\0\10\26\4\0\10\26\4\0"+
    "\1\103\21\26\1\104\3\26\24\0\10\26\4\0\10\26"+
    "\4\0\14\26\1\105\11\26\24\0\10\26\4\0\10\26"+
    "\4\0\12\26\1\106\2\26\1\107\10\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\110\21\26\24\0\10\26"+
    "\4\0\10\26\4\0\1\111\14\26\1\112\10\26\24\0"+
    "\10\26\4\0\10\26\4\0\4\26\1\113\15\26\1\114"+
    "\3\26\24\0\10\26\4\0\10\26\4\0\4\26\1\115"+
    "\2\26\1\116\1\117\15\26\24\0\10\26\4\0\10\26"+
    "\4\0\17\26\1\120\6\26\24\0\10\26\4\0\10\26"+
    "\4\0\12\26\1\121\1\26\1\122\11\26\24\0\10\26"+
    "\4\0\10\26\4\0\15\26\1\123\10\26\103\0\1\124"+
    "\6\0\1\4\40\0\1\4\3\0\1\4\3\0\1\4"+
    "\6\0\1\4\2\0\1\4\1\0\1\4\17\0\1\125"+
    "\101\0\1\57\35\0\1\57\3\0\1\57\3\0\1\57"+
    "\6\0\1\57\2\0\1\57\1\0\1\57\26\0\1\70"+
    "\1\0\10\63\52\0\12\66\1\126\67\66\2\67\1\0"+
    "\5\67\2\0\5\67\1\0\57\67\1\0\2\67\16\0"+
    "\1\127\1\0\10\130\72\0\2\131\100\0\10\132\4\0"+
    "\5\132\7\0\6\132\44\0\10\26\4\0\10\26\4\0"+
    "\10\26\1\133\15\26\24\0\10\26\4\0\10\26\4\0"+
    "\21\26\1\134\4\26\24\0\10\26\4\0\10\26\4\0"+
    "\1\135\25\26\24\0\10\26\4\0\10\26\4\0\14\26"+
    "\1\136\11\26\24\0\10\26\4\0\1\137\1\26\1\140"+
    "\5\26\4\0\26\26\24\0\10\26\4\0\10\26\4\0"+
    "\12\26\1\141\13\26\24\0\10\26\4\0\10\26\4\0"+
    "\14\26\1\142\11\26\24\0\10\26\4\0\10\26\4\0"+
    "\3\26\1\143\15\26\1\144\4\26\24\0\10\26\4\0"+
    "\10\26\4\0\4\26\1\145\21\26\24\0\10\26\4\0"+
    "\10\26\4\0\14\26\1\146\11\26\24\0\10\26\4\0"+
    "\10\26\4\0\14\26\1\147\11\26\24\0\10\26\4\0"+
    "\10\26\4\0\21\26\1\150\4\26\24\0\10\26\4\0"+
    "\10\26\4\0\17\26\1\151\6\26\24\0\10\26\4\0"+
    "\10\26\4\0\14\26\1\152\11\26\24\0\10\26\4\0"+
    "\10\26\4\0\14\26\1\153\11\26\24\0\10\26\4\0"+
    "\10\26\4\0\15\26\1\154\10\26\24\0\10\26\4\0"+
    "\10\26\4\0\22\26\1\155\3\26\24\0\10\26\4\0"+
    "\10\26\4\0\12\26\1\156\13\26\24\0\10\26\4\0"+
    "\6\26\1\157\1\26\4\0\26\26\24\0\10\26\4\0"+
    "\10\26\4\0\12\26\1\160\13\26\4\0\12\66\1\161"+
    "\4\66\1\2\62\66\16\0\1\127\1\0\10\127\72\0"+
    "\10\26\4\0\10\26\4\0\21\26\1\162\4\26\24\0"+
    "\10\26\4\0\10\26\4\0\4\26\1\163\21\26\24\0"+
    "\10\26\4\0\10\26\4\0\17\26\1\163\6\26\24\0"+
    "\10\26\4\0\10\26\4\0\11\26\1\164\14\26\24\0"+
    "\10\26\4\0\10\26\4\0\12\26\1\165\13\26\24\0"+
    "\10\26\4\0\10\26\4\0\1\166\25\26\24\0\10\26"+
    "\4\0\10\26\4\0\20\26\1\167\5\26\24\0\10\26"+
    "\4\0\10\26\4\0\2\26\1\170\23\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\171\21\26\24\0\1\26"+
    "\1\172\1\26\1\173\2\26\1\174\1\163\4\0\10\26"+
    "\4\0\26\26\24\0\10\26\4\0\10\26\4\0\21\26"+
    "\1\175\4\26\24\0\10\26\4\0\10\26\4\0\6\26"+
    "\1\176\17\26\24\0\10\26\4\0\10\26\4\0\21\26"+
    "\1\177\4\26\24\0\1\26\1\200\1\26\1\201\2\26"+
    "\1\202\1\203\4\0\10\26\4\0\26\26\24\0\10\26"+
    "\4\0\10\26\4\0\21\26\1\204\4\26\24\0\10\26"+
    "\4\0\10\26\4\0\2\26\1\205\23\26\24\0\10\26"+
    "\4\0\10\26\4\0\17\26\1\206\6\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\207\21\26\24\0\10\26"+
    "\4\0\10\26\4\0\4\26\1\210\21\26\24\0\10\26"+
    "\4\0\10\26\4\0\15\26\1\211\10\26\24\0\10\26"+
    "\4\0\10\26\4\0\21\26\1\212\4\26\4\0\12\66"+
    "\1\161\4\66\1\213\62\66\20\0\10\26\4\0\10\26"+
    "\4\0\22\26\1\214\3\26\24\0\10\26\4\0\10\26"+
    "\4\0\21\26\1\215\4\26\24\0\10\26\4\0\10\26"+
    "\4\0\20\26\1\216\5\26\24\0\10\26\4\0\10\26"+
    "\4\0\4\26\1\217\21\26\24\0\10\26\4\0\10\26"+
    "\4\0\10\26\1\220\15\26\24\0\10\26\4\0\10\26"+
    "\4\0\24\26\1\221\1\26\24\0\6\26\1\222\1\26"+
    "\4\0\10\26\4\0\26\26\24\0\2\26\1\223\5\26"+
    "\4\0\10\26\4\0\26\26\24\0\4\26\1\176\3\26"+
    "\4\0\10\26\4\0\26\26\24\0\10\26\4\0\10\26"+
    "\4\0\17\26\1\224\6\26\24\0\10\26\4\0\10\26"+
    "\4\0\17\26\1\225\6\26\24\0\6\26\1\226\1\26"+
    "\4\0\10\26\4\0\26\26\24\0\2\26\1\227\5\26"+
    "\4\0\10\26\4\0\26\26\24\0\4\26\1\230\3\26"+
    "\4\0\10\26\4\0\26\26\24\0\10\26\4\0\4\26"+
    "\1\231\3\26\4\0\26\26\24\0\10\26\4\0\10\26"+
    "\4\0\4\26\1\232\21\26\24\0\10\26\4\0\10\26"+
    "\4\0\21\26\1\222\4\26\24\0\10\26\4\0\10\26"+
    "\4\0\21\26\1\233\4\26\24\0\10\26\4\0\6\26"+
    "\1\234\1\26\4\0\26\26\24\0\10\26\4\0\10\26"+
    "\4\0\4\26\1\235\21\26\24\0\10\26\4\0\10\26"+
    "\4\0\14\26\1\236\11\26\24\0\10\26\4\0\10\26"+
    "\4\0\17\26\1\237\6\26\24\0\10\26\4\0\3\26"+
    "\1\240\4\26\4\0\26\26\24\0\10\26\4\0\10\26"+
    "\4\0\15\26\1\241\10\26\24\0\10\26\4\0\10\26"+
    "\4\0\1\242\25\26\24\0\10\26\4\0\10\26\4\0"+
    "\4\26\1\243\21\26\24\0\10\26\4\0\10\26\4\0"+
    "\12\26\1\244\13\26\24\0\10\26\4\0\10\26\4\0"+
    "\17\26\1\245\6\26\24\0\10\26\4\0\10\26\4\0"+
    "\17\26\1\246\6\26\24\0\10\26\4\0\10\26\4\0"+
    "\14\26\1\247\11\26\24\0\10\26\4\0\10\26\4\0"+
    "\20\26\1\250\5\26\24\0\10\26\4\0\10\26\4\0"+
    "\21\26\1\251\4\26\24\0\10\26\4\0\10\26\4\0"+
    "\4\26\1\252\21\26\24\0\10\26\4\0\10\26\4\0"+
    "\4\26\1\253\21\26\24\0\10\26\4\0\10\26\4\0"+
    "\20\26\1\254\5\26\24\0\10\26\4\0\10\26\4\0"+
    "\15\26\1\255\10\26\24\0\1\26\1\256\1\26\1\257"+
    "\2\26\1\260\1\261\4\0\10\26\4\0\26\26\24\0"+
    "\10\26\4\0\10\26\4\0\1\262\25\26\24\0\10\26"+
    "\4\0\7\26\1\263\4\0\26\26\24\0\10\26\4\0"+
    "\2\26\1\264\5\26\4\0\26\26\24\0\10\26\4\0"+
    "\10\26\4\0\21\26\1\265\4\26\24\0\6\26\1\266"+
    "\1\26\4\0\10\26\4\0\26\26\24\0\2\26\1\267"+
    "\5\26\4\0\10\26\4\0\26\26\24\0\4\26\1\270"+
    "\3\26\4\0\10\26\4\0\26\26\24\0\10\26\4\0"+
    "\10\26\4\0\4\26\1\271\21\26\24\0\10\26\4\0"+
    "\10\26\4\0\1\272\25\26\24\0\10\26\4\0\10\26"+
    "\4\0\1\273\25\26\24\0\10\26\4\0\10\26\4\0"+
    "\17\26\1\274\6\26\24\0\10\26\4\0\10\26\4\0"+
    "\20\26\1\275\5\26\24\0\10\26\4\0\10\26\4\0"+
    "\14\26\1\276\11\26\24\0\10\26\4\0\10\26\4\0"+
    "\15\26\1\277\10\26\24\0\10\26\4\0\10\26\4\0"+
    "\21\26\1\300\4\26\24\0\3\26\1\301\2\26\1\302"+
    "\1\26\4\0\10\26\4\0\26\26\24\0\2\26\1\303"+
    "\5\26\4\0\10\26\4\0\26\26\24\0\4\26\1\304"+
    "\3\26\4\0\10\26\4\0\26\26\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9042];
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
    "\2\1\2\11\1\0\2\1\2\0\3\11\26\1\2\11"+
    "\1\0\32\1\1\0\123\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[196];
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
          case 72: break;
          case 2:
            { return ops.bNot_token();
            }
            // fall through
          case 73: break;
          case 3:
            { return ops.mod_token();
            }
            // fall through
          case 74: break;
          case 4:
            { return ops.and_token();
            }
            // fall through
          case 75: break;
          case 5:
            { return ops.parenth_open_token();
            }
            // fall through
          case 76: break;
          case 6:
            { return ops.parenth_close_token();
            }
            // fall through
          case 77: break;
          case 7:
            { return ops.mult_token();
            }
            // fall through
          case 78: break;
          case 8:
            { return ops.add_token();
            }
            // fall through
          case 79: break;
          case 9:
            { return ops.coma_token();
            }
            // fall through
          case 80: break;
          case 10:
            { return ops.sub_token();
            }
            // fall through
          case 81: break;
          case 11:
            { return ops.dot_token();
            }
            // fall through
          case 82: break;
          case 12:
            { return ops.div_token();
            }
            // fall through
          case 83: break;
          case 13:
            { return ops.number_nat_token();
            }
            // fall through
          case 84: break;
          case 14:
            { return ops.semi_colon_token();
            }
            // fall through
          case 85: break;
          case 15:
            { return ops.lt_token();
            }
            // fall through
          case 86: break;
          case 16:
            { return ops.equals_token();
            }
            // fall through
          case 87: break;
          case 17:
            { return ops.gt_token();
            }
            // fall through
          case 88: break;
          case 18:
            { return ops.identificator_token();
            }
            // fall through
          case 89: break;
          case 19:
            { return ops.bracket_open_token();
            }
            // fall through
          case 90: break;
          case 20:
            { return ops.bracket_close_token();
            }
            // fall through
          case 91: break;
          case 21:
            { return ops.xor_token();
            }
            // fall through
          case 92: break;
          case 22:
            { return ops.curly_open_token();
            }
            // fall through
          case 93: break;
          case 23:
            { return ops.or_token();
            }
            // fall through
          case 94: break;
          case 24:
            { return ops.curly_close_token();
            }
            // fall through
          case 95: break;
          case 25:
            { return ops.not_token();
            }
            // fall through
          case 96: break;
          case 26:
            { return ops.neq_token();
            }
            // fall through
          case 97: break;
          case 27:
            { return ops.rval_char_arr_token();
            }
            // fall through
          case 98: break;
          case 28:
            { return ops.bAdd_token();
            }
            // fall through
          case 99: break;
          case 29:
            { return ops.pp_token();
            }
            // fall through
          case 100: break;
          case 30:
            { return ops.number_int_token();
            }
            // fall through
          case 101: break;
          case 31:
            { return ops.mm_token();
            }
            // fall through
          case 102: break;
          case 32:
            { return ops.type_ident_token();
            }
            // fall through
          case 103: break;
          case 33:
            { ops.error("Ç1001: too many decimal points in number.");
            }
            // fall through
          case 104: break;
          case 34:
            { return ops.leq_token();
            }
            // fall through
          case 105: break;
          case 35:
            { return ops.equal_token();
            }
            // fall through
          case 106: break;
          case 36:
            { return ops.geq_token();
            }
            // fall through
          case 107: break;
          case 37:
            { return ops.else2_token();
            }
            // fall through
          case 108: break;
          case 38:
            { return ops.else1_token();
            }
            // fall through
          case 109: break;
          case 39:
            { return ops.bSub_token();
            }
            // fall through
          case 110: break;
          case 40:
            { return ops.rval_char_token();
            }
            // fall through
          case 111: break;
          case 41:
            { return ops.number_float_token();
            }
            // fall through
          case 112: break;
          case 42:
            { return ops.number_bin_token();
            }
            // fall through
          case 113: break;
          case 43:
            { return ops.number_hex_token();
            }
            // fall through
          case 114: break;
          case 44:
            { ops.error("Ç1002: unknown type. Perhaps you meant to speak in catalá (sencer32).");
            }
            // fall through
          case 115: break;
          case 45:
            { return ops.for_token();
            }
            // fall through
          case 116: break;
          case 46:
            { return ops.void_token();
            }
            // fall through
          case 117: break;
          case 47:
            { ops.error("Ç1002: unknown type. Perhaps you meant to speak in catalá (sencer8).");
            }
            // fall through
          case 118: break;
          case 48:
            { ops.error("Ç1002: unknown type. Perhaps you meant to speak in catalá (sencer64).");
            }
            // fall through
          case 119: break;
          case 49:
            { return ops.uint8_token();
            }
            // fall through
          case 120: break;
          case 50:
            { return ops.true_token();
            }
            // fall through
          case 121: break;
          case 51:
            { return ops.false_token();
            }
            // fall through
          case 122: break;
          case 52:
            { return ops.cursor_token();
            }
            // fall through
          case 123: break;
          case 53:
            { ops.error("Ç1002: unknown type. Perhaps you meant to speak in catalá (sencer16).");
            }
            // fall through
          case 124: break;
          case 54:
            { return ops.uint16_token();
            }
            // fall through
          case 125: break;
          case 55:
            { return ops.uint32_token();
            }
            // fall through
          case 126: break;
          case 56:
            { return ops.uint64_token();
            }
            // fall through
          case 127: break;
          case 57:
            { return ops.function_token();
            }
            // fall through
          case 128: break;
          case 58:
            { return ops.char_token();
            }
            // fall through
          case 129: break;
          case 59:
            { return ops.loop_token();
            }
            // fall through
          case 130: break;
          case 60:
            { return ops.struct_token();
            }
            // fall through
          case 131: break;
          case 61:
            { return ops.if_token();
            }
            // fall through
          case 132: break;
          case 62:
            { return ops.while_token();
            }
            // fall through
          case 133: break;
          case 63:
            { return ops.int8_token();
            }
            // fall through
          case 134: break;
          case 64:
            { return ops.uchar_token();
            }
            // fall through
          case 135: break;
          case 65:
            { return ops.int16_token();
            }
            // fall through
          case 136: break;
          case 66:
            { return ops.int32_token();
            }
            // fall through
          case 137: break;
          case 67:
            { return ops.int64_token();
            }
            // fall through
          case 138: break;
          case 68:
            { return ops.elseif_token();
            }
            // fall through
          case 139: break;
          case 69:
            { return ops.bool_token();
            }
            // fall through
          case 140: break;
          case 70:
            { return ops.float32_token();
            }
            // fall through
          case 141: break;
          case 71:
            { return ops.float64_token();
            }
            // fall through
          case 142: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}

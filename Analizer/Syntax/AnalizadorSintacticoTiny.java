
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140220
// Fri Jan 28 18:16:13 CET 2022
//----------------------------------------------------

package syntax;

import java_cup.runtime.*;
import lex.AnalizadorLexicoTiny;
import lex.UnidadLexica;
import errors.GestionErroresTiny;
import java_cup.runtime.ComplexSymbolFactory.Location;

/** CUP v0.11b beta 20140220 generated parser.
  * @version Fri Jan 28 18:16:13 CET 2022
  */
public class AnalizadorSintacticoTiny extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalizadorSintacticoTiny() {super();}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalizadorSintacticoTiny(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\005\000\002\002\004\000\002\003" +
    "\004\000\002\003\002\000\002\004\005\000\002\004\003" +
    "\000\002\005\005\000\002\006\005\000\002\006\003\000" +
    "\002\007\005\000\002\007\003\000\002\010\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\005\000\002\011" +
    "\003\000\002\011\003\000\002\012\003\000\002\012\003" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\004\005\005\001\002\000\004\002\040\001" +
    "\002\000\012\006\013\007\011\010\010\017\012\001\002" +
    "\000\022\002\ufff9\004\ufff9\011\ufff9\012\ufff9\013\025\014" +
    "\024\016\ufff9\020\ufff9\001\002\000\012\002\ufffe\004\027" +
    "\011\017\012\021\001\002\000\022\002\ufff5\004\ufff5\011" +
    "\ufff5\012\ufff5\013\ufff5\014\ufff5\016\ufff5\020\ufff5\001\002" +
    "\000\022\002\ufff6\004\ufff6\011\ufff6\012\ufff6\013\ufff6\014" +
    "\ufff6\016\ufff6\020\ufff6\001\002\000\012\006\013\007\011" +
    "\010\010\017\012\001\002\000\022\002\ufff4\004\ufff4\011" +
    "\ufff4\012\ufff4\013\ufff4\014\ufff4\016\ufff4\020\ufff4\001\002" +
    "\000\022\002\ufff7\004\ufff7\011\ufff7\012\ufff7\013\ufff7\014" +
    "\ufff7\016\ufff7\020\ufff7\001\002\000\010\011\017\012\021" +
    "\020\016\001\002\000\022\002\ufff3\004\ufff3\011\ufff3\012" +
    "\ufff3\013\ufff3\014\ufff3\016\ufff3\020\ufff3\001\002\000\012" +
    "\006\ufff2\007\ufff2\010\ufff2\017\ufff2\001\002\000\012\006" +
    "\013\007\011\010\010\017\012\001\002\000\012\006\ufff1" +
    "\007\ufff1\010\ufff1\017\ufff1\001\002\000\022\002\ufffa\004" +
    "\ufffa\011\ufffa\012\ufffa\013\025\014\024\016\ufffa\020\ufffa" +
    "\001\002\000\012\006\013\007\011\010\010\017\012\001" +
    "\002\000\012\006\uffef\007\uffef\010\uffef\017\uffef\001\002" +
    "\000\012\006\ufff0\007\ufff0\010\ufff0\017\ufff0\001\002\000" +
    "\022\002\ufff8\004\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8" +
    "\016\ufff8\020\ufff8\001\002\000\004\006\032\001\002\000" +
    "\004\002\001\001\002\000\006\002\uffff\016\036\001\002" +
    "\000\004\015\034\001\002\000\006\002\ufffc\016\ufffc\001" +
    "\002\000\012\006\013\007\011\010\010\017\012\001\002" +
    "\000\012\002\ufffb\011\017\012\021\016\ufffb\001\002\000" +
    "\004\006\032\001\002\000\006\002\ufffd\016\ufffd\001\002" +
    "\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\004\002\003\001\001\000\002\001\001\000" +
    "\010\006\006\007\005\010\013\001\001\000\004\012\022" +
    "\001\001\000\006\003\027\011\017\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\006\014\007\005\010\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\011" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\007\021\010\013\001\001\000\002\001\001\000\004\012" +
    "\022\001\001\000\004\010\025\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\004\030\005" +
    "\032\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\006\034\007\005\010" +
    "\013\001\001\000\004\011\017\001\001\000\004\005\036" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalizadorSintacticoTiny$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalizadorSintacticoTiny$actions(this);
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
    return action_obj.CUP$AnalizadorSintacticoTiny$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
 
   errores = new GestionErroresTiny();
   AnalizadorLexicoTiny alex = (AnalizadorLexicoTiny)getScanner();
   alex.fijaGestionErrores(errores);

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return getScanner().next_token(); 
    }

 
   private GestionErroresTiny errores;
   public void syntax_error(Symbol unidadLexica) {
     errores.errorSintactico((UnidadLexica)unidadLexica);
   }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalizadorSintacticoTiny$actions {
  private final AnalizadorSintacticoTiny parser;

  /** Constructor */
  CUP$AnalizadorSintacticoTiny$actions(AnalizadorSintacticoTiny parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action_part00000000(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$result;

      /* select the action based on the action number */
      switch (CUP$AnalizadorSintacticoTiny$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // S ::= EVALUA E0 Ds 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("S",0, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= S EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$AnalizadorSintacticoTiny$stack.elementAt(CUP$AnalizadorSintacticoTiny$top-1)).value;
		RESULT = start_val;
              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$AnalizadorSintacticoTiny$parser.done_parsing();
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Ds ::= DONDE LDs 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Ds",1, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Ds ::= 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("Ds",1, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LDs ::= LDs COMA D 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LDs",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LDs ::= D 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("LDs",2, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // D ::= IDEN IGUAL E0 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("D",3, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E0 ::= E0 OP0 E1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E0",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // E0 ::= E1 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E0",4, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // E1 ::= E1 OP1 E2 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E1",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // E1 ::= E2 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E1",5, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E2 ::= ENT 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E2 ::= REAL 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E2 ::= IDEN 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E2 ::= PAP E0 PCIERRE 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("E2",6, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OP0 ::= MAS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OP0 ::= MENOS 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP0",7, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OP1 ::= POR 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP1",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // OP1 ::= DIV 
            {
              Object RESULT =null;

              CUP$AnalizadorSintacticoTiny$result = parser.getSymbolFactory().newSymbol("OP1",8, RESULT);
            }
          return CUP$AnalizadorSintacticoTiny$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$AnalizadorSintacticoTiny$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$AnalizadorSintacticoTiny$do_action(
    int                        CUP$AnalizadorSintacticoTiny$act_num,
    java_cup.runtime.lr_parser CUP$AnalizadorSintacticoTiny$parser,
    java.util.Stack            CUP$AnalizadorSintacticoTiny$stack,
    int                        CUP$AnalizadorSintacticoTiny$top)
    throws java.lang.Exception
    {
              return CUP$AnalizadorSintacticoTiny$do_action_part00000000(
                               CUP$AnalizadorSintacticoTiny$act_num,
                               CUP$AnalizadorSintacticoTiny$parser,
                               CUP$AnalizadorSintacticoTiny$stack,
                               CUP$AnalizadorSintacticoTiny$top);
    }
}


package ast;
import java.util.ArrayList;

public class EBin extends E {
    private E opnd1;
    private E opnd2;
    private BinOps op;
    private KindE kind;
    public EBin(E opnd1, E opnd2, BinOps op) {
      this.opnd1 = opnd1;
      this.opnd2 = opnd2;
      this.op = op;
      this.kind = KindE.BINEXPR;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
      opnd1.bind(table, binding_errors);
      opnd2.bind(table, binding_errors);
    }
    public KindE kind() {return this.kind;}
    public E opnd1() {return opnd1;}
    public E opnd2() {return opnd2;}    
    public BinOps get_op() {return op;}
    public String toString() {
        String opstr = "";
        switch(op) {
          case PLUS:  opstr = "+"; break;
          case MINUS: opstr = "-"; break;
          case MULT:  opstr = "*"; break;
          case DIV:   opstr = "/"; break;
          case AND:   opstr = "&"; break;
          case XOR:   opstr = "^"; break;
          case OR:    opstr = "|"; break;
          case MOD:   opstr = "%"; break;
          case BAND:  opstr = "&&"; break;
          case BOR:   opstr = "||"; break;
          case EQUAL: opstr = "=="; break;
          case NEQ:   opstr = "!="; break;
          case GT:    opstr = ">"; break;
          case LT:    opstr = "<"; break;
          case GEQ:   opstr = ">="; break;
          case LEQ:   opstr = "<="; break;
        }
        return "\n" + opnd1.toString() + " " + opstr + " " + opnd2.toString();
    }
 }
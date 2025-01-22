package ast;
import java.util.ArrayList;

public class EUni extends E {
    private E opnd1;
    private UniOps op;
    private KindE kind;
    public EUni(E opnd1, UniOps op) {
      this.opnd1 = opnd1;
      this.op = op;
      this.kind = KindE.UNIEXPR;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
      opnd1.bind(table, binding_errors);
    }
    public KindE kind() {return this.kind;}
    public E opnd1() {return opnd1;} 
    public UniOps get_op() {return op;}
    public String toString() {
        String opstr = "";
        switch(op) {
          case NOT:     opstr = "\n~" + opnd1.toString(); break;
          case BNOT:    opstr = "\n!" + opnd1.toString(); break;
          case PP_POST: opstr = "\n" + opnd1.toString() + "++"; break;
          case MM_POST: opstr = "\n" + opnd1.toString() + "--"; break;
          case PP_PRE:  opstr = "\n++" + opnd1.toString(); break;
          case MM_PRE:  opstr = "\n--" + opnd1.toString(); break;
        }
        return opstr;
    }
 }
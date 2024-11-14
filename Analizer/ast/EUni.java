package ast;

public class EUni extends E {
    private E opnd1;
    private UniOps op;
    public EUni(E opnd1, UniOps op) {
      this.opnd1 = opnd1;
      this.op = op;
    }
    public E opnd1() {return opnd1;} 
    public UniOps get_op() {return op;}
    public String toString() {
        return op.toString() + "(" + opnd1.toString() + ")";
    }
 }
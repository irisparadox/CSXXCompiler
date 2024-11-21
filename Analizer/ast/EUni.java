package ast;

public class EUni extends E {
    private E opnd1;
    private UniOps op;
    private KindE kind;
    public EUni(E opnd1, UniOps op) {
      this.opnd1 = opnd1;
      this.op = op;
      this.kind = KindE.UNIEXPR;
      System.out.println(this.toString());
    }
    public KindE kind() {return this.kind;}
    public E opnd1() {return opnd1;} 
    public UniOps get_op() {return op;}
    public String toString() {
        return op.toString() + "(" + opnd1.toString() + ")";
    }
 }
package ast;

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
      System.out.println(this.toString());
    }
    public KindE kind() {return this.kind;}
    public E opnd1() {return opnd1;}
    public E opnd2() {return opnd2;}    
    public BinOps get_op() {return op;}
    public String toString() {
        return op.toString() + "(" + opnd1.toString() + ", " + opnd2.toString() + ")";
    }
 }
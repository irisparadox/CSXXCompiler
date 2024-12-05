package ast;

public class Assignation extends Instruction {
    String iden;
    E expr;
    public Assignation(String ident, E exp) {
        this.iden = ident;
        this.expr = exp;
    }
    public KindI kind() {
        return KindI.ASSIGNATION;
    }
    public String toString() {
        return "ASSIGNATION: " + iden + " = " + expr.toString();
    }
}
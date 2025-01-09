package ast;

public class FloatingExpression extends Instruction {
    E expr;
    public FloatingExpression(E exp) {
        this.expr = exp;
    }
    public KindI kind() {
        return KindI.FLOATING_EXPRESSION;
    }
    public String toString() {
        return "\nEXPRESSION: " + expr.toString();
    }
}
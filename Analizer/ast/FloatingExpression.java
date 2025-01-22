package ast;
import java.util.ArrayList;

public class FloatingExpression extends Instruction {
    E expr;
    public FloatingExpression(E exp) {
        this.expr = exp;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
        expr.bind(table, binding_errors);
    }
    public KindI kind() {
        return KindI.FLOATING_EXPRESSION;
    }
    public String toString() {
        return "\nEXPRESSION: " + expr.toString();
    }
}
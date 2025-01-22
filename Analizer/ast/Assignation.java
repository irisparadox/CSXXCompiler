package ast;

import java.util.ArrayList;

public class Assignation extends Instruction {
    String iden;
    E expr;
    public Assignation(String ident, E exp) {
        this.iden = ident;
        this.expr = exp;
    }

    public void bind(TableStack table, ArrayList<String> binding_errors) {
        if(table.lookup(iden) == null) {
            binding_errors.add("Ç3000: Variable \'" + iden + "\' was not declared in this scope.");
            binding_errors.add("   At:" + this.toString().replace('\n', ' '));            
        }
        expr.bind(table, binding_errors);
    }

    public KindI kind() {
        return KindI.ASSIGNATION;
    }
    public String toString() {
        return "\n" + iden + " = " + expr.toString();
    }
}
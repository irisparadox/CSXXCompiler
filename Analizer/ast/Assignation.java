package ast;

import javax.management.RuntimeErrorException;

public class Assignation extends Instruction {
    String iden;
    E expr;
    public Assignation(String ident, E exp) {
        this.iden = ident;
        this.expr = exp;
    }

    public Symbol bind(SymbolTable table) {
        if(table.lookup(iden) != null) {
            throw new RuntimeErrorException("Variable '" + iden + "' was already declared in this scope!");
        }
        table.add_symbol(iden, this);
    }

    public KindI kind() {
        return KindI.ASSIGNATION;
    }
    public String toString() {
        return "\nASSIGNATION: " + iden + " = " + expr.toString();
    }
}
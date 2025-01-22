package ast;

import java.util.ArrayList;

public class DeclarationUnassigned extends Instruction {
    String iden;
    Types type;
    public DeclarationUnassigned(String ident, Types _type) {
        this.iden = ident;
        this.type = _type;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
        if(table.lookup(iden) != null) {
            binding_errors.add("Ç3001: Variable '" + iden + "' was already declared in this scope.");
            binding_errors.add("   At:" + this.toString().replace('\n', ' '));
            return;
        }
        table.add_id(iden, new UnitSymbol(iden, this));
    }
    public KindI kind() {
        return KindI.DECLARATION_UNASSIGNED;
    }
    public String toString() {
        return "\n" + type.toString() + " " + iden;
    }
}
package ast;

import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayDeclarationUnassigned extends Instruction {
    String iden;
    Types type;
    LinkedList<E> indices;
    public ArrayDeclarationUnassigned(String ident, Types _type, LinkedList<E> indices) {
        this.iden = ident;
        this.type = _type;
        this.indices = indices;
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
        return KindI.ARRAY_UNAS;
    }
    public String toString() {
        String header = "\n" + type.toString() + " " + iden;
        for(E expr : indices) {
            header += "[" + expr.toString() + "]";
        }
        return header;
    }
}
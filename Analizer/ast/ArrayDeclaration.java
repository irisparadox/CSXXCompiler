package ast;

import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayDeclaration extends Instruction {
    String iden;
    Types type;
    LinkedList<E> indices;
    E exp;
    public ArrayDeclaration(String ident, Types _type, LinkedList<E> indices, E exp) {
        this.iden = ident;
        this.type = _type;
        this.indices = indices;
        this.exp = exp;
    }

    public void bind(TableStack table, ArrayList<String> binding_errors) {
        for(E expr : indices) {
            expr.bind(table, binding_errors);
        }
        if(table.lookup(iden) != null) {
            binding_errors.add("Ç3001: Variable '" + iden + "' was already declared in this scope.");
            binding_errors.add("   At:" + this.toString().replace('\n', ' '));
            return;
        }
        table.add_id(iden, new UnitSymbol(iden, this));
    }
    
    public KindI kind() {
        return KindI.ARRAY_DEC;
    }
    public String toString() {
        String header = "\n" + type.toString() + " " + iden;
        for(E expr : indices) {
            header += "[" + expr.toString() + "]";
        }
        header += " = " + exp.toString();
        return header;
    }
}
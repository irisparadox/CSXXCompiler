package ast;

import java.util.LinkedList;

import javax.management.RuntimeErrorException;

public class ArrayDeclarationUnassigned extends Instruction {
    String iden;
    Types type;
    LinkedList<E> indices;
    public ArrayDeclarationUnassigned(String ident, Types _type, LinkedList<E> indices) {
        this.iden = ident;
        this.type = _type;
        this.indices = indices;
    }

    public Symbol bind(SymbolTable table) {
        if(table.lookup(iden) != null) {
            throw new RuntimeErrorException("Variable '" + iden + "' was already declared in this scope!");
        }
        table.add_symbol(iden, type, null);
    }
    
    public KindI kind() {
        return KindI.ARRAY_UNAS;
    }
    public String toString() {
        String header = "\nARR_UNAS: " + type.toString() + " " + iden;
        for(E expr : indices) {
            header += "[" + expr.toString() + "]";
        }
        return header;
    }
}
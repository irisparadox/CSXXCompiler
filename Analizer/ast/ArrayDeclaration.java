package ast;

import java.util.LinkedList;

import javax.management.RuntimeErrorException;

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

    public void bind(SymbolTable table) {
        for(E expr : indices) {
            expr.bind();
        }
        if(table.lookup(iden) != null) {
            throw new RuntimeErrorException("Variable '" + iden + "' was already declared in this scope!");
        }
        table.add_symbol(iden, this);
    }
    
    public KindI kind() {
        return KindI.ARRAY_DEC;
    }
    public String toString() {
        String header = "\nARR_DEC: " + type.toString() + " " + iden;
        for(E expr : indices) {
            header += "[" + expr.toString() + "]";
        }
        header += " = " + exp.toString();
        return header;
    }
}
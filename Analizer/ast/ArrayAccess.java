package ast;

import java.util.LinkedList;

import javax.management.RuntimeErrorException;

public class ArrayAccess extends E {
    private String array;
    private LinkedList<E> indices;

    public ArrayAccess(String array, LinkedList<E> indices) {
        this.array = array;
        this.indices = indices;
    }

    public Symbol bind(SymbolTable table) {
        for(E expr : indices) {
            expr.bind();
        }
        if(table.lookup(array) == null) {
            throw new RuntimeErrorException("Variable '" + array + "' was not declared in this scope!");
        }
    }

    public KindE kind() {return KindE.ARRAY;}   
    public String toString() {
        String header = array;
        for(E expr : indices) {
            header += "[" + expr.toString() + "]";
        }

        return header;
    } 
}
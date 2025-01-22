package ast;

import java.util.LinkedList;
import java.util.ArrayList;

public class ArrayAccess extends E {
    private String array;
    private LinkedList<E> indices;

    public ArrayAccess(String array, LinkedList<E> indices) {
        this.array = array;
        this.indices = indices;
    }

    public void bind(TableStack table, ArrayList<String> binding_errors) {
        for(E expr : indices) {
            expr.bind(table, binding_errors);
        }
        if(table.lookup(array) == null) {
            binding_errors.add("Ç3000: Variable \'" + array + "\' was not declared in this scope.");
            binding_errors.add("   At:" + this.toString().replace('\n', ' '));
        }
    }

    public KindE kind() {return KindE.ARRAY;}   
    public String toString() {
        String header = "\n" + array;
        for(E expr : indices) {
            header += "[" + expr.toString() + "]";
        }

        return header;
    } 
}
package ast;

import java.util.LinkedList;

public class ArrayAccess extends E {
    private String array;
    private LinkedList<E> indices;

    public ArrayAccess(String array, LinkedList<E> indices) {
        this.array = array;
        this.indices = indices;
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
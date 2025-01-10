package ast;

import java.util.LinkedList;

public class ExprArray extends E {
    LinkedList<E> exprs;
    public ExprArray(LinkedList<E> exprs) {
        this.exprs = exprs;
    }
    public KindE kind() {
        return KindE.ARRAY_VALUES;
    }
    public String toString() {
        String header = "{";
        int counter = 0;
        for(E ex : exprs) {
            header += ex.toString();
            if(counter < exprs.size() - 1) header += ", ";
            ++counter;
        }
        header += "}";
        return header;  
    }
}
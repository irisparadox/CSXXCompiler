package ast;

import java.util.LinkedList;
import java.util.ArrayList;

public class ExprArray extends E {
    LinkedList<E> exprs;
    public ExprArray(LinkedList<E> exprs) {
        this.exprs = exprs;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
        for(E expr : exprs) {
            expr.bind(table, binding_errors);
        }
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
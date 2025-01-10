package ast;

import java.util.LinkedList;

public class ArrayDeclarationUnassigned extends Instruction {
    String iden;
    Types type;
    LinkedList<E> indices;
    public ArrayDeclarationUnassigned(String ident, Types _type, LinkedList<E> indices) {
        this.iden = ident;
        this.type = _type;
        this.indices = indices;
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
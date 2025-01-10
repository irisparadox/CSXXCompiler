package ast;

import java.util.LinkedList;

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
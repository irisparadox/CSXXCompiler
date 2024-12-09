package ast;

public class Declaration extends Instruction {
    String iden;
    Types type;
    E exp;
    public Declaration(String ident, Types _type, E exp) {
        this.iden = ident;
        this.type = _type;
        this.exp = exp;
    }
    public KindI kind() {
        return KindI.DECLARATION;
    }
    public String toString() {
        return "DEC: " + type.toString() + " " + iden + " = " + exp.toString();
    }
}
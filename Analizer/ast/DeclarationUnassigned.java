package ast;

public class DeclarationUnassigned extends Instruction {
    String iden;
    Types type;
    public DeclarationUnassigned(String ident, Types _type) {
        this.iden = ident;
        this.type = _type;
    }
    public KindI kind() {
        return KindI.DECLARATION_UNASSIGNED;
    }
    public String toString() {
        return "UNASSIGNED DEC: " + type.toString() + " " + iden;
    }
}
package ast;

public class EmptyScope extends Instruction {
    public EmptyScope() {}
    public KindI kind() {
        return KindI.EMPTY_SCOPE;
    }
    public String toString() {
        return "\nEMPTY SCOPE";
    }
}
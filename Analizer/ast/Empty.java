package ast;

public class Empty extends Instruction {
    public Empty() {}
    public KindI kind() {
        return KindI.EMPTY;
    }
    public String toString() {
        return "EMPTY";
    }
}
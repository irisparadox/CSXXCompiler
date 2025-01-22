package ast;
import java.util.ArrayList;

public class Empty extends Instruction {
    public Empty() {}
    public void bind(TableStack table, ArrayList<String> binding_errors) {}
    public KindI kind() {
        return KindI.EMPTY;
    }
    public String toString() {
        return "EMPTY";
    }
}
package ast;
import java.util.ArrayList;

public class EmptyScope extends Instruction {
    public EmptyScope() {}
    public void bind(TableStack table, ArrayList<String> binding_errors) {}
    public KindI kind() {
        return KindI.EMPTY_SCOPE;
    }
    public String toString() {
        return "\nEMPTY SCOPE";
    }
}
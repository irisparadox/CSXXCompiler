package ast;

import java.util.ArrayList;

public class Else extends Instruction {
    ArrayList<Instruction> body;
    public Else(ArrayList<Instruction> body) {
        this.body = body;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
        for(Instruction ins : body) {
            ins.bind(table, binding_errors);
        }
    }
    public KindI kind() {
        return KindI.ELSE;
    }
    public String toString() {
        String header = "\nELSE {";
        for(Instruction instr : body) {
            header += instr.toString();
        }
        header += "\n}";

        return header;
    }
}
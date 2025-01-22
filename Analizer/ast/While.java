package ast;

import java.util.ArrayList;

public class While extends Instruction {
    E exp;
    ArrayList<Instruction> instructions;
    public While(E exp, ArrayList<Instruction> insts) {
        this.exp = exp;
        this.instructions = insts;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
        exp.bind(table, binding_errors);
        table.push();
        for(Instruction i : instructions) {
            i.bind(table, binding_errors);
        }
        table.pop();
    }
    public KindI kind() {
        return KindI.WHILE;
    }
    public String toString() {
        String header = "\nWHILE(" + exp.toString() + ") {";
        for(Instruction instr : instructions) {
            header += instr.toString();
        }
        header += "\n}";

        return header;
    }
}
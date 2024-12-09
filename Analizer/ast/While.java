package ast;

import java.util.ArrayList;

public class While extends Instruction {
    E exp;
    ArrayList<Instruction> instructions;
    public While(E exp, ArrayList<Instruction> insts) {
        this.exp = exp;
        this.instructions = insts;
    }
    public KindI kind() {
        return KindI.WHILE;
    }
    public String toString() {
        String header = "WHILE(" + exp.toString() + ") { \n";
        for(Instruction instr : instructions) {
            header += instr.toString();
            header += "\n";
        }
        header += "}";

        return header;
    }
}
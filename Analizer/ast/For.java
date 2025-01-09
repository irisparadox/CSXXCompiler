package ast;

import java.util.ArrayList;

public class For extends Instruction {
    E exp1, exp2;
    ArrayList<Instruction> instructions;
    public For(E exp1, E exp2, ArrayList<Instruction> insts) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.instructions = insts;
    }
    public KindI kind() {
        return KindI.FOR;
    }
    public String toString() {
        String header = "\nFOR(" + exp1.toString() + ";" + exp2.toString() + ") {";
        for(Instruction instr : instructions) {
            header += instr.toString();
        }
        header += "\n}";

        return header;
    }
}
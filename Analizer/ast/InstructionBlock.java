package ast;

import java.util.ArrayList;

public class InstructionBlock extends Instruction {
    ArrayList<Instruction> instructions;
    public InstructionBlock(ArrayList<Instruction> instructions) {
        this.instructions = instructions;
    }
    public KindI kind() {
        return KindI.BLOCK;
    }
    public String toString() {
        String header = "\nSCOPE: {\n";
        for(Instruction i : instructions) {
            header += i + "\n";
        }
        header += "}";
        return header;
    }
}
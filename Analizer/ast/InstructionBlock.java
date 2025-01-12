package ast;

import java.util.ArrayList;

public class InstructionBlock extends Instruction {
    ArrayList<Instruction> instructions;
    public InstructionBlock(ArrayList<Instruction> instructions) {
        this.instructions = instructions;
    }

    public void bind(SymbolTable table) {
        for(Instruction i : instructions) {
            i.bind();
        }
    }

    public KindI kind() {
        return KindI.BLOCK;
    }
    public String toString() {
        String header = "\nSCOPE: {";
        for(Instruction i : instructions) {
            header += i;
        }
        header += "\n}";
        return header;  
    }
}
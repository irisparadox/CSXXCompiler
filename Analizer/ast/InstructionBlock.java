package ast;

import java.util.ArrayList;

public class InstructionBlock extends Instruction {
    ArrayList<Instruction> instructions;
    public InstructionBlock(ArrayList<Instruction> instructions) {
        this.instructions = instructions;
    }

    public void bind(TableStack table, ArrayList<String> binding_errors) {
        table.push();
        for(Instruction i : instructions) {
            i.bind(table, binding_errors);
        }
        table.pop();
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
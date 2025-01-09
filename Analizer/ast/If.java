package ast;

import java.util.ArrayList;

public class If extends Instruction {
    E exp;
    Instruction next;
    ArrayList<Instruction> body;
    public If(E exp, Instruction next, ArrayList<Instruction> body) {
        this.exp = exp;
        this.next = next;
        this.body = body;
    }
    public KindI kind() {
        return KindI.IF;
    }
    public String toString() {
        String header = "\nIF (" + exp.toString() + ") {";
        for(Instruction instr : body) {
            header += instr.toString();
        }
        header += "\n}";

        header += next.toString();

        return header;
    }
}
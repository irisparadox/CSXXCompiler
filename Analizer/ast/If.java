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

    public void bind(TableStack table, ArrayList<String> binding_errors) {
        exp.bind(table, binding_errors);
        table.push();
        for(Instruction ins : body) {
            ins.bind(table, binding_errors);
        }
        next.bind(table, binding_errors);
        table.pop();
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
package ast;

import java.util.ArrayList;

public class Identificator extends E {
    private String v;
    public Identificator(String v) {
        this.v = v;
    }
    public void bind(TableStack table, ArrayList<String> binding_errors) {
        if(table.lookup(v) == null) {
            binding_errors.add("Ç3000: Variable \'" + v + "\' was not declared in this scope.");
            binding_errors.add("   At:" + this.toString().replace('\n', ' '));
            return;
        }
    }
    public String name() {return v;}
    public KindE kind() {return KindE.ID;}   
    public String toString() {return "\n" + v;} 
}
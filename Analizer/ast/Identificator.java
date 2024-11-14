package ast;

public class Identificator extends E {
    private String v;
    public Identificator(String v) {
    this.v = v; 
    }
    public String name() {return v;}
    public KindE kind() {return KindE.ID;}   
    public String toString() {return v;} 
}
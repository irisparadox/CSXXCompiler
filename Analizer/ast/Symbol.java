package ast;

public class Symbol {
    private String id;
    private Instruction dec;

    public Symbol(String id, Instruction dec) {
        this.id = id;
        this.dec = dec;
    }

    public String get_id() {
        return id;
    }

    public Instruction get_reference() {
        return dec;
    }
}
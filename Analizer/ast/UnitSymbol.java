package ast;

public class UnitSymbol {
    private String id;
    private Instruction dec;

    public UnitSymbol(String id, Instruction dec) {
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
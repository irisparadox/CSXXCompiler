package ast;

import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, UnitSymbol> table;

    public SymbolTable() {
        this.table = new HashMap<>();
    }

    public void add_symbol(String id, UnitSymbol symbol) {
        table.put(id, symbol);
    }

    public UnitSymbol lookup(String id) {
        return table.get(id);
    }

    public boolean contains(String id) {
        return table.containsKey(id);
    }
}
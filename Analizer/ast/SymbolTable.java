package ast;

import java.util.HashMap;

public class SymbolTable {
    private HashMap<String, Symbol> table;

    public SymbolTable() {
        this.table = new HashMap<>();
    }

    public void add_symbol(String id, Types type) {
        table.put(id, new Symbol(id, type));
    }

    public Symbol lookup(String id) {
        return table.get(id);
    }

    public boolean contains(String id) {
        return table.containsKey(id);
    }
}
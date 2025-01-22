package ast;

import java.util.Stack;

public class TableStack {
    private Stack<SymbolTable> stack;

    public TableStack() {
        stack = new Stack<>();
        stack.push(new SymbolTable());
    }

    public void push() {
        stack.push(new SymbolTable());
    }

    public void pop() {
        stack.pop();
    }

    public void add_id(String id, UnitSymbol symbol) {
        stack.peek().add_symbol(id, symbol);;
    }

    public UnitSymbol lookup(String id) {
        for(int i = stack.size() - 1; i >= 0; --i) {
            SymbolTable table = stack.get(i);
            UnitSymbol symbol = table.lookup(id);
            if(symbol != null) {
                return symbol;
            }
        }
        return null;
    }
}
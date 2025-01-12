package ast;

import java.util.Stack;

public class TableStack {
    private Stack<SymbolTable> stack;

    public TableStack() {
        stack = new Stack<>();
        stack.push(new SymbolTable());
    }

    public void push(String id, Symbol symbol) {
        stack.push(new SymbolTable());
    }

    public void pop() {
        stack.pop();
    }

    public void add_id(String id, Symbol symbol) {
        stack.peek().put(id, symbol);
    }

    public Symbol lookup(String id) {
        for(int i = stack.size() - 1; i >= 0; --i) {
            SymbolTable table = stack.get(i);
            Symbol symbol = table.get(id);
            if(symbol != null) {
                return symbol;
            }
        }
        return null;
    }
}
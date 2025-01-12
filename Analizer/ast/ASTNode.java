package ast;

interface ASTNode {
    // public ?? type() // for the future
    public void bind(SymbolTable table);
    // public ?? generateCode() // for the future
    public NodeKind nodeKind();
    public String toString();
}
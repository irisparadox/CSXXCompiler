package ast;

public abstract class Instruction implements ASTNode {
    public abstract KindI kind();
    public Symbol bind(SymbolTable table) { return null; }
    public NodeKind nodeKind() {return NodeKind.INSTRUCTION;}
    public String toString() {return "";}

}
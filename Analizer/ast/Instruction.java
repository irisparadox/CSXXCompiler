package ast;

public abstract class Instruction implements ASTNode {
    public abstract KindI kind();
    public void bind(SymbolTable table) {}
    public NodeKind nodeKind() {return NodeKind.INSTRUCTION;}
    public String toString() {return "";}

}
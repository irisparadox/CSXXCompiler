package ast;

public abstract class Instruction implements ASTNode {
    public abstract KindI kind(); 
    public NodeKind nodeKind() {return NodeKind.INSTRUCTION;}
    public String toString() {return "";}

}
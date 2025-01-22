package ast;
import java.util.ArrayList;

interface ASTNode {
    // public ?? type() // for the future
    public void bind(TableStack table, ArrayList<String> binding_errors);
    // public ?? generateCode() // for the future
    public NodeKind nodeKind();
    public String toString();
}
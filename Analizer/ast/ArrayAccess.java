package ast;

public class ArrayAccess extends E {
    private ArrayIdentificator array;
    private E index;

    public ArrayAccess(ArrayIdentificator array, E index) {
        this.array = array;
        this.index = index;
    }

    public Num evaluate() {
        return array.getValueAt(Integer.parseInt(index.num()));
    }

    public String num() {return evaluate().num();}
    public KindE kind() {return KindE.NUM;}   
    public String toString() {return array.name() + "[" + index + "] = " + evaluate().num();} 
}
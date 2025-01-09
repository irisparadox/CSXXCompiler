package ast;

import java.util.HashMap;

public class ArrayIdentificator extends E {
    private Identificator v;
    private HashMap<Integer, Num> arrayValues;
    public ArrayIdentificator(Identificator v) {
        this.v = v;
        this.arrayValues = new HashMap<>(); 
    }
    public String name() {return v.name();}
    public Num getValueAt(int idx) {
        return arrayValues.get(idx);
    }
    public void setValueAt(int idx, Num value) {
        arrayValues.put(idx, value);
    }
    public KindE kind() {return KindE.ID;}   
    public String toString() {return v.toString() + "[]";} 
}
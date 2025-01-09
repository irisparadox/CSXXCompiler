package ast;

public class Num extends E {
  private String v;
  private Types type;
  public Num(String v, Types type) {
    this.v = v; 
    this.type = type;  
  }
  public String num() {return v;}
  public KindE kind() {return KindE.NUM;}   
  public Types get_type() {return type;}
  public String toString() {return v;}  
}

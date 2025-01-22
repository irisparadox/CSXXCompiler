package ast;

import java.util.ArrayList;

public class Num extends E {
  private String v;
  private Types type;
  public Num(String v, Types type) {
    this.v = v; 
    this.type = type;  
  }
  public void bind(TableStack table, ArrayList<String> binding_errors) {}
  public String num() {return v;}
  public KindE kind() {return KindE.NUM;}   
  public Types get_type() {return type;}
  public String toString() {return v;}  
}

package syntax;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import lex.AnalizadorLexicoTiny;

public class Main {
   public static void main(String[] args) throws Exception {
     Reader input = new InputStreamReader(new FileInputStream(args[0]));
	 AnalizadorLexicoTiny alex = new AnalizadorLexicoTiny(input);
	 AnalizadorSintacticoTiny asint = new AnalizadorSintacticoTiny(alex);
	 System.out.println(asint.parse().value);
 }
}   
   

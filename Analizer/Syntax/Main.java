package syntax;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import ast.*;

import lex.AnalizadorLexicoTiny;

public class Main {
   public static void main(String[] args) throws Exception {
     Reader input = new InputStreamReader(new FileInputStream(args[0]));
	 AnalizadorLexicoTiny alex = new AnalizadorLexicoTiny(input);
	 AnalizadorSintacticoTiny asint = new AnalizadorSintacticoTiny(alex);
	 ArrayList<Instruction> values = (ArrayList<Instruction>) asint.parse().value;
	 //System.out.println(values);
	 TableStack table = new TableStack();
	 ArrayList<String> binding_errors = new ArrayList<>();
	 for(Instruction v : values) {
		v.bind(table, binding_errors);
	 }
	 if(!binding_errors.isEmpty()) {
		System.out.println("\nCompilation terminated due to errors.\n");
		for(String str : binding_errors) {
			System.out.println(str);
		}
		System.exit(1);
	 }
 }
}   
   

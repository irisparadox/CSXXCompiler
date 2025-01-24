package syntax;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import ast.*;
import java.util.Locale;

import lex.AnalizadorLexicoTiny;

public class Main {

	public static ArrayList<String> syntax_errors = new ArrayList<>();

	public static void push_syntax_error(String message) {
		syntax_errors.add(message);
	}

   public static void main(String[] args) throws Exception {
	 long startTime = System.nanoTime();
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
	 if(!binding_errors.isEmpty() || !syntax_errors.isEmpty()) {
		System.out.println("\nCompilation terminated due to errors.\n");
		for(String str : syntax_errors) {
			System.out.println(str);
		}
		for(String str : binding_errors) {
			System.out.println(str);
		}
		System.exit(1);
	 }
	 long endTime = System.nanoTime();
	 long duration = endTime - startTime;
	 double milis = duration / 1000000.0;
	 DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
	 DecimalFormat format = new DecimalFormat("0.#####", symbols);
	 String milisFormatted = format.format(milis);
	 System.out.println("\nProgram finished with exit code SUCCESSFUL.");
	 System.out.println("Compilation took: " + milisFormatted + "ms");
 }
}   

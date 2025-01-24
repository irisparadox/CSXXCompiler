package errors;

import lex.UnidadLexica;

public class GestionErroresTiny {
   public void errorLexico(int fila, int columna, String lexema) {
    System.err.println("\nCompilation terminated due to errors.\n");
     System.err.println("Ç1999: unexpected token found."); 
     System.err.println("   At: " + lexema + " (" + fila + "." + columna + ")");
     System.exit(1);
   }  
   public void errorSintactico(UnidadLexica unidadLexica) {
    System.err.println("\nCompilation terminated due to errors.\n");
     if (unidadLexica.lexema() != null) {
       System.err.println("Ç2998: unexpected syntax error found.");
       System.err.println("   At: " + unidadLexica.lexema() + " (" + unidadLexica.fila() + "." + unidadLexica.columna() + ")");
     } else {
      System.err.println("Ç2999: unexpected fatal syntax error found.");
      System.err.println("(" + unidadLexica.fila() + "." + unidadLexica.columna() + ")");
     }
     System.exit(1);
   }
}

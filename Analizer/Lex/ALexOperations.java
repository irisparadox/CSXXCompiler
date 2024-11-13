package lex;

import syntax.ClaseLexica;

public class ALexOperations {
  private AnalizadorLexicoTiny alex;

  public ALexOperations(AnalizadorLexicoTiny alex) {
    this.alex = alex;   
  }

  public UnidadLexica add_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_ADD);
  }

  public UnidadLexica sub_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_SUB);
  }

  public UnidadLexica mult_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_MULT);
  }

  public UnidadLexica div_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_DIV);
  }

  public UnidadLexica and_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_AND);
  }

  public UnidadLexica xor_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_XOR);
  }

  public UnidadLexica or_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_OR);
  }

  public UnidadLexica not_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_NOT);
  }

  public UnidadLexica mod_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_MOD);
  }

  public UnidadLexica bAdd_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_BAND);
  }

  public UnidadLexica bSub_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_BOR);
  }

  public UnidadLexica bNot_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_BNOT);
  }

  public UnidadLexica equal_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_EQUAL);
  }

  public UnidadLexica neq_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_NEQ);
  }

  public UnidadLexica gt_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_GT);
  }

  public UnidadLexica lt_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_LT);
  }

  public UnidadLexica geq_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_GEQ);
  }

  public UnidadLexica leq_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_LEQ);
  }

  public UnidadLexica pp_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_PP);
  }

  public UnidadLexica mm_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.OPERATOR_MM);
  }

  public UnidadLexica equals_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.EQUALS);
  }

  public UnidadLexica coma_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.COMA);
  }

  public UnidadLexica semi_colon_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.SEMI_COLON);
  }

  public UnidadLexica dot_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.DOT);
  }

  public UnidadLexica type_ident_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.TYPE_IDENT);
  }

  public UnidadLexica parenth_open_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.PARENTH_OPEN);
  }

  public UnidadLexica parenth_close_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.PARENTH_CLOSE);
  }

  public UnidadLexica bracket_open_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.BRACKET_OPEN);
  }

  public UnidadLexica bracket_close_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.BRACKET_CLOSE);
  }

  public UnidadLexica curly_open_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.CURLY_OPEN);
  }

  public UnidadLexica curly_close_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.CURLY_CLOSE);
  }

  public UnidadLexica identificator_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.IDENTIFICATOR, alex.lexema());
  }

  public UnidadLexica number_nat_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.NUMBER_NAT, alex.lexema());
  }

  public UnidadLexica number_int_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.NUMBER_INT, alex.lexema());
  }

  public UnidadLexica number_float_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.NUMBER_FLOAT, alex.lexema());
  }

  public UnidadLexica number_bin_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.NUMBER_BIN, alex.lexema());
  }

  public UnidadLexica number_hex_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.NUMBER_HEX, alex.lexema());
  }

  public UnidadLexica rval_char_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.RVAL_CHAR, alex.lexema());
  }

  public UnidadLexica rval_char_arr_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.RVAL_CHAR_ARR, alex.lexema());
  }

  public UnidadLexica uint8_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.UINT8);
  }

  public UnidadLexica uint16_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.UINT16);
  }

  public UnidadLexica uint32_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.UINT32);
  }

  public UnidadLexica uint64_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.UINT64);
  }

  public UnidadLexica int8_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.INT8);
  }

  public UnidadLexica int16_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.INT16);
  }

  public UnidadLexica int32_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.INT32);
  }

  public UnidadLexica int64_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.INT64);
  }

  public UnidadLexica float32_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FLOAT32);
  }

  public UnidadLexica float64_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FLOAT64);
  }

  public UnidadLexica bool_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.BOOL);
  }

  public UnidadLexica true_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.TRUE);
  }

  public UnidadLexica false_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FALSE);
  }

  public UnidadLexica char_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.CHAR);
  }

  public UnidadLexica uchar_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.UCHAR);
  }

  public UnidadLexica struct_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.STRUCT);
  }

  public UnidadLexica if_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.IF);
  }

  public UnidadLexica elseif_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.ELSEIF);
  }

  public UnidadLexica else_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.ELSE);
  }

  public UnidadLexica while_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.WHILE);
  }

  public UnidadLexica for_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FOR);
  }

  public UnidadLexica loop_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.LOOP);
  }

  public UnidadLexica cursor_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.CURSOR);
  }

  public UnidadLexica function_token() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.FUNCTION);
  }

  public UnidadLexica unidadEof() {
    return new UnidadLexica(alex.fila(), alex.columna(), ClaseLexica.EOF);
  }
}
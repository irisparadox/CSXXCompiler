package alex;

%%
%char
%line
%column
%class AnalizadorLexicoTiny
%type  UnidadLexica
%unicode

%{
  private ALexOperations ops;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public int columna() {return yycolumn+1;}
%}

%eofval{
  return ops.unidadEof();
%eofval}

%init{
  ops = new ALexOperations(this);
%init}

letter         = ([A-Z] | [a-z])
unsigned_digit = [1-9]
binary_digit   = [0-1]
hex_digit      = ([0-9] | [A-F] | [a-f])
digit          = ({unsignedDigit} | 0)
whole_digit    = (({unsignedDigit}{digit}*) | 0)
decimal_digit  = {digit}*

operator_add   = \+
operator_sub   = \-
operator_mult  = \*
operator_div   = \/
operator_pOpen = \(
operator_pClos = \)
operator_and   = \&
operator_xor   = \^
operator_or    = \|
operator_not   = \~

operator_bAnd  = \&\&
operator_bOr   = \|\|

equals         = \=
coma           = ,
semi_colon     = ;

separator      = [ \t\r\b\n]
comment        = "//"[^(\n | "//")]*
block_comment  = "/*"([^*] | \*+[^/])*\*+"/"

identificator  = ({letter} | _)(_ | {letter} | {digit})*
number_int     = [\+\-]?{whole_digit}
number_float   = [\+\-]?{whole_digit}\.{decimal_digit}

uint8          = nat8
uint16         = nat16
uint32         = nat32
uint64         = nat64

int8           = sencer8
int16          = sencer16
int32          = sencer32
int64          = sencer64

float32        = puntFlotant32
float64        = puntFlotant64

bool           = unUoUnZero

char           = lletra
uchar          = ulletra

struct         = conjunt

if             = enCasDe
elseif         = enAltreCas
else           = si no

while          = mentres
for            = per
loop           = voltes
cursor         = index
function       = funcio
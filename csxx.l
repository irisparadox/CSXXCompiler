package lex;

import errors.GestionErroresTiny;

%%
%cup
%line
%column
%class AnalizadorLexicoTiny
%unicode
%public

%{
  private ALexOperations ops;
  private GestionErroresTiny errores;
  public String lexema() {return yytext();}
  public int fila() {return yyline+1;}
  public int columna() {return yycolumn+1;}
  public void fijaGestionErrores(GestionErroresTiny errores) {
   this.errores = errores;
  }
%}

%eofval{
  return ops.unidadEof();
%eofval}

%init{
  ops = new ALexOperations(this);
%init}

letter         = ([A-Z]|[a-z])
unsigned_digit = [1-9]
binary_digit   = [0-1]
hex_digit      = ([0-9]|[A-F]|[a-f])
digit          = ({unsigned_digit}|0)
whole_digit    = (({unsigned_digit}{digit}*)|0)
decimal_digit  = {digit}+

operator_add   = \+
operator_sub   = \-
operator_mult  = \*
operator_div   = \/
operator_and   = \&
operator_xor   = \^
operator_or    = \|
operator_not   = \~
operator_mod   = \%

operator_bAnd  = \&\&
operator_bOr   = \|\|
operator_bNot  = \!
operator_equal = \=\=
operator_neq   = \!\=
operator_gt    = \>
operator_lt    = \<
operator_geq   = \>\=
operator_leq   = \<\=

operator_pp    = \+\+
operator_mm    = \-\-

equals         = \=
coma           = ,
semi_colon     = ;
dot            = \.
type_ident     = \-\>

parenth_open   = \(
parenth_close  = \)
bracket_open   = \[
bracket_close  = \]
curly_open     = \{
curly_close    = \}

separator      = [ \t\r\b\n]
comment        = "//"[^(\n|"//")]*
block_comment  = "/*"([^*]|\*+[^/])*\*+"/"

identificator  = ({letter}|_)(_|{letter}|{digit})*
number_nat     = {whole_digit}
number_int     = [\+\-]?{whole_digit}
number_float   = [\+\-]?{whole_digit}\.{decimal_digit}
number_bin     = [\+\-]?0b{binary_digit}+
number_hex     = [\+\-]?0x{hex_digit}+
rval_char      = \'([^\'\\]|\\[\'\\bfnrt])\'
rval_char_arr  = \"([^\"\\]|\\[\"\\bfnrt])*\"

void           = buit

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
true           = true
false          = false

char           = lletra
uchar          = ulletra

struct         = conjunt

if             = enCasDe
elseif         = enAltreCas
else1          = si
else2          = no

while          = mentres
for            = per
loop           = voltes
cursor         = index
function       = funcio

%%
{operator_add}      {return ops.add_token();}
{operator_sub}      {return ops.sub_token();}
{operator_mult}     {return ops.mult_token();}
{operator_div}      {return ops.div_token();}
{operator_and}      {return ops.and_token();}
{operator_xor}      {return ops.xor_token();}
{operator_or}       {return ops.or_token();}
{operator_not}      {return ops.not_token();}
{operator_mod}      {return ops.mod_token();}

{operator_bAnd}     {return ops.bAdd_token();}
{operator_bOr}      {return ops.bSub_token();}
{operator_bNot}     {return ops.bNot_token();}
{operator_equal}    {return ops.equal_token();}
{operator_neq}      {return ops.neq_token();}
{operator_gt}       {return ops.gt_token();}
{operator_lt}       {return ops.lt_token();}
{operator_geq}      {return ops.geq_token();}
{operator_leq}      {return ops.leq_token();}

{operator_pp}       {return ops.pp_token();}
{operator_mm}       {return ops.mm_token();}

{equals}            {return ops.equals_token();}
{coma}              {return ops.coma_token();}
{semi_colon}        {return ops.semi_colon_token();}
{dot}               {return ops.dot_token();}
{type_ident}        {return ops.type_ident_token();}

{parenth_open}      {return ops.parenth_open_token();}
{parenth_close}     {return ops.parenth_close_token();}
{bracket_open}      {return ops.bracket_open_token();}
{bracket_close}     {return ops.bracket_close_token();}
{curly_open}        {return ops.curly_open_token();}
{curly_close}       {return ops.curly_close_token();}

{separator}         {}
{comment}           {}
{block_comment}     {}

{number_nat}        {return ops.number_nat_token();}
{number_int}        {return ops.number_int_token();}
{number_float}      {return ops.number_float_token();}
{number_bin}        {return ops.number_bin_token();}
{number_hex}        {return ops.number_hex_token();}
{rval_char}         {return ops.rval_char_token();}
{rval_char_arr}     {return ops.rval_char_arr_token();}

{void}              {return ops.void_token();}

{uint8}             {return ops.uint8_token();} 
{uint16}            {return ops.uint16_token();} 
{uint32}            {return ops.uint32_token();} 
{uint64}            {return ops.uint64_token();} 

{int8}              {return ops.int8_token();} 
{int16}             {return ops.int16_token();} 
{int32}             {return ops.int32_token();} 
{int64}             {return ops.int64_token();} 

{float32}           {return ops.float32_token();} 
{float64}           {return ops.float64_token();} 

{bool}              {return ops.bool_token();} 
{true}              {return ops.true_token();} 
{false}             {return ops.false_token();} 

{char}              {return ops.char_token();} 
{uchar}             {return ops.uchar_token();} 

{struct}            {return ops.struct_token();} 

{if}                {return ops.if_token();} 
{elseif}            {return ops.elseif_token();} 
{else1}             {return ops.else1_token();} 
{else2}             {return ops.else2_token();} 

{while}             {return ops.while_token();} 
{for}               {return ops.for_token();} 
{loop}              {return ops.loop_token();} 
{cursor}            {return ops.cursor_token();} 
{function}          {return ops.function_token();}

{identificator}     {return ops.identificator_token();}
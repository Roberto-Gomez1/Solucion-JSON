package Analizadores;
import java_cup.runtime.Symbol;
import java.util.ArrayList;


%%

%{
    //Código de usuario
%}

%class Lexico
%cup
%public
%line
%column
%char
%unicode


//SimboloLenguaje
LLAVE_ABRE= "{"
LLAVE_CIERRA= "}"
CORCH_ABRE = "["
CORCH_CIERRA = "]"
DOS_PUNTOS= ":"
COMA = ","
COMILLA = \"
RTRUE = "true"
RFALSE = "false"
RNULL = "null"

//ExpresionRegular
SPACE = [\ \t\r\n]+
CADENA = \" ([^\"] | "\\\"") + \"
SPACE = [\ \t\r\n]+
ENTERO  = [0-9]+
DECIMAL = [0-9]*\.[0-9]+


%%
<YYINITIAL> {SPACE}             { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {COMILLA}           { /* ignorar las comillas*/}
<YYINITIAL> {DOS_PUNTOS}        {  return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn,yytext());  }
<YYINITIAL> {COMA}              {  return new Symbol(sym.COMA, yyline, yycolumn,yytext());  }
<YYINITIAL> {LLAVE_ABRE}        {  return new Symbol(sym.LLAVE_ABRE, yyline, yycolumn,yytext());  }
<YYINITIAL> {LLAVE_CIERRA}      {  return new Symbol(sym.LLAVE_CIERRA, yyline, yycolumn,yytext());  }
<YYINITIAL> {CORCH_ABRE}      {  return new Symbol(sym.CORCH_ABRE, yyline, yycolumn,yytext());  }
<YYINITIAL> {CORCH_CIERRA}      {  return new Symbol(sym.CORCH_CIERRA, yyline, yycolumn,yytext());  }
<YYINITIAL> {CADENA}            {  return new Symbol(sym.CADENA, yyline, yycolumn,yytext());   }
<YYINITIAL> {ENTERO}            {  return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());   }
<YYINITIAL> {DECIMAL}            {  return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());   }
<YYINITIAL> {RTRUE}            {  return new Symbol(sym.RTRUE, yyline, yycolumn,yytext());   }
<YYINITIAL> {RFALSE}            {  return new Symbol(sym.RFALSE, yyline, yycolumn,yytext());   }
<YYINITIAL> {RNULL}            {  return new Symbol(sym.RNULL, yyline, yycolumn,yytext());   }
<YYINITIAL> . {
        String errLex = "Error léxico : '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+(yycolumn+1);
}
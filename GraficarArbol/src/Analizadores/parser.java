
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\003\004\000\002\003\005\000\002\005\003" +
    "\000\002\005\005\000\002\006\005\000\002\004\004\000" +
    "\002\004\005\000\002\007\003\000\002\007\005\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\010" +
    "\003\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\006\004\005\006\007\001\002\000\004\002" +
    "\000\001\002\000\024\004\005\005\033\006\007\012\011" +
    "\013\017\014\013\015\014\016\022\017\015\001\002\000" +
    "\004\002\027\001\002\000\024\004\005\006\007\007\020" +
    "\012\011\013\017\014\013\015\014\016\022\017\015\001" +
    "\002\000\004\002\uffff\001\002\000\012\005\ufff5\007\ufff5" +
    "\010\ufff5\011\ufff5\001\002\000\006\007\025\010\024\001" +
    "\002\000\012\005\ufff3\007\ufff3\010\ufff3\011\ufff3\001\002" +
    "\000\012\005\ufff0\007\ufff0\010\ufff0\011\ufff0\001\002\000" +
    "\012\005\uffee\007\uffee\010\uffee\011\uffee\001\002\000\012" +
    "\005\ufff2\007\ufff2\010\ufff2\011\ufff2\001\002\000\012\005" +
    "\ufff4\007\ufff4\010\ufff4\011\ufff4\001\002\000\014\002\ufff9" +
    "\005\ufff9\007\ufff9\010\ufff9\011\ufff9\001\002\000\012\005" +
    "\ufff1\007\ufff1\010\ufff1\011\ufff1\001\002\000\012\005\uffef" +
    "\007\uffef\010\uffef\011\uffef\001\002\000\006\007\ufff7\010" +
    "\ufff7\001\002\000\022\004\005\006\007\012\011\013\017" +
    "\014\013\015\014\016\022\017\015\001\002\000\014\002" +
    "\ufff8\005\ufff8\007\ufff8\010\ufff8\011\ufff8\001\002\000\006" +
    "\007\ufff6\010\ufff6\001\002\000\004\002\001\001\002\000" +
    "\006\005\037\010\036\001\002\000\006\005\ufffc\010\ufffc" +
    "\001\002\000\004\011\034\001\002\000\014\002\ufffe\005" +
    "\ufffe\007\ufffe\010\ufffe\011\ufffe\001\002\000\022\004\005" +
    "\006\007\012\011\013\017\014\013\015\014\016\022\017" +
    "\015\001\002\000\006\005\ufffa\010\ufffa\001\002\000\022" +
    "\004\005\006\007\012\011\013\017\014\013\015\014\016" +
    "\022\017\015\001\002\000\014\002\ufffd\005\ufffd\007\ufffd" +
    "\010\ufffd\011\ufffd\001\002\000\006\005\ufffb\010\ufffb\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\036\000\010\002\005\003\003\004\007\001\001\000" +
    "\002\001\001\000\014\003\015\004\020\005\027\006\030" +
    "\010\031\001\001\000\002\001\001\000\012\003\015\004" +
    "\020\007\011\010\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\003\015\004\020\010\025\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\003\015\004\020\010\034\001\001\000" +
    "\002\001\001\000\012\003\015\004\020\006\037\010\031" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible
    public int contador_llaves,contador_members,contador_member,contador_array,contador_elements,contador_value,contador_coma,auxcon_coma=0;
    public void syntax_error(Symbol s){

        System.out.println("Error sintactico: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
        System.out.println("Error NR de sintaxis: "+ s.value +" Linea "+(s.left+1)+" columna "+(s.right+1) );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= json EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // json ::= object 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
String texto="";
if (a instanceof String){
    texto=((String)a).toString();
}
Automata nodo = new Automata(texto);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("json",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // json ::= array 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println(b);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("json",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // object ::= LLAVE_ABRE LLAVE_CIERRA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("object",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // object ::= LLAVE_ABRE members LLAVE_CIERRA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		

        String cad = "";
        cad+="Object"+contador_llaves+"\n";
        cad+="Object"+contador_llaves+"[label=\"Object\"]\n";
        cad+="Object"+contador_llaves+" -> llaveA"+contador_llaves+"\n";
        cad+="llaveA"+contador_llaves+"[label=\"{\"]\n";
        cad+="Object"+contador_llaves+" -> ";
        cad+=b;
        contador_members++;
        cad+="Object"+contador_llaves+" -> llaveC"+contador_llaves+"\n";
        cad+="llaveC"+contador_llaves+"[label=\"}\"]\n";
        contador_llaves++;
        RESULT=cad;
     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("object",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // members ::= member 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
            String cad = "";
            cad+="members"+contador_members+"\n";
            cad+="members"+contador_members+"[label=\"members\"]\n";
            cad+="members"+contador_members+" -> ";
            cad+=a;

            RESULT = cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("members",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // members ::= members COMA member 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
              String cad = "";
                      cad+=a;
                      cad+="members"+contador_members+" -> COMA"+contador_coma+"\n";
                      cad+="COMA"+contador_coma+"[label=\",\"]\n";
                      cad+="members"+contador_members+" -> ";
                      cad+=c;

                      contador_coma++;
              RESULT=cad;

              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("members",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // member ::= value DOS_PUNTOS value 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    String cad = "";
            cad+="member"+contador_member+"\n";
            cad+="member"+contador_member+"[label=\"member\"]\n";
            cad+="member"+contador_member+" -> ";
            cad+=a;
            cad+="member"+contador_member+" -> puntos"+contador_member+"\n";
            cad+="puntos"+contador_member+"[label=\":\"]\n";
            cad+="member"+contador_member+" -> ";
            cad+=c;
            contador_member++;
    RESULT=cad;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("member",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // array ::= CORCH_ABRE CORCH_CIERRA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("array",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // array ::= CORCH_ABRE elements CORCH_CIERRA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    String cad = "";
        cad+="array"+contador_array+"\n";
        cad+="array"+contador_array+"[label=\"Array\"]\n";
        cad+="array"+contador_array+" -> corchA"+contador_array+"\n";
        cad+="corchA"+contador_array+"[label=\"[\"]\n";
        cad+="array"+contador_array+" -> ";
        cad+=b+"\n";
        contador_elements++;
        cad+="array"+contador_array+" -> corchC"+contador_array+"\n";
        cad+="corchC"+contador_array+"[label=\"]\"]\n";
        contador_array++;
        RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("array",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // elements ::= value 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    String cad = "";
                    cad+="elements"+contador_elements+"\n";
                    cad+="elements"+contador_elements+"[label=\"elements\"]\n";
                    cad+="elements"+contador_elements+" -> ";
                    cad+=a;

                    RESULT =cad;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elements",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // elements ::= elements COMA value 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object b = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
           String cad = "";
           cad+=a;
           cad+="elements"+contador_elements+" -> COMA"+contador_coma+"\n";
           cad+="COMA"+contador_coma+"[label=\",\"]\n";
           cad+="elements"+contador_elements+" -> ";
           cad+=c;
           contador_coma++;
           RESULT=cad;
           
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elements",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // value ::= CADENA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String cad = "";
                        cad+="value"+contador_value+"\n";
                        cad+="value"+contador_value+"[label=\"value\"]\n";
                        cad+="value"+contador_value+"-> CADENA"+contador_value+"\n";
                        cad+="CADENA"+contador_value+"[label=\"Cadena\"]\n";
                        cad+="CADENA"+contador_value+" -> a"+contador_value+"\n";
                        cad+="a"+contador_value+"[label="+a+"]\n";
                        contador_value++;
                        RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // value ::= ENTERO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                     String cad = "";
                     cad+="value"+contador_value+"\n";
                     cad+="value"+contador_value+"[label=\"value\"]\n";
                     cad+="value"+contador_value+"-> ENTERO"+contador_value+"\n";
                     cad+="ENTERO"+contador_value+"[label=\"Entero\"]\n";
                     cad+="ENTERO"+contador_value+" -> a"+contador_value+"\n";
                     cad+="a"+contador_value+"[label="+a+"]\n";
                     contador_value++;
                     RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // value ::= DECIMAL 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
       String cad = "";
       cad+="value"+contador_value+"\n";
       cad+="value"+contador_value+"[label=\"value\"]\n";
       cad+="value"+contador_value+"-> DECIMAL"+contador_value+"\n";
       cad+="DECIMAL"+contador_value+"[label=\"Decimal\"]\n";
       cad+="DECIMAL"+contador_value+" -> a"+contador_value+"\n";
       cad+="a"+contador_value+"[label="+a+"]\n";
       contador_value++;
                                              RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // value ::= object 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                        String cad = "";
                        cad+="value"+contador_value+"\n";
                        cad+="value"+contador_value+"[label=\"value\"]\n";
                        cad+="value"+contador_value+"-> ";
                        cad+=a;
                        contador_value++;
                                             RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // value ::= array 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        String cad = "";
        cad+="value"+contador_value+"\n";
        cad+="value"+contador_value+"[label=\"value\"]\n";
        cad+="value"+contador_value+"-> ";
        cad+=a;
        contador_value++;
                                            RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // value ::= RTRUE 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		String cad = "";
        cad+="value"+contador_value+"\n";
        cad+="value"+contador_value+"[label=\"value\"]\n";
        cad+="value"+contador_value+"-> RTRUE"+contador_value+"\n";
        cad+="RTRUE"+contador_value+"[label=\"True\"]\n";
        cad+="RTRUE"+contador_value+" -> a"+contador_value+"\n";
        cad+="a"+contador_value+"[label="+a+"]\n";
                                            contador_value++;
                                            RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // value ::= RFALSE 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		String cad = "";
        cad+="value"+contador_value+"\n";
        cad+="value"+contador_value+"[label=\"value\"]\n";
        cad+="value"+contador_value+"-> RFALSE"+contador_value+"\n";
        cad+="RFALSE"+contador_value+"[label=\"False\"]\n";
        cad+="RFALSE"+contador_value+" -> a"+contador_value+"\n";
        cad+="a"+contador_value+"[label="+a+"]\n";
                                             contador_value++;
                                             RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // value ::= RNULL 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object a = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		String cad = "";
        cad+="value"+contador_value+"\n";
        cad+="value"+contador_value+"[label=\"value\"]\n";
        cad+="value"+contador_value+"-> RNULL"+contador_value+"\n";
        cad+="RNULL"+contador_value+"[label=\"Null\"]\n";
        cad+="RNULL"+contador_value+" -> a"+contador_value+"\n";
        cad+="a"+contador_value+"[label="+a+"]\n";
                                           contador_value++;
                                           RESULT =cad;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}

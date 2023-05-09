package Analizadores;

public class Automata {
    private String dato;

    public Automata(String  dato){
        this.dato = dato;
        prueba(this.dato);
    }
    public String prueba(String aux){
        String graphviz = aux;

        graphviz="digraph G{\n"+graphviz+"\n}";
        System.out.println(graphviz);
        return graphviz;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}

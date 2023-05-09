package Analizadores;

import java.util.ArrayList;

public class Nodo_binario {
private String dato;
private ArrayList<ArrayList> hijo;

    public Nodo_binario(String dato) {
        this.dato = dato;
        this.hijo = new ArrayList<>();
    }

    public void agregar(ArrayList<Automata> argumento){
       this.hijo.add(argumento);
    }
}

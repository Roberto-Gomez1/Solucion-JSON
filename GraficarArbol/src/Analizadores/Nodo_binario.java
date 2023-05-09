package Analizadores;

import java.util.ArrayList;

public class Nodo_binario {
private String dato;
private boolean value,elements,array,member,members,object;
private Nodo_binario hijo;
    public Nodo_binario(String dato) {
        this.dato = dato;
    }
    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public boolean isElements() {
        return elements;
    }

    public void setElements(boolean elements) {
        this.elements = elements;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public boolean isMembers() {
        return members;
    }

    public void setMembers(boolean members) {
        this.members = members;
    }

    public boolean isObject() {
        return object;
    }

    public void setObject(boolean object) {
        this.object = object;
    }



    public Nodo_binario getHijo() {
        return hijo;
    }

    public void setHijo(Nodo_binario hijo) {
        this.hijo = hijo;
    }
}

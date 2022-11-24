/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg7;

/**
 *
 * @author Usuario
 */
public class Nodo <T> {
    private T dato;
    private Nodo <T> siguiente;

    public Nodo(T dato) {
    this(dato, null);
    }

    public Nodo(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo <T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo <T> siguiente) {
        this.siguiente = siguiente;
    }

@Override
    public String toString() {
        String i = "(" + dato + ")";
        return i;
}
}

    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package fes.aragon.utilerias.dinamicas.listasimple;

/**
 *
 * @author Usuario
 */

public class Nodo<E> {
	private E dato;
	private Nodo<E> siguiente;
	public Nodo(E dato) {
		this(dato, null);
	}
	public Nodo(E dato, Nodo<E> siguiente) {
		this.dato = dato;
		this.siguiente=siguiente;
	}
	public E getDato() {
		return dato;
	}
	public void setDato(E dato) {
		this.dato = dato;
	}
	public Nodo<E> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}
}

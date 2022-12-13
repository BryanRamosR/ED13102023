/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Usuario
 */
public class Arreglo<T> implements Iterable<T> {
    int tamanio;
    ArrayList<T> datos;

    public Arreglo(int tam) {
        this.tamanio = tam;
        datos = new ArrayList();
        for (int i = 0; i < this.tamanio; i++) {
            datos.add(null);
        }
    }
    
    public T getElemento(int indice) throws IndexOutOfBoundsException{
        return datos.get(indice);
    }
    
    public void setElemento(int indice, T dato)throws IndexOutOfBoundsException{
        this.datos.set(indice, dato);
    }

    public int getTamanio() {
        return tamanio;
    }
    @Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
    }

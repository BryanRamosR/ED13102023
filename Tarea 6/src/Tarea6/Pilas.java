/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea6;

/**
 *
 * @author Usuario
 */
public class Pilas<T> {
    private T[] pila;
    private int tp;

    public Pilas(int tamanio) {
        pila = (T[]) new Object[tamanio];
        tp = -1;
    }

public boolean estaVacia() { //Consulta si la pila esta vacia 
if (tp == 0) {
            return true;
} else if (tp != 0) {
            return false;
        }
         return estaVacia();
    }

public int tamanio() { //Regresa el numero de elementos de la pila 
    return pila.length;
    }


public T peek() { //Consulta el elemento de hasta arriba (sin tocarlo)
if (estaVacia()) {
            return null;
        }
 return pila[tp];
    }

public T pop() { //Saca el elemento del tope y lo regresa.
        if (estaVacia()) {
            return null;
        }
        T elemento = pila[tp];
        tp--;
        return elemento;
    }

 
public void push(T agregarValor) { //Agrega un elemento al tope de la pila 
            tp++;
            pila[tp] = agregarValor;   
    }

public boolean estaLLena() { // Poner limite al numero de elementos 
        return tp == pila.length - 1;
    }

public String toString() { //Estado actual de la pila 
    String resultado = "Elementos de la pila: ";
       for (int j = 0; j <= tp; j++) { resultado += pila[j] + " , ";}
return resultado;
    }
}

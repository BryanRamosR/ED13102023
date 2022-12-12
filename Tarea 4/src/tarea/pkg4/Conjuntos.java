/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg4;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Conjuntos<T> implements Iterable<T>{
    ArrayList<T> dato = new ArrayList<>();

    public int tamanio() {
        return dato.size();
    }

    public boolean contieneElemento(T valor) {
        return dato.indexOf(valor) != -1;
    }

    public void agregarElemento(T valor) {
        if(!contieneElemento(valor)) {
            dato.add(valor);
        }
    }

    public void borrarElemento(T valor) {
        dato.remove(valor);
    }

    public boolean esIgual(Conjuntos<T> nuevoConjunto) {
        if(tamanio() != nuevoConjunto.tamanio()) {
            return false;
        }
        for(int j = 0; j < tamanio(); j++) {
            if(!nuevoConjunto.contieneElemento(dato.get(j))) {
                return false;
            }
        }
        return true;
    }

    public boolean esSubconjunto(Conjuntos<T> nuevoConjunto) {
        if(tamanio() > nuevoConjunto.tamanio()){
            return false;
        }
        for(int j = 0; j < tamanio(); j++) {
            if(!nuevoConjunto.contieneElemento(dato.get(j))) {
                return false;
            }
        }
        return true;
    }

    public void union(Conjuntos<T> nuevoConjunto) {
        for(int j = 0; j < nuevoConjunto.tamanio(); j++) {
            agregarElemento(nuevoConjunto.dato.get(j));
        }
    }

    public Conjuntos<T> interseccion(Conjuntos<T> nuevoConjunto) {
        Conjuntos<T> resultado = new Conjuntos();
        for(int j = 0; j < tamanio(); j++) {
            if(nuevoConjunto.contieneElemento(dato.get(j))) {
                resultado.agregarElemento(dato.get(j));
            }
        }
        return resultado;
    }

    public Conjuntos<T> diferencia (Conjuntos<T> nuevoConjunto) {
        Conjuntos<T> resultado = new Conjuntos();
        for(int j = 0; j < tamanio(); j++) {
            if(!nuevoConjunto.contieneElemento(dato.get(j))) {
                resultado.agregarElemento(dato.get(j));
            }
        }
        for(int j = 0; j < nuevoConjunto.tamanio(); j++) {
            if(!contieneElemento(nuevoConjunto.dato.get(j))) {
                resultado.agregarElemento(nuevoConjunto.dato.get(j));
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return dato.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int indice = 0;

            @Override
            public boolean hasNext() {
                return indice < dato.size();
            }

            @Override
            public T next() {
                return dato.get(indice++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}



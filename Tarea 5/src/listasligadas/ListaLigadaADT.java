/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasligadas;

/**
 *
 * @author Usuario
 */
public class ListaLigadaADT<T extends Comparable<T>> {
private Nodo<T> head;

    public ListaLigadaADT() {
    head = null;
    }
    
    public boolean estaVacia(){
    return head==null;
    }    

    public int getTamanio(){
    int tamanio = 0;
    Nodo<T> aux = head;

    while(aux != null) {
            aux = aux.getSiguiente();
            tamanio++;
        }
        return tamanio;
    }

    public void agregarAlFinal(T valor) {
        if(estaVacia()) {
            Nodo<T> newNode = new Nodo<>(valor);
            head = newNode;
            return;
        }

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getSiguiente() != null){
            iteratorNode = iteratorNode.getSiguiente();
        }
        Nodo<T> newNode = new Nodo<>(valor);
        iteratorNode.setSiguiente(newNode);
    }

    public void agregarAlInicio(T valor) {
        Nodo<T> newNode = new Nodo<>(valor, head);
        head = newNode;
    }

    public void agregarDespuesDe(T referencia, T valor) {
        if(buscarValor(referencia) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode.getSiguiente() != null && !referencia.equals(iteratorNode.getDato())){
            iteratorNode = iteratorNode.getSiguiente();
        }
        Nodo<T> newNode = new Nodo<>(valor, iteratorNode.getSiguiente());
        iteratorNode.setSiguiente(newNode);
    }


    public void eliminarPosicion(int index) {
        if(this.getTamanio() <= index || estaVacia() || index < 0) return;
        if(index == 0) {
           eliminarElPrimero();
            return;
        }

        int indexPosition = 0;
        Nodo<T> prevNode = null;
        Nodo<T> iteratorNode = head;

        while(iteratorNode.getSiguiente() != null && indexPosition < index){
            prevNode = iteratorNode;
            iteratorNode = iteratorNode.getSiguiente();
            indexPosition++;
        }
        prevNode.setSiguiente(iteratorNode.getSiguiente());
    }

     public void eliminarElPrimero() {
        if(estaVacia()) return;
        head = head.getSiguiente();
    }

    public void eliminarElFinal() {
        if(estaVacia()) return;
        if(getTamanio() == 1) {
            eliminarElPrimero();
            return;
        }
        Nodo<T> previousNode = null;
        Nodo<T> iteratorNode = head;
        while(iteratorNode.getSiguiente() != null){
            previousNode = iteratorNode;
            iteratorNode = iteratorNode.getSiguiente();
        }
        previousNode.setSiguiente(null);
    }

    public int buscarValor(T valor) {
        int indexPosition = 0;
        Nodo <T> iteratorNode = head;
        while(iteratorNode != null){
            if(valor.equals(iteratorNode.getDato())) {
                return indexPosition;
            }
            iteratorNode = iteratorNode.getSiguiente();
            indexPosition++;
        }
        return -1;
    }

    public void actualizar(T a_buscar, T valor){
        if(buscarValor(a_buscar) < 0) return;

        Nodo<T> iteratorNode = head;
        while(iteratorNode != null && !a_buscar.equals(iteratorNode.getDato())){
            iteratorNode = iteratorNode.getSiguiente();
        }
        if(iteratorNode.getDato() != a_buscar) return;
        iteratorNode.setDato(valor);
    }

    @Override
    public String toString() {
        String arrrayListString = "";
        Nodo<T> iteratorNode = head;
        while(iteratorNode != null){
            arrrayListString += iteratorNode;
            iteratorNode = iteratorNode.getSiguiente();
        }
        return arrrayListString;
    }
}
    
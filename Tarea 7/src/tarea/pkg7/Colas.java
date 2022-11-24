/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg7;

/**
 *
 * @author Usuario
 */
    public class Colas<T> {

    private class Nodo <T> {
    public Nodo <T> next;
    public T valor;
    }

    private Nodo<T> init, finish;
    

    public boolean estaVacia() {
        boolean cola = false;
        if (init == null & finish == null) {
            cola = true;

        } else {

            cola = false;
        }
        return cola;
    }
    
    public int tamanio(){
       int cont =0;
       Nodo<T> c = init;
       while(c!=null){
           c=c.next;
           cont++;
       }
       return cont+1;
    }

    public void enqueue(T valorNuevo) {
        Nodo<T> nuevoNodo = new Nodo<>();
        nuevoNodo.valor = valorNuevo;
        if (estaVacia()) {
            init = finish = nuevoNodo;
        } else {
            finish.next = nuevoNodo;
            finish = nuevoNodo;
        }
    }

    public T dequeue() {
        if (!estaVacia()) {
            T ax = init.valor;
            init = init.next;
            if (init == null) {
                finish = null;
            }
            return ax;
        }
        return null;
    }

  public void to_String() {
       
   int conta=0;
       Nodo<T> a = init;
   while(conta<=tamanio()-1){
            if(a==null){
    System.out.println("La cola esta vacia");
             break;
   }else{
    System.out.println(a.valor);
     a=a.next;
     conta++;
            }
        }
   }
}





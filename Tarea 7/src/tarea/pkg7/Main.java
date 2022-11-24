/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg7;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Colas colas = new Colas<>();
    
      System.out.println("La cola esta vacia? " + colas.estaVacia());
 
        colas.enqueue(45);
        colas.enqueue(10);
        colas.enqueue(22);
        colas.enqueue(2);
        
        colas.dequeue();
        colas.dequeue();

        System.out.println("Tamaño de la cola: " + colas.tamanio());

        System.out.println(colas.toString());
    }
    
}

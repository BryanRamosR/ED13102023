/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea6;

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
        Pilas<Integer> pl = new Pilas<>(8);

        System.out.println("¿La pila esta vacia?: " + pl.estaVacia());

        System.out.println("push 1");
        pl.push(1);
        System.out.println("push 3");
        pl.push(3);
        System.out.println("push 5");
        pl.push(5);
        System.out.println("push 7");
        pl.push(7);
        System.out.println("push 9");
        pl.push(9);
        System.out.println("push 11");
        pl.push(11);
        System.out.println("push 13");
        pl.push(13);
        System.out.println("push 15");
        pl.push(15);

        System.out.println("¿La pila esta llena? : " + pl.estaLLena());
        System.out.println(pl);

        System.out.println("Tamaño de la pila: " + pl.tamanio());

        System.out.println("peek : " + pl.peek());
        
        System.out.println("pop : " + pl.pop());
        System.out.println(pl);

    }

}

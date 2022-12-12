/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg4;

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

        Conjuntos<Integer> c1 = new Conjuntos();
        Conjuntos<Integer> c2 = new Conjuntos();

        c1.agregarElemento(5);
        c1.agregarElemento(9);
        c1.agregarElemento(11);
       
        c2.agregarElemento(18);
        c2.agregarElemento(25);
        c2.agregarElemento(40);
        c2.agregarElemento(57);
        
        System.out.println(" Tamaño del conjunto 1: " + c1.tamanio());
        System.out.println(" Tamano del conjunto 2: " + c2.tamanio());
  
        System.out.println(" ¿El conjunto tiene el numero 32? " + c1.contieneElemento(32));
        System.out.println(" ¿El conjunto tiene el numero 18? " + c2.contieneElemento(18));

        c1.borrarElemento(11);
        c2.borrarElemento(40);

        System.out.println(" ¿Es un subconjunto? " + c1.esSubconjunto(c2));

        c1.union(c2);
        System.out.println(" Union de conjuntos :  " + c1);

        Conjuntos<Integer> cIntersection = c1.interseccion(c2);
        System.out.println(" Interseccion de conjuntos : " + cIntersection);

        Conjuntos<Integer> diferenciaConjunto = c1.diferencia(c2);
        System.out.println(" Diferencia de conjuntos : " + diferenciaConjunto);

        
    }
    
}

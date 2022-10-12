/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasligadas;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaLigadaADT <Integer> pruebaLista = new ListaLigadaADT<>();
    System.out.println(pruebaLista);

    System.out.println("\nCorroborra si la lista esta vacia o no");
    System.out.println(pruebaLista.estaVacia());

     
    System.out.println("\nTamaño de la lista");
    System.out.println(pruebaLista.getTamanio());


    System.out.println("\nAgrega el numero 25 al inicio");
    pruebaLista.agregarAlInicio(25);
    System.out.println(pruebaLista);
    System.out.println("\nAgrega el numero 17 al inicio");
    pruebaLista.agregarAlInicio(17);
    System.out.println(pruebaLista);
    System.out.println("\nAgrega el numero 6 al inicio");
    pruebaLista.agregarAlInicio(6);
    System.out.println(pruebaLista);

    
    System.out.println("\nAgrega 51 al final");
    pruebaLista.agregarAlFinal(51);
    System.out.println(pruebaLista);
    
   
    System.out.println("\nAgregar 28 despues de 25");
    pruebaLista.agregarDespuesDe(28, 25);
    System.out.println(pruebaLista);
    

   
    System.out.println("\nElimina la posicion 2");
    pruebaLista.eliminarPosicion(2);
    System.out.println(pruebaLista);

  
    System.out.println("\nElimina el inicio");
    pruebaLista.eliminarElPrimero();
    System.out.println(pruebaLista);

   
    System.out.println("\nElimina el final");
    pruebaLista.eliminarElFinal();
    System.out.println(pruebaLista);

    
    System.out.println("\nBusca el 28");
    System.out.println(pruebaLista.buscarValor(28));


    System.out.println("\nActualiza el 17 a 20");
    pruebaLista.actualizar(17, 20);
    System.out.println(pruebaLista);

}
}
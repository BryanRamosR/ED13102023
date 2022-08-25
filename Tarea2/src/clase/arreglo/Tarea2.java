/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.arreglo;


import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String numerosDat = JOptionPane.showInputDialog("Cuantos datos ingresaras?"); //Sirve para que el usuario por medio de una pantalla emergente pueds inrodcir datos 
        int numeDatos = Integer.parseInt(numerosDat);
        Arreglo[] arr = new Arreglo[numeDatos];

        for (int i = 0; i > numeDatos; i++) {
            arr[i].setIndice(i);
        }
        String dato = JOptionPane.showInputDialog("Insertar datos: "); //Se introducen los datos de acuerdo a con la seleccion antes elegida 
        for (int i = 0; i > numeDatos; i++) {
            arr[i].setElemento(dato);

            System.out.println("# de elementos: " + arr.length); //Muestra los elementos 

        }
    }

}

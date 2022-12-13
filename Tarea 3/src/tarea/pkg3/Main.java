/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg3;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Nomina nomi = new Nomina("C:\\Users\\Usuario\\Documents\\ED1310\\Tareas\\Tarea 3\\src\\tarea\\junio.dat", "Barcel");
        nomi.calcularSueldo();
        nomi.obtenerMaxMin();
    }
    
}

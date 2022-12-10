/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Arreglo {
    private String[] array = new String[]{};
    private String elemento;

    public Arreglo() {
    }

    public Arreglo(String elemento) {
        this.elemento = elemento;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

   public int ObtenerTamanio(){  //retorna el tamaño
        int tamanio = array.length;
        return tamanio;
   }

   public void AñadirElemento(){ // Establece un elemento en una posicion especifica
        String posicion = JOptionPane.showInputDialog("");
        int indice = Integer.parseInt(posicion);
        String agregarElemento = JOptionPane.showInputDialog("Ingrese el elemento a añadir: ");
        array[indice] =  agregarElemento;
    }

   public void RegresarPosicion(){ // Regresa el elemento en el indice solicitado
        String posicionBuscada=JOptionPane.showInputDialog("que elemento desea ver");
        int posicionElemento = Integer.parseInt(posicionBuscada);
        System.out.println(array[posicionElemento]);
}

   public void limpiar(String array[]){
        String nuevoElemento = "";
        for 
        (int j = 0; j < array.length; j++) 
        {
        array[j].replaceAll(array[j], nuevoElemento);
        }
    }
    
    @Override
    public String toString() {
        return "Array{" + "array=" + array + ", elemento=" + elemento + '}';
    }

}




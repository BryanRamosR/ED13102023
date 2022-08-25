/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.arreglo;

/**
 *
 * @author Usuario
 */
public class Arreglo {
     private int numElem;
     private int longArr;
     private String elemento;
     private int indice;
     private String contenido;

    public Arreglo() {
    }

    public Arreglo(int numElem, int longArr, String elemento, int indice, String contenido) {
        this.numElem = numElem;
        this.longArr = longArr;
        this.elemento = elemento;
        this.indice = indice;
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNumElem() {
        return numElem;
    }

    public void setNumElem(int numElem) {
        this.numElem = numElem;
    }

    public int getLongArr() {
        return longArr;
    }

    public void setLongArr(int longArr) {
        this.longArr = longArr;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
     
    /*public void limpiar(){
    for (int i = 0; i < longArr.length; i++) {
			longArr[i] = null;
		}
    }
    */
    
    @Override
    public String toString() {
        return "Los datos son :  -----" + elemento;
    }
}

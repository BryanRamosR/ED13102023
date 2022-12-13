/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package fes.aragon;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

import fes.aragon.modelo.Calculos;

public class Main {
    /**
     * @param args the command line arguments
     */
	public static void main(String[] args) {
            // TODO code application logic here
		Calculos cl = new Calculos();
		Scanner leer = new Scanner(System.in);
		String ruta = System.getProperty("user.dir") + "\\src\\fes\\aragon\\recursos\\presenciaredes.csv";
		cl.leerArchivo(ruta);
		cl.precenciaRedes.imprimeToString();
		System.out.println();
		cl.diferenciaSeguidoresTwitter();
		System.out.println("\nDame los meses en los que desees comparar las visualizaciones de youtube en su formato numerico, ejemplo: ");
		System.out.println("Enero = 1, Febrero = 2, Marzo = 3, Abril = 4, Mayo = 5, Junio = 6");
		int mes1 = leer.nextInt();
		int mes2 = leer.nextInt();
		cl.diferenciaVisualizacionYoutube(mes1, mes2);
		cl.promedioCrecimientoTyF();
		leer.close();
	}
}

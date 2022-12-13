/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package fes.aragon.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
/**
 *
 * @author Usuario
 */
public class Calculos {
	private BufferedReader lector;
	private String linea;
	String[] palabras = new String[15];
	public ListaSimple<String> redesAgregar = new ListaSimple<>();
	public ListaSimple<precenciaredes> precenciaRedes = new ListaSimple<>();

	public void leerArchivo(String nombreArchivo) {

		try {
			lector = new BufferedReader(new FileReader(nombreArchivo));
			while ((linea = lector.readLine()) != null) {
				// palabras = new String[1];
				palabras = linea.split(",");
				for (int i = 0; i < palabras.length; i++) {
					redesAgregar.agregarEnCabeza(palabras[i]);
				}
				if (palabras.length == 14) {
					redesAgregar.agregarEnCabeza("N/A");
				}
				precenciaRedes.agregarEnCola(new precenciaredes(redesAgregar.obtenerNodo(14),
						redesAgregar.obtenerNodo(13), redesAgregar.obtenerNodo(12), redesAgregar.obtenerNodo(11),
						redesAgregar.obtenerNodo(10), redesAgregar.obtenerNodo(9), redesAgregar.obtenerNodo(8),
						redesAgregar.obtenerNodo(7), redesAgregar.obtenerNodo(6), redesAgregar.obtenerNodo(5),
						redesAgregar.obtenerNodo(4), redesAgregar.obtenerNodo(3), redesAgregar.obtenerNodo(2),
						redesAgregar.obtenerNodo(1), redesAgregar.obtenerNodo(0)));
			}
			lector.close();
			linea = null;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

	public void diferenciaSeguidoresTwitter() {
		int diferencia = Integer.parseInt(precenciaRedes.obtenerNodo(8).getEnero())
				- Integer.parseInt(precenciaRedes.obtenerNodo(8).getJunio());
		System.out.println("La diferencia de seguidores en Twitter entre enero y junio es: " + diferencia);
	}

	public void diferenciaVisualizacionYoutube(int mes1, int mes2) {
		int a = 0, b = 0;
		String mesPedido1 = null;
		String mesPedido2 = null;
		switch (mes1) {
		case 1:
			a = Integer.parseInt(precenciaRedes.obtenerNodo(16).getEnero());
			mesPedido1 = "Enero";
			break;
		case 2:
			a = Integer.parseInt(precenciaRedes.obtenerNodo(16).getFebrero());
			mesPedido1 = "Febrero";
			break;
		case 3:
			a = Integer.parseInt(precenciaRedes.obtenerNodo(16).getMarzo());
			mesPedido1 = "Marzo";
			break;
		case 4:
			a = Integer.parseInt(precenciaRedes.obtenerNodo(16).getAbril());
			mesPedido1 = "Abril";
			break;
		case 5:
			a = Integer.parseInt(precenciaRedes.obtenerNodo(16).getMayo());
			mesPedido1 = "Mayo";
			break;
		case 6:
			a = Integer.parseInt(precenciaRedes.obtenerNodo(16).getJunio());
			mesPedido1 = "Junio";
			break;
		}
		switch (mes2) {
		case 1:
			b = Integer.parseInt(precenciaRedes.obtenerNodo(16).getEnero());
			mesPedido2 = "Enero";
			break;
		case 2:
			b = Integer.parseInt(precenciaRedes.obtenerNodo(16).getFebrero());
			mesPedido2 = "Febrero";
			break;
		case 3:
			b = Integer.parseInt(precenciaRedes.obtenerNodo(16).getMarzo());
			mesPedido2 = "Marzo";
			break;
		case 4:
			b = Integer.parseInt(precenciaRedes.obtenerNodo(16).getAbril());
			mesPedido2 = "Abril";
			break;
		case 5:
			b = Integer.parseInt(precenciaRedes.obtenerNodo(16).getMayo());
			mesPedido2 = "Mayo";
			break;
		case 6:
			b = Integer.parseInt(precenciaRedes.obtenerNodo(16).getJunio());
			mesPedido2 = "Junio";
			break;
		}
		int diferencia = a - b;
		System.out.println(
				"La diferencia de visualizaciones entre " + mesPedido1 + " " + mesPedido2 + "es: " + diferencia);
	}

	public void promedioCrecimientoTyF() {
		int cT = Integer.parseInt(precenciaRedes.obtenerNodo(9).getEnero())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(9).getFebrero())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(9).getMarzo())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(9).getAbril())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(9).getMayo())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(9).getJunio());
		int cF = Integer.parseInt(precenciaRedes.obtenerNodo(2).getEnero())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(2).getFebrero())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(2).getMarzo())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(2).getAbril())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(2).getMayo())
				+ Integer.parseInt(precenciaRedes.obtenerNodo(2).getJunio());
		int promedioTwitter = cT / 6;
		int promedioFacebook = cF / 6;

		System.out.println("El promedio de crecimiento de Facebook: " + promedioFacebook);
		System.out.println("El promedio de crecimiento de Twitter: " + promedioTwitter);

	}

}

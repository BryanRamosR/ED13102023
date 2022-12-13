/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package proyectofinal;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 */

public class ejemploTreeMap {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

        Map<String, String> coloresFavoritos = new TreeMap<>();

        coloresFavoritos.put("Bryan", "Rojo");
        coloresFavoritos.put("Rodrigo", "Verde");
        coloresFavoritos.put("Jose", "Azul");
        coloresFavoritos.put("David", "Amarillo");

        for (Map.Entry<String, String> entrada : coloresFavoritos.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }
    }
}



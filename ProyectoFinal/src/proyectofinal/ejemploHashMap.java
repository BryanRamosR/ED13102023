/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package proyectofinal;

import java.util.HashMap;
import java.util.Map;

public class ejemploHashMap {
    /**
 *
 * @author Usuario
 */
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();

        edades.put("Juan", 30);
        edades.put("Ana", 25);
        edades.put("Pedro", 33);

        int edadJuan = edades.get("Juan");
        System.out.println("Edad de Juan: " + edadJuan);

        for (Map.Entry<String, Integer> entrada : edades.entrySet()) {
            String nombre = entrada.getKey();
            int edad = entrada.getValue();
            System.out.println(nombre + " tiene " + edad + " años");
        }
    }
}


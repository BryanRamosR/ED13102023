package proyectofinal;

import java.util.LinkedHashMap;
import java.util.Map;

public class ejemploLinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> elementos = new LinkedHashMap<>();

        elementos.put("A", 1);
        elementos.put("B", 2);
        elementos.put("C", 3);
        elementos.put("D", 4);

        for (Map.Entry<String, Integer> entrada : elementos.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        elementos.remove("B");

        System.out.println("Tamaño del mapa: " + elementos.size());

        System.out.println("¿El mapa contiene la clave 'C'? " + elementos.containsKey("C"));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Nomina {
     private String Empresa;
    private Arreglo<Empleado> empleados;
    private String Archivo;
    public static String saltoLinea = "\n";
    public static String coma = ",";

    public Nomina(String Archivo, String Empresa) throws IOException {
        this.Empresa = Empresa;
        this.Archivo = Archivo;
        int cont = 0;
        String line, fileContent = " ";
        BufferedReader leerBuffer = new BufferedReader(new FileReader(this.Archivo));

        leerBuffer.readLine();
        while((line = leerBuffer.readLine()) != null) {
            fileContent += line + "\n";
            cont++;
        }
        leerBuffer.close();

        String[] saltosLinea = fileContent.split(saltoLinea);

        empleados = new Arreglo<>(cont);

        for(int j = 0; j < saltosLinea.length; j++) {
            String[] comas = saltosLinea[j].split(coma);
            Empleado empleadoT = new Empleado();
            empleadoT.setId(parseInt(comas[0]));
            empleadoT.setNombre(comas[1]);
            empleadoT.setPaterno(comas[2]);
            empleadoT.setMaterno(comas[3]);
            empleadoT.setHorasExtra(parseInt(comas[4]));
            empleadoT.setSueldoBase(parseInt(comas[5]));
            empleadoT.setAnioIngreso(parseInt(comas[6]));
            empleados.setElemento(j, empleadoT);
        }
    }

    public void calcularSueldo() {
        for(int j = 0; j < empleados.getTamanio(); j++){
            System.out.println(empleados.getElemento(j));
            System.out.println("Sueldo total: " + empleados.getElemento(j).calcularSueldo());
        }
    }

    public void Mx_Mn() {
        Empleado mxEmpleado = empleados.getElemento(0);
        Empleado mnEmpleado = empleados.getElemento(0);
        for ( Empleado actualEmpleado : empleados){
            if(actualEmpleado.getAnioIngreso() > mxEmpleado.getAnioIngreso()) {
                mxEmpleado = actualEmpleado;
            }
            if(actualEmpleado.getAnioIngreso() < mnEmpleado.getAnioIngreso()) {
                mnEmpleado = actualEmpleado;
            }
        }

        System.out.println("Empleado con menor antiguedad : ");
        System.out.println(mnEmpleado);

        System.out.println("Empleado cn mayor antiguedad : ");
        System.out.println(mxEmpleado);

        System.out.println("Empleados con mayor y menor antiguedad en " + Empresa);

    }
}
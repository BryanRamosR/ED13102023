/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarearedes;

import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class TareaRedes {     
        private String line;
        private BufferedReader reader;
        private String parts[] = null;

public void leerArchivo(String Archivo){
        try{
reader = new BufferedReader(new FileReader(Archivo));
while((line=reader.readLine())!=null){
                parts=line.split(",");
                imprimir();
                System.out.println();
                
            }
    reader.close();
    line=null;
    parts=null;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
                                                     }
                                                         }
    public void imprimir(){
        for(int i = 0; i <parts.length; i++){
            System.out.println(parts[i]+"  |  ");
        }
    }
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diahabil;

import java.util.Scanner;

/**
 *
 * @author End User
 */
public class DiaHabil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia;
        String text = null;
        String texts = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que día desea conocer si es hábil o inhábil?\nSeleccione el día según la lista: \nLunes[1] \nMartes[2] \nMiercoles[3] \nJueves[4] \nViernes[5] \nSábado[6] \nDomingo[7]");
        dia = sc.nextInt();
        
        if (dia > 0 && dia <= 7){
        switch (dia) {
            case 1:
                texts = "lunes";
                text="hábil";
                break;
            case 2:
                texts = "martes";
                text="hábil";
                break;
            case 3:
                texts = "miercoles";
                text="hábil";
                break;
            case 4:
                texts = "jueves";
                text="hábil";
                break;
            case 5:
                texts = "viernes";
                text="hábil";
                break;
            case 6:
                texts = "sábado";
                text="inhábil";
                break;
            case 7:
                texts = "domingo";
                text="inhábil";
                break;
            default:
               
                break;
        }
         System.out.println("El día " + texts + " es " + text);
        }else {
         System.out.println("Favor de escribir un número que este dentro de la lista");
        }
        
    }
    
}

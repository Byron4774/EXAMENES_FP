/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg25550468_examen_eva1;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int tnatacion, tciclismo,tcarrera, stiempos;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Introduzca el tiempo en minutos de las pruebas de: ");
        System.out.println("Ciclismo: " );
        tciclismo = input.nextInt();
        System.out.println("Natacion: ");
        tnatacion = input.nextInt();
        System.out.println("Carrera: ");
        tcarrera = input.nextInt();
        
        stiempos = tnatacion + tciclismo + tcarrera;
        
        if(stiempos < 120 && tciclismo < 60 && tcarrera < 60 && tnatacion < 60){
            System.out.println("Calificacion Excelente");
        }else{
            if(stiempos < 150 || tciclismo < 70 || tcarrera < 70 || tnatacion < 70){
                System.out.println("Calificacion Buena");
            }else{
                System.out.println("Calificacion Regular");
                
            }
        }
        
    }
    
}

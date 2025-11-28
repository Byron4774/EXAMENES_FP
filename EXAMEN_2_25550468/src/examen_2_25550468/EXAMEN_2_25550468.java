/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_2_25550468;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN_2_25550468 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numero;
        String valor = "*";
        
        
        while(true) {
          
            
            System.out.print("Introduce un número: ");
            numero = input.nextInt();
            
            boolean esPrimo = true;
            int i = 2;
            
            if(numero <= 1) {
                esPrimo = false;
            } else {
            
                while(i < numero) {
                    if(numero % i == 0) {
                        esPrimo = false;
                        break;  
                    }
                    i++;
                }
            }
            
            for (int numeros = 2; numeros <= numero; numeros++) {
                int o = 2;
                if(esPrimo = true && numeros % o != 0){
                    
                    System.out.println(numeros);
                    numeros++;
                    
                    
                    
            }else{
                    System.out.println(numeros);
                    numeros++;
                    
                }
            }
            
            if(esPrimo) {
                System.out.println("Su numero es primo");
                System.out.println("Los numeros primos entre 2 y " + numero + " son:");
                for(int j = 0; j < numero; j++){
            System.out.print(numero + " ");
            System.out.println(valor);
            valor += "*";    
        }
            } else {
                System.out.println("Su numero no es primo");
                System.out.println("Los numeros no primos entre 2 y " + numero + " son:");
                for(int j = 0; j < numero; j++){
            System.out.print(numero + " ");
            System.out.println(valor);
            valor += "*";    
        }
            }
            
            System.out.println("1. Continuar");
            System.out.println("2. Finalizar");
            int eleccion = input.nextInt();
            if(eleccion == 2) {
                System.out.println("Finalizado.");
                break;
            }
            for (int j = 1; j < numero; j++) {
                System.out.println(numero);
                
            }
            
        }
    }
    
}

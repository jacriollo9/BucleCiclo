/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucleciclo;

import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class CondicionesAnidadas10000 {
  public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int media = 0;
        int suma = 0;
        int i = 0;
        int num = 0;
        int suma1 = 0;
        
        System.out.println("**Programa que permita introduciendo una serie de numeros indeterminados"
                + " su suma no tiene que superar el valor de 10000**");
        
        //Ciclo
        while(suma <= 10000){
            System.out.println("Ingrese los valores a sumar");
            num = leer.nextInt();
            
            suma1 = suma;
            suma = suma + num;
            i = i +1;
            
            if(suma > 10000){
                System.out.println(" Total acumulado es: "  +suma1 );
                System.out.println(" El total de números ingresados es: " +(i-1) );
                media = suma1 /(i-1);
                System.out.println(" La media es: " +media);
            }
        } 
    }  
}

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
public class Numeros320_160 {
    
   public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Programa que permita calcular los numeros del 360 al 160 ");
        
       //Declaracion de variables
       
       int i = 320;
       
       while (i >= 160){
           System.out.println("Los numeros del 360 al 160 son: " +i);
           i -= 20;
       } 
   } 
}

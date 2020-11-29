/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucleciclo;

/**
 *
 * @author Usuario iTC
 */
public class BucleCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
    {
        int c = 0;
        int m5 = 0;
        int si = 0;
        
        for (c = 0; c <= 100; c++){
            if (c % 5 == 0){
                m5 = c;
                System.out.println("Los multiplos de 5 son: "+m5);
                si = si + 1;
            }
        }
        System.out.println("Los multiplos totales de 5 son: "+si);
        
        System.out.println("Genracion con Do-while");
        c = 0;
        si = 0; 
        do
        {          
            if (c % 5 == 0)
            {
                si++;
                m5=c;
                
                System.out.println("Los multiplos de 5 son: "+m5);
            }
            c++;
        } while (c <= 100);
        System.out.println("Los multiplos de 5 Existe: " +si);
    }  
}


        

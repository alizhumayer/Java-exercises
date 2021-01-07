package Oszto;

import java.util.Scanner;

public class Input {

    public static void main(String[]args) {
        
        Scanner input = new Scanner( System.in);
        int num01, num02;
        
        System.out.print(" Kérem az első számot: ");
        num01= input.nextInt();
        
        
        System.out.print(" Kérem a második számot: ");
        num02= input.nextInt();
        
    
        
        if ((num01%num02)==0) {
            
            System.out.printf("A num02 (%d) osztója num01-nek (%d).", num02, num01); 
        }
           
        else {
        
            System.out.printf("A num02 (%d) nem osztója num01-nek (%d).", num02, num01);
               
        }      
      }
   }


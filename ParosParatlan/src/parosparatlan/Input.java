package parosparatlan;

import java.util.Scanner;

public class Input {

    public static void main( String args[]) {
         Scanner input = new Scanner (System.in);
         int number;
         System.out.print(" Kérem a számot: ");
         
         number = input.nextInt();
         
         System.out.println("A szám: " + number );
         
         if(number%2==0)
         {
         
             System.out.println("páros");
         }
         
         else
             
         {
             
             System.out.println("páratlan");
         }
         
    }

}
package parosparatlan;

import java.util.Scanner;

public class Input {

    public static void main( String args[]) {
         Scanner input = new Scanner (System.in);
         int number;
         System.out.print(" K�rem a sz�mot: ");
         
         number = input.nextInt();
         
         System.out.println("A sz�m: " + number );
         
         if(number%2==0)
         {
         
             System.out.println("p�ros");
         }
         
         else
             
         {
             
             System.out.println("p�ratlan");
         }
         
    }

}
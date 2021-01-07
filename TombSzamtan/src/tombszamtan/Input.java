
// Humayer Aliz 2020.05.22.

package tombszamtan;

import java.util.Scanner;

public class Input {
    
    public static void main (String[] args) {
        
        System.out.println("Humayer Aliz 2020.05.22\n10 elem kiirasa es szamtani kozep szamitasa");
        
        Scanner scan = new Scanner(System.in);
        
        int[] numbers = new int[ 10 ];
        
        int number = 0;
        
        for( int i= 0; i <10; i++ ) {
            
            System.out.print("Kerem a " + (i+1) +  ". szamot: ");
            number = scan.nextInt(); 
            numbers[ i ] = number;
        }
        
        for (int i = 0; i< numbers.length; i++ ) { 
             
             System.out.printf( "%d\t", numbers[ i ] );
        }
        
            //result = result + numbers[i];
            // result += numbers[i];
        int result = 0;
        for (int i =0; i < numbers.length; i++) {
                    
            result += numbers[i]; 
        
        }
            
            int avg = result / numbers.length;
            
            System.out.println("\nA tomb elemeinek szamtani kozepe: " + avg);
        
    }
}
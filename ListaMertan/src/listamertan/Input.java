
//Humayer Aliz 2020.05.24.

package listamertan;

import java.util.Scanner;

import java.util.ArrayList;

public class Input {
    
private static Scanner scan;
    
public static void main (String[] args) {

System.out.println("Humayer Aliz 2020.05.24\n10 tetszoleges valos szam kiirasa es mertani kozep szamitasa"); 
    
Scanner scan = new Scanner(System.in);

System.out.println("");
ListaMertan();
}


private static void ListaMertan()
 {
     ArrayList<Double> szamok = new ArrayList<Double>();
     ListaMertan_beker(szamok);
     double mertan=ListaMertan_szamol(szamok);
     ListaMertan_kiir(szamok, mertan);
 }
 
 private static void ListaMertan_beker(ArrayList<Double> szamok)
 {
     System.out.println("ListaMertan");
     System.out.println("Kérem adjon meg legalább 10 db számot!");
     System.out.println("Ha szeretné befejezni, akkor az szám legyen egyenlő -1.0-val, azaz minusz eggyel!");
     System.out.println("Tizedes PONT!");
     
     Double szam;
     int count=0;
     boolean vege;
     do
     {
         String txt = String.format("(%3d)szám=", count+1);
         szam=getDouble(txt);
         vege=(szam == -1.0);
         if (!vege)
         {
             szamok.add(szam);
             count++;
         }
         else 
         {
             if (count < 10)
             {
                 System.out.printf("Minimum 10 darab kell, ez még csak a (%d)-ik!\n", count+1);
                 vege=false;
             }
         }
     } while  (!vege);
     System.out.println("");
 }   

 private static Double getDouble(String txt) {
    
    return null;
}


private static double ListaMertan_szamol(ArrayList<Double> szamok)
 {
     double rc=0;
     int i=0;
     double total=1;
     int len=szamok.size();
     while (i<len)
     {
         total = total * szamok.get(i);
         i++;
     }
     
     rc=Math.pow(total, (1.0/i));
     return rc;
 }   

 private static void ListaMertan_kiir(ArrayList<Double> szamok, double mertan)
 {
     int len=szamok.size();
     System.out.printf("A lista elemeinek a száma : %d\n", len);
     int i=0;
     while (i < len)
     {
         int j=0;
         while ((j < 5) && (i < len))
         {
             System.out.printf("%.3f\t", szamok.get(i));
             j++;
             i++;
         }
         System.out.printf("\n");
     }
     System.out.printf("A lista elemeinek mértani közepe : %.6f\n", mertan);
  } 
 
} 
 

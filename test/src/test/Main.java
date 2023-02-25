
package test;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    
      double value=sc.nextDouble();
      int t =(int)value;                                                    
      int f =((int) (value*100) % 100);
        System.out.println("NOTAS:");
        System.out.println((t / 100)+" nota(s) de R$ 100.00");
         t = t%100;
        System.out.println((t / 50)+" nota(s) de R$ 50.00");                                 
        t = t%50;
        System.out.println((t/20 )+" nota(s) de R$ 20.00");
        t = t%20;
        System.out.println((t/10)+" nota(s) de R$ 10.00");
        t = t%10;
        System.out.println((t/5)+" nota(s) de R$ 5.00");
         t =t%5;
        System.out.println((t/2)+" nota(s) de R$ 2.00");
         t = t%2;
        System.out.println("MOEDAS:");
        System.out.println((t)+" moeda(s) de R$ 1.00");
       
        System.out.println((f/50)+" moeda(s) de R$ 0.50");
        f=f%50;
        System.out.println((f/25)+" moeda(s) de R$ 0.25");
        f=f%25;
        System.out.println((f/10)+" moeda(s) de R$ 0.10");
        f=f%10;
        System.out.println((f/5)+" moeda(s) de R$ 0.05");
        f=f%5;
        System.out.println((f/1)+" moeda(s) de R$ 0.01");
        
    }
}     
        
 

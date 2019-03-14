
package jthchar;

import java.util.Scanner;

/**
 * @version 1.1
 * @author mauri_Simone
 */
public class JThChar {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        DatiCondivisi dc = new DatiCondivisi();
        int n = 0;
        while( n < 1 ){
        
            System.out.println("Quanti caratteri vuoi stampare?");
            n = sc.nextInt();
        }
            System.out.println("Avvio...");
            System.out.println();
            System.out.println();
            System.out.println();
        Th1 th1 = new Th1(dc,n);
        Th2 th2 = new Th2(dc);
        Th3 th3 = new Th3(dc);
        ThVisual thVisual = new ThVisual(dc);
        
        th1.start();
        th2.start();
        th3.start();
        thVisual.start();
        
        
    }
    
}

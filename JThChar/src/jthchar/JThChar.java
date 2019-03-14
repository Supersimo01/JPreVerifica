/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jthchar;

/**
 *
 * @author mauri_Simone
 */
public class JThChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DatiCondivisi dc = new DatiCondivisi();
        
        Th1 th1 = new Th1(dc,100);
        Th2 th2 = new Th2(dc);
        Th3 th3 = new Th3(dc);
        ThVisual thVisual = new ThVisual(dc);
        
        th1.start();
        th2.start();
        th3.start();
        thVisual.start();
        
        
    }
    
}

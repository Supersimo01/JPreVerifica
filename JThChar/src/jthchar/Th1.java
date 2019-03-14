/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jthchar;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauri_Simone
 */
public class Th1 extends Thread{
    
    Random rn;
    DatiCondivisi dc;
    int nStop;
    public Th1(DatiCondivisi dc, int n) {
        this.dc = dc;
        rn = new Random();
        this.nStop = n;
    }
    
    @Override
    public void run(){
    
        while(dc.getBuffer().size() < nStop){
        int n = 59 + rn.nextInt(31);
            try {
                dc.sAddChar.acquire();
                
                if(n < 62){
                    dc.getBuffer().add('.');
                    dc.incPunti();
            }
                else if(n<65){
                      dc.getBuffer().add(' ');
                      dc.incSpazi();
                }
                else{
                    dc.getBuffer().add((char) n);
                }
                dc.sSpazi.release();
        }   catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
                  }
           
    }
    
}

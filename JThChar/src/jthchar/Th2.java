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
public class Th2 extends Thread{
    
    DatiCondivisi dc;

    public Th2(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    @Override
    public void run(){
    
        while(true){
            
            try {
                dc.sSpazi.acquire();
                
                if(dc.getBuffer().lastElement().equals(' '))
                {
                    dc.incSpaziLetti();
                }
                
                dc.sPunti.release();
        }   catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
                  }
           
    }
    
}

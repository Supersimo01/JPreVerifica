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
public class Th3 extends Thread{
    
    DatiCondivisi dc;

    public Th3(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    @Override
    public void run(){
    
        while(true){
            
            try {
                dc.sPunti.acquire();
                
                if(dc.getBuffer().lastElement().equals('.'))
                {
                    dc.incPuntiLetti();
                }
                dc.sVisual.release();
        }   catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
                  }
           
    }
    
}

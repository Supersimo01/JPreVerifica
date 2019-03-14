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
public class ThVisual extends Thread{
    
    DatiCondivisi dc;

    public ThVisual(DatiCondivisi dc) {
        this.dc = dc;
    }
    
    @Override
    public void run(){
    
        while(true){
            
            try {
                dc.sVisual.acquire();
                
                for (int i = 0; i < dc.getBuffer().size(); i++) {   
                    System.out.print(dc.getBuffer().elementAt(i).toString());  
                }
                System.out.println();
                System.out.println(dc.toString());
                
                dc.sAddChar.release();
        }   catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
                  }
           
    }
    
}

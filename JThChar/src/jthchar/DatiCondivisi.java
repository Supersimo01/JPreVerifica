/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jthchar;

import java.util.Vector;
import java.util.concurrent.Semaphore;

/**
 *
 * @author mauri_Simone
 */
public class DatiCondivisi {
    
    private Vector buffer;
    int numPunti,numSpazi;
    int numPuntiLetti,numSpaziLetti;
    Semaphore sVisual, sAddChar, sPunti,sSpazi;

    public DatiCondivisi() {
        this.buffer = new Vector();
        this.numPunti = 0;
        this.numSpazi = 0;
        this.numPuntiLetti = 0;
        this.numSpaziLetti = 0;
        sAddChar = new Semaphore(1);
        sPunti = new Semaphore(0);
        sSpazi = new Semaphore(0);
        sVisual = new Semaphore(0);
        
    }

    synchronized public Vector getBuffer() {
        return buffer;
    }
    
    synchronized public void incPunti() {
        numPunti++;
    }
    
    synchronized public void incSpazi() {
        numSpazi++;
    }
    
    synchronized public void incPuntiLetti() {
        numPuntiLetti++;
    }
    
    synchronized public void incSpaziLetti() {
        numSpaziLetti++;
    }

    public int getNumPunti() {
        return numPunti;
    }

    public int getNumSpazi() {
        return numSpazi;
    }

    public int getNumPuntiLetti() {
        return numPuntiLetti;
    }

    public int getNumSpaziLetti() {
        return numSpaziLetti;
    }

    @Override
    public String toString() {
        return "numPunti=" + numPunti + ", numSpazi=" + numSpazi + ", numPuntiLetti=" + numPuntiLetti + ", numSpaziLetti=" + numSpaziLetti;
    }
    
    
    

    
    
}

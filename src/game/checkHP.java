/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.logging.Level;
import java.util.logging.Logger;
import game.FXMLDocumentController;
import game.PlayerStats;

/**
 *
 * @author ILYA
 */
public class checkHP extends Thread{
    FXMLDocumentController fx;
    PlayerStats ps = new PlayerStats();
    
    checkHP(FXMLDocumentController fx){
        this.fx = fx;
        setDaemon(true);
    }
    
    public void check() {
        if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.1)
            fx.tenhp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.2)
            fx.ninehp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.3)
            fx.eighthp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.4)
            fx.sevenhp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.5)
            fx.sixhp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.6)
            fx.fivehp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.7)
            fx.fourhp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.8)
            fx.threehp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.9)
            fx.twohp.setVisible(true);
        else if ((double) fx.playerHitpoints > (double) ps.PlayerHealth - (double) ps.PlayerHealth * 0.99)
            fx.onehp.setVisible(true);
        else
            fx.zerohp.setVisible(true);
    }
    
    public void allUnvisible(){
        fx.tenhp.setVisible(false);
        fx.ninehp.setVisible(false);
        fx.eighthp.setVisible(false);
        fx.sevenhp.setVisible(false);
        fx.sixhp.setVisible(false);
        fx.fivehp.setVisible(false);
        fx.fourhp.setVisible(false);
        fx.threehp.setVisible(false);
        fx.twohp.setVisible(false);
        fx.onehp.setVisible(false);
        fx.zerohp.setVisible(false);
    }
    
    @Override
    public void run(){
        while(true){
           
                allUnvisible();
                check(); 
            try {
                sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(checkHP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

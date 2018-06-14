/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class CoffeeThread extends Thread{
    FXMLDocumentController fx;
    PlayerStats ps = new PlayerStats();
    Random rnd = new Random();
    int x;
    int y;
    int heal;
    boolean g;
    
    public void spawn(){
        fx.coffee.setLayoutX(rnd.nextInt(1920));
        fx.coffee.setLayoutY(rnd.nextInt(400)+500);
        heal = rnd.nextInt(80);
        fx.coffee.setVisible(true);
    }
    
    private void checkHeal(){
        if(fx.coffee.getLayoutX() + 100 >= fx.px && fx.coffee.getLayoutX() - 100 <= fx.px && fx.coffee.getLayoutY() + 100 >= fx.py && fx.coffee.getLayoutY() - 100 <= fx.py){
            System.out.println("AHAHAHAHA I AM COFFEE");
            fx.playerHitpoints += heal;
            fx.playerHitpoints -= (fx.playerHitpoints - ps.PlayerHealth);
            fx.coffee.setVisible(false);
            try {
                sleep(8000);
                        } catch (InterruptedException ex) {
                Logger.getLogger(CoffeeThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            spawn();
        }
    }
    
    public CoffeeThread(FXMLDocumentController fx) {
        this.fx = fx;
        setDaemon(true);
    }
    
    public void run(){
        spawn();
        
        while(true){
            checkHeal();
            try {
                sleep(80);
            } catch (InterruptedException ex) {
                Logger.getLogger(CoffeeThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

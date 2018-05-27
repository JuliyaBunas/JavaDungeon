/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication.FXMLDocumentController;
/**
 *
 * @author PC
 */
public class MonsterThread extends Thread{
        FXMLDocumentController fx;
        int x;
        int y;
        int curMonster;
        
        public MonsterThread(FXMLDocumentController fx) {
            this.fx = fx;
        }
        public void spawn(){
            Random rnd = new Random();
            x = rnd.nextInt(1920);
            y = rnd.nextInt(700);
            System.out.println("spawn");
        }
        @Override
        public void run(){
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MonsterThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            spawn();
          fx.monstr1.setLayoutX(x);
           fx.monstr1.setLayoutY(y);
            fx.monstr1.setVisible(true);
            System.out.println("run");
        }
    }
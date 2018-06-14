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
import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;

/**
 *
 * @author PC
 */
public class MonsterThread extends Thread {
    Random rnd = new Random();
    FXMLDocumentController fx;
    int x;
    int y;
    int curMonster;
    int MonsterHp;
    int Monster_Damage;
    int Player_Damage;
    int heal;
    boolean g;
    
    
    public MonsterThread(FXMLDocumentController fx, int i) {
        this.fx = fx;
        curMonster = i;
        setDaemon(true);
        MonsterHp = fx.MonsterHitpoints;
        Monster_Damage = fx.MonsterDamage;
        Player_Damage = fx.playerDamage;
    }

     public void spawnCoffee(){
        heal = rnd.nextInt(80);
        fx.coffee.setVisible(true);
    }
    
    private void checkHeal(){
        if(fx.coffee.getLayoutX() + 230 >= fx.px && fx.coffee.getLayoutX() - 230 <= fx.px && fx.coffee.getLayoutY() + 280 >= fx.py && fx.coffee.getLayoutY() - 280 <= fx.py){
            System.out.println("AHAHAHAHA I AM COFFEE");
            fx.playerHitpoints += heal;
            fx.coffee.setVisible(false);
            spawnCoffee();
        }
    }
    
    public void spawn() {
        Random rnd = new Random();
        x = rnd.nextInt(1920);
        y = rnd.nextInt(700);
        System.out.println("spawn");
        MonsterHp = fx.MonsterHitpoints;
    }

    private void moveMonsterX(int where) {
        double cx = 0;
        if (where > fx.imgs[curMonster].getLayoutX()) {
            cx = fx.imgs[curMonster].getLayoutX() + 2;
        }
        if (where < fx.imgs[curMonster].getLayoutX()) {
            cx = fx.imgs[curMonster].getLayoutX() - 2;
        }

        if (cx > 0 && cx < 1920) {
            fx.imgs[curMonster].relocate(cx, fx.imgs[curMonster].getLayoutY());
        }
    }

    private void moveMonsterY(int where) {
        double cy = 0;
        if (where > fx.imgs[curMonster].getLayoutY()) {
            cy = fx.imgs[curMonster].getLayoutY() + 2;
        }
        if (where < fx.imgs[curMonster].getLayoutY()) {
            cy = fx.imgs[curMonster].getLayoutY() - 2;
        }

        if (cy > 0 && cy < 1080) {
            fx.imgs[curMonster].relocate(fx.imgs[curMonster].getLayoutX(), cy);
        }
    }
    
    private void tryToBite(){
        if(fx.imgs[curMonster].getLayoutX() + 145 >= fx.px && fx.imgs[curMonster].getLayoutX() - 145 <= fx.px && fx.imgs[curMonster].getLayoutY() - 180 <= fx.py && fx.imgs[curMonster].getLayoutY() + 180 >= fx.py){
            fx.playerHitpoints -= Monster_Damage;
            
             //System.out.println("damage to player");
                fx.RedMonitor.setVisible(true);
                
                try {
                    sleep(60);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MonsterThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                fx.RedMonitor.setVisible(false);
                if(fx.playerHitpoints <= 0){
                    fx.RedMonitor.setVisible(true);
                    fx.gameOver.setVisible(true);
                    stop();
                }
        }   
    }
    
    private void checkDamage(){
        if(fx.attack == true && fx.px + 230 >= fx.imgs[curMonster].getLayoutX() && fx.px - 230 <= fx.imgs[curMonster].getLayoutX() && fx.py + 280 >= fx.imgs[curMonster].getLayoutY() && fx.py - 280 <= fx.imgs[curMonster].getLayoutY()){
                fx.attack = false;
                MonsterHp -= Player_Damage;
                //System.out.println("damage to monster");
                fx.MonstrDamaged.setLayoutX(fx.imgs[curMonster].getLayoutX());
                fx.MonstrDamaged.setLayoutY(fx.imgs[curMonster].getLayoutY());
                fx.imgs[curMonster].setVisible(false);
                fx.MonstrDamaged.setVisible(true);
                try {
                    sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MonsterThread.class.getName()).log(Level.SEVERE, null, ex);
                    }
                fx.MonstrDamaged.setVisible(false);
                fx.imgs[curMonster].setVisible(true);
                
                if(MonsterHp <= 0){
                    fx.imgs[curMonster].setVisible(false);
                    spawn();
                    fx.imgs[curMonster].setLayoutX(x);
                    fx.imgs[curMonster].setLayoutY(y);
                    fx.imgs[curMonster].setVisible(true);
                    System.out.println("died");
                }
            }
            
        }
            
    
    
    private void moveMonster(int wherex, int wherey) {
        moveMonsterX(wherex);
        moveMonsterY(wherey);
    }

    /*System.out.println(" ");
            System.out.println((x - cx) + " " + (y - cy));
            System.out.println(fx.px + " " + fx.py);
            System.out.println(" ds");*/
    @Override
    public void run() {
        spawn();
        //spawnCoffee();
        fx.imgs[curMonster].setLayoutX(x);
        fx.imgs[curMonster].setLayoutY(y);
        fx.imgs[curMonster].setVisible(true);
        System.out.println("run");
        while (true) {
            int x = (int) fx.px, y = (int) fx.py;
            checkDamage();
            moveMonster(x, y);
            tryToBite();
            //checkHeal();
            //System.out.println("PLAYER" + fx.px + " " + fx.py + "      COFFEE" + fx.coffee.getLayoutX() + " " + fx.coffee.getLayoutY());
            
            //System.out.println("PLAYER COORDS    " + fx.px + " " + fx.py);
            //System.out.println("MONSTER COORDS   " + fx.imgs[curMonster].getLayoutX() + " " + fx.imgs[curMonster].getLayoutY());
            try {
                sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(MonsterThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*while(fx.monstr1.getLayoutX() != fx.px && fx.monstr1.getLayoutY() != fx.py){
                    moveHeroBy((int)fx.px, (int)fx.py);
                    System.out.print(100);
                    sleep(100);
                }*/

    }
}

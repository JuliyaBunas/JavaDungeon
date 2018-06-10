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

    FXMLDocumentController fx;
    int x;
    int y;
    int curMonster;
    int hp = 100;
    public MonsterThread(FXMLDocumentController fx, int i) {
        this.fx = fx;
        curMonster = i;
        setDaemon(true);
    }

    public void spawn() {
        Random rnd = new Random();
        x = rnd.nextInt(1920);
        y = rnd.nextInt(700);
        System.out.println("spawn");
        hp = 100;
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
    
    private void checkDamage(){
        if(fx.attack == true){
            
                hp -= fx.playerDamage;
                System.out.println("damage ");
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
                
                if(hp <= 0){
                    fx.imgs[curMonster].setVisible(false);
                    spawn();
                    fx.imgs[curMonster].setLayoutX(x);
                    fx.imgs[curMonster].setLayoutY(y);
                    fx.imgs[curMonster].setVisible(true);
                    hp = 100;
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
        fx.imgs[curMonster].setLayoutX(x);
        fx.imgs[curMonster].setLayoutY(y);
        fx.imgs[curMonster].setVisible(true);
        System.out.println("run");
        while (true) {
            int x = (int) fx.px, y = (int) fx.py;
            checkDamage();
            moveMonster(x, y);
            
          
            
            //System.out.println("PLAYER COORDS    " + fx.px + " " + fx.py);
            //System.out.println("MONSTER COORDS   " + fx.imgs[curMonster].getLayoutX() + " " + fx.imgs[curMonster].getLayoutY());
            try {
                sleep(5);
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

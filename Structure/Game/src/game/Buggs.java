/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Денис
 */
public class Buggs extends Enemies {
    Buggs(){
        hp=5;
        dp=1;
    }
    public void attack(int dp) {
        dp=this.dp;
    }
    @Override
    public void attack() {
        
    }
    public void set_dp(int dp){
        this.dp=dp;
    }
    public void set_hp(int hp){
        this.hp=hp;
    }
    
}

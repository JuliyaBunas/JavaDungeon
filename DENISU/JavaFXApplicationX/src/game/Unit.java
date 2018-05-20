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
public abstract class Unit {
    int hp;
    int dp;
Unit(int hp,int dp){
 this.dp=dp;
 this.hp=hp;
}
Unit(){}
public abstract void attack();

}

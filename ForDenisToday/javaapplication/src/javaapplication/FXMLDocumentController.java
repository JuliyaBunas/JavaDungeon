/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
   
    
    @FXML
    public ImageView tenhp;
    
    @FXML
    public ImageView ninehp;
    
    @FXML
    public ImageView eighthp;
    
    @FXML
    public ImageView sevenhp;
    
    @FXML
    public ImageView sixhp;
    
    @FXML
    public ImageView fivehp;
    
    @FXML
    public ImageView fourhp;
    
    @FXML
    public ImageView threehp;
    
    @FXML
    public ImageView twohp;
    
    @FXML
    public ImageView onehp;
    
    @FXML
    public ImageView zerohp;
     
    @FXML
    PlayerStats pl = new PlayerStats();
    
    @FXML
    MonsterStats mon = new MonsterStats();
    
    @FXML
    public ImageView[] imgs;// = new ImageView[3];
    
    @FXML
    private Label label;
    
    @FXML
    int playerDamage = pl.PlayerDam;
    
    @FXML
    int playerHitpoints = pl.PlayerHealth;
    
    @FXML
    public int MonsterDamage = mon.MonsterDam;
    
    @FXML
    public int MonsterHitpoints = mon.MonsterHealth;
    
    @FXML
    public ImageView monstr1;
    
    @FXML
    public Label gameOver;
    
     @FXML
    public ImageView MonstrAlive;
    
     @FXML
    public ImageView PlayerDamaged; 
    
     @FXML
    public ImageView RedMonitor; 
     
      @FXML
    public ImageView MonstrDamaged;
      
    @FXML
    public ImageView player;
    
    @FXML
    public ImageView monstr3;
    
    @FXML
    public ImageView coffee;
    
    @FXML
    public ImageView monstr2;
    
    @FXML
    public static double px;
    
    @FXML
    public static double py;
    @FXML
    public static boolean attack;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        attack = true;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imgs = new ImageView[3];
        imgs[0] = monstr1;
        imgs[1] = monstr2;
        imgs[2] = monstr3;
        
        CoffeeThread Coffeek = new CoffeeThread(this);
        Coffeek.start();MonsterThread mm = new MonsterThread(this, 0);
        mm.start();
        checkHP check = new checkHP(this);
        check.start();
        //MonsterThread mm1 = new MonsterThread(this, 1);
        //mm1.start();
        //MonsterThread mm2 = new MonsterThread(this, 2);
        //mm2.start();
    }    
    
}

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
    public ImageView[] imgs;// = new ImageView[3];
    
    @FXML
    private Label label;
    
    @FXML
     int playerDamage = 40;
    
    @FXML
    public ImageView monstr1;
    
     @FXML
    public ImageView MonstrAlive;
    
      @FXML
    public ImageView MonstrDamaged;
      
    @FXML
    public ImageView player;
    
    @FXML
    public ImageView monstr3;
    
    @FXML
    public ImageView monstr2;
    
    @FXML
    public static double px;
    
    @FXML
    public static double py;
    @FXML
    public static boolean attack;
    @FXML
    public static boolean goNorth;
    @FXML
    public static boolean goSouth;
    @FXML
    public static boolean goEast;
    @FXML
    public static boolean goWest;
    @FXML
    public static boolean running;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        imgs = new ImageView[3];
        imgs[0] = monstr1;
        imgs[1] = monstr2;
        imgs[2] = monstr3;
        MonsterThread mm = new MonsterThread(this, 0);
        mm.start();
        //MonsterThread mm1 = new MonsterThread(this, 1);
        //mm1.start();
        //MonsterThread mm2 = new MonsterThread(this, 2);
        //mm2.start();
    }    
    
}

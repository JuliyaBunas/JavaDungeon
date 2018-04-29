/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvachokpole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private boolean poc1die = false;
    
    @FXML
    private boolean poc2die = false;
    
    @FXML
    private boolean poc3die = false;
    
    @FXML
    private boolean poc4die = false;
    
    @FXML
    private ImageView poc1;
    
    @FXML
    private ImageView poc2;
    
    @FXML
    private ImageView poc3;
    
    @FXML
    private ImageView poc4;
    
    @FXML
    private RowConstraints kk;
    
    @FXML
    private Circle aura;
    
    @FXML
    private ImageView pacan;
    @FXML
    private void up(ActionEvent event) {
        aura.setLayoutY(aura.getLayoutY() - 10);
        pacan.setLayoutY(pacan.getLayoutY() - 10);
        for(int x = 0; x < 100; x++){
            for(int y = 0; y < 100; y++){
                if((aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) )
                    if(poc1die == false) 
                        poc1.setVisible(true);
                if((aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) )
                    if(poc2die == false) 
                        poc2.setVisible(true);
                if((aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) )
                    if(poc3die == false) 
                        poc3.setVisible(true);
                if((aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) )
                    if(poc4die == false) 
                        poc4.setVisible(true);
            }
        }
    }
    
    @FXML
    private void down(ActionEvent event) {
        aura.setLayoutY(aura.getLayoutY() + 10);
        pacan.setLayoutY(pacan.getLayoutY() + 10);
        for(int x = 0; x < 100; x++){
            for(int y = 0; y < 100; y++){
                if((aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) )
                    if(poc1die == false) 
                        poc1.setVisible(true);
                if((aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) )
                    if(poc2die == false) 
                        poc2.setVisible(true);
                if((aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) )
                    if(poc3die == false) 
                        poc3.setVisible(true);
                if((aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) )
                    if(poc4die == false) 
                        poc4.setVisible(true);
            }
        }
    }
    
    @FXML
    private void left(ActionEvent event) {
        aura.setLayoutX(aura.getLayoutX() - 10);
        pacan.setLayoutX(pacan.getLayoutX() - 10);
        for(int x = 0; x < 100; x++){
            for(int y = 0; y < 100; y++){
                if((aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) )
                    if(poc1die == false) 
                        poc1.setVisible(true);
                if((aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) )
                    if(poc2die == false) 
                        poc2.setVisible(true);
                if((aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) )
                    if(poc3die == false) 
                        poc3.setVisible(true);
                if((aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) )
                    if(poc4die == false) 
                        poc4.setVisible(true);
            }
        }
    }
    
    @FXML
    private void right(ActionEvent event) {
        aura.setLayoutX(aura.getLayoutX() + 10);
        pacan.setLayoutX(pacan.getLayoutX() + 10);
        for(int x = 0; x < 100; x++){
            for(int y = 0; y < 100; y++){
                if((aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() + y ==  poc1.getLayoutY()) || (aura.getLayoutX() + x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) || (aura.getLayoutX() - x == poc1.getLayoutX() && aura.getLayoutY() - y ==  poc1.getLayoutY()) )
                    if(poc1die == false) 
                        poc1.setVisible(true);
                if((aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() + y ==  poc2.getLayoutY()) || (aura.getLayoutX() + x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) || (aura.getLayoutX() - x == poc2.getLayoutX() && aura.getLayoutY() - y ==  poc2.getLayoutY()) )
                    if(poc2die == false) 
                        poc2.setVisible(true);
                if((aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() + y ==  poc3.getLayoutY()) || (aura.getLayoutX() + x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) || (aura.getLayoutX() - x == poc3.getLayoutX() && aura.getLayoutY() - y ==  poc3.getLayoutY()) )
                    if(poc3die == false) 
                        poc3.setVisible(true);
                if((aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() + y ==  poc4.getLayoutY()) || (aura.getLayoutX() + x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) || (aura.getLayoutX() - x == poc4.getLayoutX() && aura.getLayoutY() - y ==  poc4.getLayoutY()) )
                    if(poc4die == false) 
                        poc4.setVisible(true);
            }
        }
    }
    
    @FXML 
    private void attack(){
        if(poc1.isVisible()){
            poc1.setVisible(false);
            poc1die = true;
        }
        if(poc2.isVisible()){
            poc2.setVisible(false);
            poc2die = true;
        }
        if(poc3.isVisible()){
            poc3.setVisible(false);
            poc3die = true;
        }
        if(poc4.isVisible()){
            poc4.setVisible(false);
            poc4die = true;
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

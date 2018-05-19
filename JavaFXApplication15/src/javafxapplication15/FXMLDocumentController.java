/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    Group dialog;
    @FXML
    private JavaFXApplication15 hero; 
    @FXML
    private void Eclick(){
        dialog.setVisible(true);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            // TODO
    }    
    
}


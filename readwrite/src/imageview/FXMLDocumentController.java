/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Денис
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    AnchorPane lk;
    
    @FXML
    TextArea ik;
    
    @FXML
    Button exit;
    
    @FXML
    private void scrolll(){
       try{
           lk.setVisible(true);
       }
       catch(Exception ex){}
       }
    
    @FXML
    private void right(){
        ik.setText("ЧТО-ТО О ДЖАВЕ2");
    }
    
    @FXML
    private void left(){
        ik.setText("ЧТО-ТО О ДЖАВЕ1");
    }
    
    @FXML
    private void CLOS(){
        lk.setVisible(false);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

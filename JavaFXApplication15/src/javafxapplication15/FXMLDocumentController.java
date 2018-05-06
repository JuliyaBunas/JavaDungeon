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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button lvl1;
    
    @FXML
    private Button lvl2;
    
    @FXML
    private Button lvl3;
    
    @FXML
    private Button lvl4;
    
    @FXML
    private Button lvl5;
    
    @FXML
    private Button lvl6;
    
    @FXML
    private Button lvl7;
    
    @FXML
    private Button lvl8;
    
    @FXML
    private Button lvl9;
    
    @FXML
    private Button lvl10;
    
    @FXML
    private Button lvl11;
    
    @FXML
    private Button lvl12;
    
    @FXML
    private Button lvl13;
    
    @FXML
    private Button lvl14;
    
    @FXML
    private Button lvl15;
    
    @FXML
    private Button lvl16;
    
    @FXML
    private Button lvl17;
    
    @FXML
    private Button lvl18;
    
    @FXML
    private static int cur_level = 10;
    
    @FXML
    private AnchorPane anch;
    
    @FXML
    private Button but1;
    
    @FXML
    private Button but2;
    
    @FXML
    private Button but3;
    
    @FXML
    private Button but4;
    
    @FXML
    private Button but5;
    
    @FXML
    private Button but6;
    
    
    @FXML
    private int j = 0;
    
    @FXML
    private void switchlvl(){
        if(j == 0)
        {
            anch.setVisible(false);
            but1.setVisible(false);
            but2.setVisible(false);
            but3.setVisible(false);
            but4.setVisible(false);
            but5.setVisible(false);
            j = 1;
        }
        else
        {
            anch.setVisible(true);
            but1.setVisible(true);
            but2.setVisible(true);
            but3.setVisible(true);
            but4.setVisible(true);
            but5.setVisible(true);
            j = 0;
        }
    }
    
    @FXML
    private void loadLvlFromFile(ActionEvent event) throws IOException {
      //FileWriter writer = new FileWriter("D:\\Documents\\NetBeansProjects\\readwrite\\src\\readwrite\\usersCout.java", false);
         BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\PC\\Desktop\\save.txt"));
        String s = in.readLine();
        Integer i = Integer.parseInt(s);
        System.out.println(i);
        cur_level = i;
        in.close();
//        String c = (char) reader.read();
    }
    @FXML
    private void openLvlList(){
        int i = cur_level;
        lvl1.setStyle("-fx-background-color: olive");
        if(i >= 2){lvl2.setStyle("-fx-background-color: olive");}else{lvl2.setStyle("-fx-background-color: red");}
        if(i >= 3){lvl3.setStyle("-fx-background-color: olive");}else{lvl3.setStyle("-fx-background-color: red");}
        if(i >= 4){lvl4.setStyle("-fx-background-color: olive");}else{lvl4.setStyle("-fx-background-color: red");}
        if(i >= 5){lvl5.setStyle("-fx-background-color: olive");}else{lvl5.setStyle("-fx-background-color: red");}
        if(i >= 6){lvl6.setStyle("-fx-background-color: olive");}else{lvl6.setStyle("-fx-background-color: red");}
        if(i >= 7){lvl7.setStyle("-fx-background-color: olive");}else{lvl7.setStyle("-fx-background-color: red");}
        if(i >= 8){lvl8.setStyle("-fx-background-color: olive");}else{lvl8.setStyle("-fx-background-color: red");}
        if(i >= 9){lvl9.setStyle("-fx-background-color: olive");}else{lvl9.setStyle("-fx-background-color: red");}
        if(i >= 10){lvl10.setStyle("-fx-background-color: olive");}else{lvl10.setStyle("-fx-background-color: red");}
        if(i >= 11){lvl11.setStyle("-fx-background-color: olive");}else{lvl11.setStyle("-fx-background-color: red");}
        if(i >= 12){lvl12.setStyle("-fx-background-color: olive");}else{lvl12.setStyle("-fx-background-color: red");}
        if(i >= 13){lvl13.setStyle("-fx-background-color: olive");}else{lvl13.setStyle("-fx-background-color: red");}
        if(i >= 14){lvl14.setStyle("-fx-background-color: olive");}else{lvl14.setStyle("-fx-background-color: red");}
        if(i >= 15){lvl15.setStyle("-fx-background-color: olive");}else{lvl15.setStyle("-fx-background-color: red");}
        if(i >= 16){lvl16.setStyle("-fx-background-color: olive");}else{lvl16.setStyle("-fx-background-color: red");}
        if(i >= 17){lvl17.setStyle("-fx-background-color: olive");}else{lvl17.setStyle("-fx-background-color: red");}
        if(i >= 18){lvl18.setStyle("-fx-background-color: olive");}else{lvl18.setStyle("-fx-background-color: red");}
    }
    
    
    @FXML
    private void save() throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\PC\\Desktop\\save.txt", false);
        System.out.println(cur_level);
        String s = "" + cur_level;
        writer.write(s);
        writer.close();
    }
    
    @FXML
    private void levelup(){
        cur_level ++;
        System.out.println(cur_level);
    }
    
    @FXML
    private void leveldown(){
        cur_level --;
        System.out.println(cur_level);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


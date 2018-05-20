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
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
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
    Label dialog;
    @FXML
    DialogPane dialogcloud;
    @FXML
    private JavaFXApplication15 hero; 
    @FXML
    private int kk = 1;
    @FXML
    private void Eclick(){
        if(kk == 1){
            dialog.setVisible(true);
            dialogcloud.setVisible(true);
            kk = 0;
        }else{
            dialog.setVisible(false);
            dialogcloud.setVisible(false);
            kk = 1;
        }
    }
    
    @FXML
    private AnchorPane vis;
    
    @FXML
    private Button but1;
    
    @FXML
    private Button but2;
    
    @FXML
    private Button but3;
    
    @FXML
    private Button save;
    
    @FXML
    private Button load;
    
    @FXML
    private static int cur_level = 0;
    
    @FXML
    private String cur_name = "none";
    
    @FXML
    private String name1;
    
    @FXML
    private String name2;
    
    @FXML
    private String name3;
    
    @FXML
    private Integer lvl1 = 0;
    
    @FXML
    private Integer lvl2 = 0;
    
    @FXML
    private Integer lvl3 = 0;
    
    @FXML
    private int k=999;
    
    @FXML
    public void loadLvlFromFile(ActionEvent event) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\ILYA\\Desktop\\save.txt"));
        String per;
        name1 = in.readLine();
        per = in.readLine();
        lvl1 = Integer.parseInt(per);
        name2 = in.readLine();
        per = in.readLine();
        lvl2 = Integer.parseInt(per);
        name3 = in.readLine();
        per = in.readLine();
        lvl3 = Integer.parseInt(per);
        
        but1.setText(name1);
        but2.setText(name2);
        but3.setText(name3);
        but1.setVisible(true);
        but2.setVisible(true);
        but3.setVisible(true);
        //System.out.println(i);
        //cur_level = i;
        in.close();
        /*char c = (char) in.read();
        int u = 0;
        while((int)c != -1){
            while(c != ' '){
                c = (char)in.read();
                ar[u].insert();
            }
            u ++;
        }*/
        System.out.println(lvl1);
        System.out.println(lvl2);
        System.out.println(lvl3);
    }
    
    @FXML
    private void but1action() throws IOException{
        cur_name = name1;
        cur_level = lvl1;
        k = 1;
        but1.setVisible(false);
        but2.setVisible(false);
        but3.setVisible(false);
    }
    
    @FXML
    private void but2action() throws IOException{
        cur_name = name2;
        cur_level = lvl2;
        k = 2;
        but1.setVisible(false);
        but2.setVisible(false);
        but3.setVisible(false);
    }
    
    @FXML
    private void but3action() throws IOException{
        cur_name = name3;
        cur_level = lvl3;
        k = 3;
        but1.setVisible(false);
        but2.setVisible(false);
        but3.setVisible(false);
    }
    
    @FXML
    private void save() throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\ILYA\\Desktop\\save.txt", false);
        PrintWriter pw = new PrintWriter("C:\\Users\\ILYA\\Desktop\\save.txt");
        if(k == 1)
        {
            pw.println(cur_name);
            pw.println(cur_level);
            pw.println(name2);
            pw.println(lvl2);
            pw.println(name3);
            pw.println(lvl3);
        }
        if(k == 2)
        {
            pw.println(name1);
            pw.println(lvl1);
            pw.println(cur_name);
            pw.println(cur_level);
            pw.println(name3);
            pw.println(lvl3);
        }
        if(k == 3)
        {
            pw.println(name1);
            pw.println(lvl1);
            pw.println(name2);
            pw.println(lvl2);
            pw.println(cur_name);
            pw.println(cur_level);
        }
        writer.close();
        pw.close();
   
            /*String s = "ilya\n" +
"5\n" +
"nikita\n" +
"6\n" +
"den\n" +
"18"*/
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            // TODO
    }    
    
}


package readwrite;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author PC
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void writer(ActionEvent event) {
        try{ 
            FileWriter writer = new FileWriter("D:\\Documents\\NetBeansProjects\\readwrite\\src\\readwrite\\Readwrite.java", true);
            FileReader reader = new FileReader("D:\\Documents\\NetBeansProjects\\readwrite\\src\\readwrite\\Readwrite.java");
            String start = "package readwrite;\n" +
"\n" +
"import javafx.application.Application;\n" +
"import javafx.fxml.FXMLLoader;\n" +
"import javafx.scene.Parent;\n" +
"import javafx.scene.Scene;\n" +
"import javafx.stage.Stage;\n" +
"\n" +
"/**\n" +
" *\n" +
" * @author PC\n" +
" */\n" +
"public class Readwrite extends Application {\n" +
"    \n" +
"    @Override\n" +
"    public void start(Stage stage) throws Exception {\n" +
"        Parent root = FXMLLoader.load(getClass().getResource(\"FXMLDocument.fxml\"));\n" +
"        \n" +
"        Scene scene = new Scene(root);\n" +
"        \n" +
"        stage.setScene(scene);\n" +
"        stage.show();\n" +
"    }\n" +
"\n" +
"    /**\n" +
"     * @param args the command line arguments\n" +
"     */\n" +
"    public static void main(String[] args) {\n" +
"        launch(args);";
            String end = "} }";
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            writer.write(start);
            while(s.equals("gg") == false){
            
            System.out.println(s);
            int c;
            int count = 0;
            
            writer.write(s);  
            
            s = scan.nextLine();
            }
            writer.write(end);
            //Process proc = Runtime.getRuntime().exec("java -java textT.java");
            
                
            writer.close();
            reader.close();
        }catch(IOException ex){
            System.out.println("Что-то не так с writer'ом");
        }
        
    }
    
    @FXML
    private void compilator(int x){
        try{
            
        }catch(Exception ex){
            System.out.println("Юзер написал неправильно");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

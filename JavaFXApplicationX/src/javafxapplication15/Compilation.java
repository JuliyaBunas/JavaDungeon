package javafxapplication15;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import comp.JavaApplication7;


public class Compilation {

    public static void main(String[] args) {
        FileWriter writer = null;
        FileReader reader = null;
        try {
            writer = new FileWriter("D:\\Documents\\NetBeansProjects\\JavaApplication7\\src\\javaapplication7\\JavaApplication7.java", false);
            reader = new FileReader("D:\\Documents\\NetBeansProjects\\JavaApplication7\\src\\javaapplication7\\code.txt");
            int c;
            while((c = reader.read()) != -1) {
                writer.write(c);
            }
            writer.close();
            reader.close();
            JavaApplication7.main(args);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}

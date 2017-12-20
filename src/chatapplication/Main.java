
package chatapplication;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
     @Override
    public void start(Stage stage) throws Exception {
            FXMLLoader loader = new FXMLLoader();        
            System.out.println(getClass().getResource("Server.fxml"));
            Parent root = loader.load(new File("C:\\Users\\Ahmed\\Downloads\\Java-Chat-Project-master\\src\\chatapplication\\Server.fxml").toURL());
            Scene scene=new Scene(root);
            stage.setScene(scene); 
             
            stage.resizableProperty().set(false);            
            stage.show();          
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

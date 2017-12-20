package chatapplication;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ServerController implements Initializable {

    @FXML
    Button serverNotification;
    @FXML
    Button serverStart;
    @FXML
    Button serverStop;
    @FXML
    Button serverStatictics;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         serverStart.setShape(new Circle(40));
        serverStart.setMaxSize(80, 80);
         serverStop.setShape(new Circle(40));
        serverStop.setMaxSize(80, 80);
//         serverNotification.setShape(new Circle(40));
//        serverNotification.setMaxSize(80, 80);
//         serverStatictics.setShape(new Circle(40));
//        serverStatictics.setMaxSize(80, 80);
    }

   
}

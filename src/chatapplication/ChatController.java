
package chatapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ChatController implements Initializable {
    
    @FXML 
    private ImageView minimizeIcon;
    @FXML
    private ImageView closeIcon;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private ComboBox <String> fontTypePicker;
    @FXML
    private ComboBox <Integer> fontSizePicker;
    @FXML
    private BorderPane contactAndMsgPane;
    @FXML
    private HBox bottomBar;   
    
    Stage primaryStage;
    
    public ChatController(Stage primaryStage){
        this.primaryStage = primaryStage;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        minimizeIcon.setOnMouseClicked((MouseEvent event) -> {
            primaryStage.setIconified(true);
        });
        
        closeIcon.setOnMouseClicked((MouseEvent event) -> {
            primaryStage.close();
        });
        
        colorPicker.setValue(Color.DARKGREY);
        colorPicker.setOnMouseClicked((MouseEvent event) -> {
           
        });
        
        
        fontTypePicker.getItems().addAll(Font.getFamilies());
        fontSizePicker.getItems().addAll(10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40);
    }    
    
}

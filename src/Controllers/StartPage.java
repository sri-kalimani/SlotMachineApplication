package Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class StartPage {
    @FXML
    private ImageView imageView;

    @FXML
    private JFXButton button;


    @FXML
    public void handleOnButtonPress(ActionEvent event){
//        Image image = new Image("/Resources/one.gif");
//
//        imageView.setImage(image);
    }

    @FXML
    public void changeScene() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/SlotMachinePage.fxml"));
        Parent root = loader.load();
        Stage main = new Stage();
        main.setScene(new Scene(root));
        main.setMaximized(true);
        main.show();
    }

}

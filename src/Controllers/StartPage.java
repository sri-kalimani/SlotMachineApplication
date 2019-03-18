package Controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javax.swing.text.html.ImageView;
import java.io.IOException;

public class StartPage {
    @FXML
    private ImageView imageView;

    @FXML
    private JFXButton button;

    @FXML
    private AnchorPane rootPane;


    @FXML
    public void changeScene() throws IOException {
        AnchorPane loader = FXMLLoader.load(getClass().getResource("/Views/SlotMachinePage.fxml"));
        rootPane.getChildren().setAll(loader);
   }

}

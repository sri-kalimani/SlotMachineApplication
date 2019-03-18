/**
 * SlotMachinePage
 * @author Sri Kalimani
 * Slot machine page controller class
 */
package Controllers;

import Entity.SlotMachine;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class SlotMachinePage{

    @FXML private JFXTextField num1, num2, num3;
    @FXML private ImageView slot1;
    @FXML private ImageView slot2;
    @FXML private ImageView slot3;
    @FXML private ImageView icon1;
    @FXML private ImageView icon2;
    @FXML private ImageView icon3;
    @FXML private JFXButton home;
    @FXML private JFXButton toEnd;
    @FXML private JFXButton pullLever;
    @FXML private JFXTextField message;
    @FXML private JFXTextField balance;
    @FXML private AnchorPane rootPane;

    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    SlotMachine slotMachine = new SlotMachine(n1, n2, n3);

    public SlotMachinePage() { }

    /**
     * updates all slot machine objects on click
     */
    @FXML
    public void theGame(){
        if (slotMachine.getBalance() > 0) {
                this.displayNum();
                this.displayBalance();
                this.displaySlot();
                this.displayFruit();
                this.displayMessage();
            }
        }

    @FXML
    public void backHome()throws IOException {
        AnchorPane loader = FXMLLoader.load(getClass().getResource("/Views/StartPage.fxml"));
        rootPane.getChildren().setAll(loader);
    }

    @FXML
    public void toEnd() throws IOException{
        AnchorPane loader = FXMLLoader.load(getClass().getResource("/Views/EndPage.fxml"));
        rootPane.getChildren().setAll(loader);
    }


    /**
     * updates number
     */
    public void displayNum(){
        slotMachine.generateNum();
        num1.setText(Integer.toString(slotMachine.getN1()));
        num2.setText(Integer.toString(slotMachine.getN2()));
        num3.setText(Integer.toString(slotMachine.getN3()));
    }

    /**
     * updates slot image
     */
    @FXML
    public void displaySlot() {
        slotMachine.assignImage();
        this.slot1.setImage(slotMachine.getImage1());
        this.slot2.setImage(slotMachine.getImage2());
        this.slot3.setImage(slotMachine.getImage3());
    }

    /**
     * updates fruit icon
     */
    public void displayFruit(){
        slotMachine.assignFruit();
        this.icon1.setImage(slotMachine.getIcon1());
        this.icon2.setImage(slotMachine.getIcon2());
        this.icon3.setImage(slotMachine.getIcon3());
    }

    /**
     * Updates message box
     */
    public void displayMessage(){
        if (slotMachine.isTriple())
            message.setText("ULTIMATE FRUIT PUNCH! + $" + slotMachine.getReward());
        else if (slotMachine.isDouble())
            message.setText("FRUIT PUNCH! + $" + slotMachine.getReward());
        else
            message.setText("BIG FRUIT SAD! -$" + (-slotMachine.getReward()));

    }

    /**
     * updates balance
     */
    public void displayBalance(){
        slotMachine.updateBalance();
        balance.setText("$" + slotMachine.getBalance());
    }



}

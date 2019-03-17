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
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class SlotMachinePage{

    @FXML private JFXTextField num1, num2, num3;
    @FXML private ImageView slot1;
    @FXML private ImageView slot2;
    @FXML private ImageView slot3;
    @FXML private ImageView icon1;
    @FXML private ImageView icon2;
    @FXML private ImageView icon3;
    @FXML private JFXButton pullLever;
    @FXML private JFXTextField message;
    @FXML private JFXTextField balance;

    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    SlotMachine slotMachine = new SlotMachine(n1, n2, n3);

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
     * updates fruit name
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
            message.setText("TRIPLE BONANZA! You've earned $" + slotMachine.getReward());
        else if (slotMachine.isDouble())
            message.setText("Double Trouble! You've earned $" + slotMachine.getReward());
        else
            message.setText("BIG SAD! You've lost $" + (-slotMachine.getReward()));

    }

    /**
     * updates balance
     */
    public void displayBalance(){
        slotMachine.updateBalance();
        balance.setText("New Balance = " + slotMachine.getBalance());
    }


}

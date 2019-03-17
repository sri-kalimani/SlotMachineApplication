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
import javax.swing.text.html.ImageView;


public class SlotMachinePage{

    @FXML private JFXTextField num1, num2, num3;
    @FXML private ImageView slot;
    @FXML private JFXTextField fruit1, fruit2, fruit3;
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
    public void displaySlot(){

    }

    /**
     * updates fruit name
     */
    public void displayFruit(){

        slotMachine.assignFruit();
        this.fruit1.setText(slotMachine.getFruit1());
        this.fruit2.setText(slotMachine.getFruit2());
        this.fruit3.setText(slotMachine.getFruit3());

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

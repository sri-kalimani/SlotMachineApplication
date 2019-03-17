/**
 * Slot Machine
 * @author Sri Kalimani
 * Slot machine page entity class
 */
package Entity;

import java.util.HashMap;
import java.util.Random;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;


public class SlotMachine {

    private Random rn1 = new Random();
    private Random rn2 = new Random();
    private Random rn3 = new Random();
    private int n1, n2, n3;
    private String fruit1 = "", fruit2 = "", fruit3 = "";
    private Image image1, image2, image3;
    private Image icon1, icon2, icon3;
    private int balance;
    int reward;

    public SlotMachine(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.balance = 1000;

        this.image1 = new Image(getClass().getResourceAsStream("/Resources/blank.gif"));
        this.image2 = new Image(getClass().getResourceAsStream("/Resources/blank.gif"));
        this.image3 = new Image(getClass().getResourceAsStream("/Resources/blank.gif"));

        this.icon1 = new Image (getClass().getResourceAsStream("/Resources/raspberry.png"));
        this.icon2 = new Image (getClass().getResourceAsStream("/Resources/raspberry.png"));
        this.icon3 = new Image (getClass().getResourceAsStream("/Resources/raspberry.png"));
    }

    public SlotMachine(Random rn1, Random rn2, Random rn3, int n1, int n2, int n3, int balance, String fruit1, String fruit2, String fruit3, int reward) {
        this.rn1 = rn1;
        this.rn2 = rn2;
        this.rn3 = rn3;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.balance = balance;
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
        this.fruit3 = fruit3;
        this.reward = reward;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getFruit1() {
        return fruit1;
    }

    public String getFruit2() {
        return fruit2;
    }

    public String getFruit3() {
        return fruit3;
    }

    public Image getImage1() { return image1; }

    public Image getImage2() { return image2; }

    public Image getImage3() { return image3; }

    public Image getIcon1() { return icon1; }

    public Image getIcon2() { return icon2; }

    public Image getIcon3() { return icon3; }

    public int getReward() { return reward; }

    /**
     * Generates new set of random numbers
     */
    public void generateNum(){
        n1 = rn1.nextInt((9 - 1) + 1) + 1;
        n2 = rn2.nextInt((9 - 1) + 1) + 1;
        n3 = rn3.nextInt((9 - 1) + 1) + 1;
        System.out.println("Random numbers in order: " + n1 + " " + n2 + " " + n3);
    }

    /**
     * Assigns fruit based on number generated
     * Stores fruit names in Hashmap
     */
    public void assignFruit(){
        Image raspberry = new Image (this.getClass().getResourceAsStream("/Resources/raspberry.png"));
        Image lemon = new Image (this.getClass().getResourceAsStream("/Resources/lemon.png"));
        Image banana = new Image (this.getClass().getResourceAsStream("/Resources/banana.png"));
        Image plum = new Image (this.getClass().getResourceAsStream("/Resources/plum.png"));
        Image pear = new Image (this.getClass().getResourceAsStream("/Resources/pear.png"));
        Image orange = new Image (this.getClass().getResourceAsStream("/Resources/orange.png"));
        Image strawberry = new Image (this.getClass().getResourceAsStream("/Resources/strawberry.png"));
        Image kiwi = new Image (this.getClass().getResourceAsStream("/Resources/kiwi.png"));
        Image cherry = new Image (this.getClass().getResourceAsStream("/Resources/cherry.gif"));
        Image mango = new Image (this.getClass().getResourceAsStream("/Resources/mango.jpg"));

//        final HashMap<Integer, String> fruitMap = new HashMap<>();
        final HashMap<Integer, Image> iconMap = new HashMap<>();

//        fruitMap.put(1, "Raspberry");
//        fruitMap.put(2, "Lemon");
//        fruitMap.put(3, "Banana");
//        fruitMap.put(4, "Plum");
//        fruitMap.put(5, "Pear");
//        fruitMap.put(6, "Orange");
//        fruitMap.put(7, "Strawberry");
//        fruitMap.put(8, "Kiwi");
//        fruitMap.put(9, "Cherry");
//        fruitMap.put(10, "Mango");

        iconMap.put(1, raspberry);
        iconMap.put(2, lemon);
        iconMap.put(3, banana);
        iconMap.put(4, plum);
        iconMap.put(5, pear);
        iconMap.put(6, orange);
        iconMap.put(7, strawberry);
        iconMap.put(8, kiwi);
        iconMap.put(9, cherry);
        iconMap.put(10, mango);

//        this.fruit1 = fruitMap.get(this.getN1());
//        this.fruit2 = fruitMap.get(this.getN2());
//        this.fruit3 = fruitMap.get(this.getN3());

        this.icon1 = iconMap.get(this.getN1());
        this.icon2 = iconMap.get(this.getN2());
        this.icon3 = iconMap.get(this.getN3());
    }

    public void assignImage(){

        Image image1 = new Image(this.getClass().getResourceAsStream("/Resources/1-Number-PNG.png"));
        Image image2 = new Image(this.getClass().getResourceAsStream("/Resources/2-Number-PNG.png"));
        Image image3 = new Image(this.getClass().getResourceAsStream("/Resources/3-Number-PNG.png"));
        Image image4 = new Image(this.getClass().getResourceAsStream("/Resources/4-Number-PNG.png"));
        Image image5 = new Image(this.getClass().getResourceAsStream("/Resources/5-Number-PNG.png"));
        Image image6 = new Image(this.getClass().getResourceAsStream("/Resources/6-Number-PNG.png"));
        Image image7 = new Image(this.getClass().getResourceAsStream("/Resources/7-Number-PNG.png"));
        Image image8 = new Image(this.getClass().getResourceAsStream("/Resources/8-Number-PNG.png"));
        Image image9 = new Image(this.getClass().getResourceAsStream("/Resources/9-Number-PNG.png"));
        Image imageBlank = new Image(this.getClass().getResourceAsStream("/Resources/0-Number-PNG.png"));

        final HashMap<Integer, Image> imageMap = new HashMap<>();

        imageMap.put(0, imageBlank);
        imageMap.put(1, image1);
        imageMap.put(2, image2);
        imageMap.put(3, image3);
        imageMap.put(4, image4);
        imageMap.put(5, image5);
        imageMap.put(6, image6);
        imageMap.put(7, image7);
        imageMap.put(8, image8);
        imageMap.put(9, image9);
        imageMap.put(10, imageBlank);

        this.image1 = imageMap.get(this.getN1());
        this.image2 = imageMap.get(this.getN2());
        this.image3 = imageMap.get(this.getN3());

    }

    /**
     * Checks if all numbers are equal
     * @return true of triple, false otherwise
     */
    public boolean isTriple(){
        return (this.n1 == this.n2 && this.n1 == this.n3);
    }

    /**
     * Checks if 2 numbers are equal
     * @return true if double, false otherwise
     */
    public boolean isDouble (){
        return (this.n1 == this.n2 || this.n1 == this.n3 || this.n2 == n3);
    }

    /**
     * Calculates points earned or lost based on numbers
     * @return int representing points earned or lost
     */
    private int calcReward () {
        if (this.isTriple()) {
            System.out.println("Is Triple!");
            reward = this.n1*this.n1*this.n1;
        }

        else if (this.isDouble()) {
            System.out.println("Is Double!");

            if (n1 == n2 || n1 == n3)
                reward = this.n1*2;
            else
                reward = this.n2*2;
        }

        else
            reward = -10;

        System.out.println("Reward = " + reward);
        return reward;

    }

    /**
     * Updates total balance based on calcReward()
     * @return int representing total balance
     */
    public int updateBalance(){
        calcReward();
        this.balance = this.balance + calcReward();
        System.out.println("Balance = " + this.balance);
        return this.balance;
    }



}

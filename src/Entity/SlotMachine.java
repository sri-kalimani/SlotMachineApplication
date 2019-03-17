/**
 * Slot Machine
 * @author Sri Kalimani
 * Slot machine page entity class
 */
package Entity;

import java.util.HashMap;
import java.util.Random;

public class SlotMachine {

    private Random rn1 = new Random();
    private Random rn2 = new Random();
    private Random rn3 = new Random();
    private int n1, n2, n3;
    private String fruit1 = "", fruit2 = "", fruit3 = "";
    private int balance;
    int reward;

    public SlotMachine(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.balance = 1000;
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

    public int getReward() { return reward; }

    /**
     * Generates new set of random numbers
     */
    public void generateNum(){
        n1 = rn1.nextInt((10) + 1);
        n2 = rn2.nextInt((10) + 1);
        n3 = rn3.nextInt((10) + 1);
        System.out.println("Random numbers in order: " + n1 + " " + n2 + " " + n3);
    }

    /**
     * Assigns fruit based on number generated
     * Stores fruit names in Hashmap
     */
    public void assignFruit(){
        final HashMap<Integer, String> fruitMap = new HashMap<>();

        fruitMap.put(1, "Raspberry");
        fruitMap.put(2, "Lemon");
        fruitMap.put(3, "Banana");
        fruitMap.put(4, "Plum");
        fruitMap.put(5, "Pear");
        fruitMap.put(6, "Plum");
        fruitMap.put(7, "Strawberry");
        fruitMap.put(8, "Kiwi");
        fruitMap.put(9, "Cherry");
        fruitMap.put(10, "Mango");

        this.fruit1 = fruitMap.get(this.getN1());
        this.fruit2 = fruitMap.get(this.getN2());
        this.fruit3 = fruitMap.get(this.getN3());


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

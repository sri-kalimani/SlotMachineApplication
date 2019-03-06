package Entity;

import java.util.Random;

public class SlotMachine {

/*   private Random rn1, rn2, rn3;
   private int n1 = 0, n2 = 0, n3 = 0;
   private int balance = 0;

    public SlotMachine(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public SlotMachine(Random rn1, Random rn2, Random rn3, int n1, int n2, int n3, int balance) {
        this.rn1 = rn1;
        this.rn2 = rn2;
        this.rn3 = rn3;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.balance = balance;
    }

    public void generateNum(){
        n1 = rn1.nextInt();
        n2 = rn2.nextInt();
        n3 = rn3.nextInt();
    }

    public boolean isTriple(int n1, int n2, int n3){
        return (n1 == n2 && n1 == n3);
    }

    public boolean isDouble (int n1, int n2, int n3){
        return (n1 == n2 || n1 == n3 || n2 == n3);
    }

    public int calcReward (int n1, int n2, int n3) {
        if (this.isTriple(n1, n2, n3)) {
            return (n1*n1*n1);
        }

        else if (this.isDouble(n1, n2, n3)) {
            if (n1 == n2 || n1 == n3)
                return (n1 * 2);
            else
                return (n2 * 2);
        }

        else
            return (-10);
    }

    public int updateBalance(int n1, int n2, int n3){

        balance =+ calcReward(n1, n2, n3);
        return balance;
    }*/

}

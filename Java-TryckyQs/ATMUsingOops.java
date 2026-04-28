
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class ATMUsingOops {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM:");
        int mypin = 23456;
        int totalamount = 100000;

        Scanner sin = new Scanner(System.in);
        System.out.println("enter u r pin:");
        int pin = sin.nextInt();
        if (mypin == pin) {
            System.out.println("your pin is verified:");
            System.out.println("1.Withdraw" + " 2.Deposit" + " 3.Mini statement" + " 4.PIN change" + " 5.exit");

            System.out.println("enter your choice:");
            int choice = sin.nextInt();
            if (choice == 1) {
                System.out.println("welcome to withdrawal:");
                System.out.println("enter u r amount:");
                int amount = sin.nextInt();
                if (amount <= totalamount) {
                    System.out.println("enter u r amount if you have required:");
                    int reamount = sin.nextInt();
                    System.out.println("entering amount is:" + reamount);
                    System.out.println("take ur amount:");
                    int balanceamount = totalamount - reamount;
                    System.out.println("your balance amount is:" + balanceamount);
                } else {
                    System.out.println("enter a sufficient amount:");
                }

            } else if (choice == 2) {
                System.out.println("welcome to deposit money:");
                System.out.println("enter u r amount:");
                int deamount = sin.nextInt();
                if (deamount <= totalamount) {
                    System.out.println("depositing the money:");
                    int demoney = sin.nextInt();
                    System.out.println("your deposit money is:" + demoney);
                    System.out.println("after depositing the money is:");
                    int afterdeposit = totalamount - demoney;
                    System.out.println("after completion of your final amount is:" + afterdeposit);
                } else {
                    System.out.println("enter sufficient amount for deposit:");
                }

            } else if (choice == 3) {
                System.out.println("your current amount is:" + totalamount);
            } else if (choice == 4) {
                System.out.println("enter your pin:");
                int urpin = sin.nextInt();
                if (urpin == mypin) {
                    System.out.println("u r pin is same:");
                } else {
                    System.out.println("enter your newpin:");
                    int newpin = sin.nextInt();
                    System.out.println("your new pin is:" + newpin);
                    mypin = newpin;
                    System.out.println("after completion of pin change your new pin is:" + mypin);
                }
            } else if (choice == 5) {
                System.out.println("process is completed exit:");

            }

        } else {
            System.out.println("your pin is invalid:");
        }
    }
}

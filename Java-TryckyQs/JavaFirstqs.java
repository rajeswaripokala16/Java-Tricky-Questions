
/*
 * 8. ATM User Login System with Lockout (HashMap + Timer)
Problem:
Implement a system where:

Users get 3 chances to enter their PIN

If they fail, the card is blocked for 24 hours
 */

import java.util.*;

class JavaFirstqs {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter times of choice pin:");
        int choice = sin.nextInt();
        System.out.println("Enter Your Pin Here:");
        int n = sin.nextInt();
        int pin = 456789;
        // for (int i = 1; i <= choice; i++) {
        // if (n == pin) {
        // System.out.println("Your successfully login...");
        // // } else {
        // // System.out.println("Try another chance...");
        // // }

        // }

        if (choice <= 3) {
            if (n != pin) {
                choice++;
                System.out.println("Try another chance...");
                // choice++;
                // System.out.println("Your successfully login...");
            } else {
                System.out.println("Your successfully login...");
            }
            // else {
            // choice++;
            // choice++;
            // System.out.println("Try another chance...");
        }
        System.out.println("Oooh Shut ... Your fail");
        System.out.println("The card is blocked for 24 hours");
    }

}

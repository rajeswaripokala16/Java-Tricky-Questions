import java.util.Scanner;

public class InvestMney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;
        char response;

        System.out.print("Enter your amount: ");
        amount = sc.nextInt();

        System.out.print("Do you want to invest your money in scheme? (y/n): ");
        response = sc.next().charAt(0);

        while (response == 'y' || response == 'Y') {
            amount *= 2;
            System.out.println("You've doubled the amount: " + amount);

            System.out.print("Do you want to invest again? (y/n): ");
            response = sc.next().charAt(0);
        }

        sc.close();
    }
}

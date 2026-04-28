import java.util.Scanner;

public class Adding {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sin.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sin.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

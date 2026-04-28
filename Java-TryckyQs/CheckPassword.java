
import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {

        String correctPassword = "Raji123";
        // String inputPassword = "secure123"; // This would typically come from user
        // input

        // You can also use a loop and try again until the password is correct.

        int attempts = 3;
        for (int i = 1; i <= attempts; i++) {
            Scanner sin = new Scanner(System.in);
            System.out.println("Enter the password:");
            String inputPassword = sin.nextLine();

            if (i != attempts) {
                if (inputPassword.equals(correctPassword)) {
                    System.out.println("Access granted.");
                    break;
                } else {
                    System.out.println("Access denied. Try again.");
                }
            } else {
                System.out.println("Access denied. No more attempts left.");
            }

        }
    }

}

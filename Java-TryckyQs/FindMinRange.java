
import java.util.*;

public class FindMinRange {
    public static void main() {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter starting element:");
        int start = sin.nextInt();
        System.out.println("Enter starting element:");
        int end = sin.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (start >= 1 && end <= 100) {
                int mid = start + end / 2;
                System.out.println("Your mid num is:" + mid);
            } else {
                System.out.println("Your number is out of range...");
            }
        }
    }

}

import java.util.*;

public class NumberDiamond {
    public static void main(String[] args) {
        int n = 5;

        // Upper half including middle line
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

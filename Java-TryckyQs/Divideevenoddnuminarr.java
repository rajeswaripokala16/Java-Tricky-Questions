import java.util.*;

public class Divideevenoddnuminarr {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sin.nextInt();
        int[] arr = new int[n];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sin.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even = arr[i];
                System.out.println("Even" + even);
            } else {
                odd = arr[i];
                System.out.println("Odd" + odd);
            }
        }

        // System.out.println("Even arr ele are:" + even + " " + odd);

    }
}

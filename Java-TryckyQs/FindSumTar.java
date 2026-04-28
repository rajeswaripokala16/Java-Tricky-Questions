import java.util.*;

public class FindSumTar {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int target = sin.nextInt();
        int[] arr = { 2, 7, 11, 6, 10, 15 };
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    found = true;
                }

            }
        }

        if (!found) {
            System.out.println("No such pair found");
        }
    }
}

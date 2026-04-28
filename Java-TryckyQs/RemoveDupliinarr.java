import java.util.Scanner;
import java.util.HashSet;

public class RemoveDupliinarr {
    public static void main(String[] args) {
        // Scanner sin = new Scanner(System.in);
        int[] arr = { 2, 3, 4, 2, 1, 5, 6, 6 }; // 1 2 3 4 5 6
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Elements without duplicates:" + set);
    }
}

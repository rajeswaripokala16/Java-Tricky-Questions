import java.util.Arrays;
import java.util.*;

public class recursivesumarr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int sum = 0;
        int ans = findrecsum(arr, sum);
        System.out.println(ans + " ");
    }

    public static int findrecsum(int[] arr, int sum) {

        if (arr.length - 1 == 0) {
            return 0;
        }

        return (findrecsum(sum + arr[i], arr[i]));
        return 0;
    }
}

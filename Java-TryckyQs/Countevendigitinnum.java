import java.util.*;

public class Countevendigitinnum {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int[] num = { 1234, 56, 7, 987, 435 }; // 2

        int ans = count(num);
        System.out.println(ans);
    }

    public static int count(int[] num) {
        int count = 0;
        for (int nums : num) {
            if (even(nums)) {
                count++;
            }
        }
        return count;
    }

    public static int even(int nums) {
        int ans1 = countnum(nums);

        return (ans1 % 2 == 0);
    }

    public static int countnum(int num1) {
        int count = 0;
        while (num1 > 0) {
            int rem = num1 % 10;
            count++;
            num1 = num1 / 10;
        }
        return count;
    }
}

import java.util.*;

public class Digitscountinnum {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter u r num:");
        int num = sin.nextInt();
        int ans = countdigits(num);
        System.out.println(ans);

    }

    public static int countdigits(int num) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
}

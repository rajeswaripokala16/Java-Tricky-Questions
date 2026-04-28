import java.util.*;

public class Findoneextrausebitwise {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter u r str1:");
        String str1 = sin.nextLine();
        System.out.print("Enter u r str2");
        String str2 = sin.nextLine();

        int res = 0;
        int len = str1.length();

        for (int i = 0; i < len; i++) {
            res = res ^ str1.charAt(i) ^ str2.charAt(i);

            res = res ^ str2.charAt(len);
        }

        System.out.println((char) res);

    }
}

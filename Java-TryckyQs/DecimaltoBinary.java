import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter u r binary val:");
        int n = sin.nextInt();
        String s = "";
        while (n > 0) {
            s = s + (n % 10);
            n = n / 10;
        }
        System.out.println("U r binary val is:" + s);
    }
}

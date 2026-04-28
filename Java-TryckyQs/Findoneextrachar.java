import java.util.*;

class FindExtraChar {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter u r str1:");
        String str1 = sin.nextLine();
        System.out.print("Enter u r str2");
        String str2 = sin.nextLine();
        char[] ch1 = str1.toCharArryay();
        char[] ch2 = str2.toCharArryay();
        // str1 = new String(ch1);
        // str2 = new String(ch2);
        // for(int i=0;i<str1.length()-1;i++)
        // {
        // for(int j=0;j<str2.length()-1;j++)
        // {

        // }
        // }
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] != ch2[j]) {
                    System.out.print("Here is the extra char:" + ch1[i]);
                }
            }
        }
    }
}
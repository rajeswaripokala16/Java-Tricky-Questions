
import java.util.*;

public class PrintRajiPokala {
    public static void main(String[] args) {

        String name = "RAJI POKALA";

        for (int i = 0; i < 7; i++) {
            for (int k = 0; k < name.length(); k++) {

                char ch = name.charAt(k);

                if (ch == ' ') {
                    System.out.print("   ");
                    continue;
                }

                for (int j = 0; j < 7; j++) {
                    if (printChar(ch, i, j))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static boolean printChar(char ch, int i, int j) {
        ch = Character.toUpperCase(ch);

        switch (ch) {

            case 'R':
                return j == 0 || (i == 0 && j < 5) || (i == 3 && j < 5) ||
                        (j == 5 && i > 0 && i < 3) || (i - j == 2);
            case 'A':
                return (j == 0 && i > 0) || (j == 6 && i > 0) ||
                        (i == 0 && j > 0 && j < 6) || i == 3;
            case 'J':
                return (i == 0) || (j == 3 && i < 6) ||
                        (i == 6 && j < 4);
            case 'I':
                return i == 0 || i == 6 || j == 3;

            case 'P':
                return j == 0 || (i == 0 && j < 5) || (i == 3 && j < 5) ||
                        (j == 5 && i > 0 && i < 3);
            case 'O':
                return (i == 0 && j > 0 && j < 6) ||
                        (i == 6 && j > 0 && j < 6) ||
                        (j == 0 && i > 0 && i < 6) ||
                        (j == 6 && i > 0 && i < 6);
            case 'K':
                return j == 0 || i + j == 3 || i - j == 3;
            case 'L':
                return j == 0 || i == 6;
            case 'N':
                return j == 0 || j == 6 || i == j;
        }
        return false;
    }
}
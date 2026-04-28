import java.util.Random;

public class GenRandom {
    public static void main(String[] args) {
        // int min = 1;
        // int max = 100;
        // int randomNum = (int) (Math.random() * (max - min + 1)) + min;
        // System.out.println("Generated Random Number: " + randomNum);

        Random rand = new Random();
        String str = " ";
        for (int i = 1; i <= 4; i++) {
            int randomNum = rand.nextInt(10);
            str += randomNum;
        }
        System.out.println("Generated Random Number: " + str);
    }
}

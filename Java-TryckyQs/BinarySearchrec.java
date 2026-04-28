import java.util.Scanner;

public class BinarySearchrec {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter u r searching ele:");
        int n = sin.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int ans = serachrec(arr, n);
    }

    public static int serachrec(int[] arr, int sea) {
        if (arr.length - 1 == 0) {
            return 0;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == sea) {
                return mid;
            } else if (sea <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;

    }
}

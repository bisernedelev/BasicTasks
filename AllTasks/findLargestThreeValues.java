import java.util.Scanner;

public class findLargestThreeValues {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int min = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;
        int max = a;


        for (int i = 1; i <= n - 1; i++) {
            int b = sc.nextInt();
            if (b > max) {
                min = mid;
                mid = max;
                max = b;
            } else if (b > mid) {
                min = mid;
                mid = b;

            } else if (b > min) {
                min = b;
            }


        }
        System.out.printf("%d,%d and %d", max, mid, min);


    }
}
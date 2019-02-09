import java.util.Scanner;

public class findMaximumValue {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = sc.nextInt();

        for (int i = 1; i <= n - 1; i++) {
            int a = sc.nextInt();
            if (a > max) {
                max = a;
            }


        }
        System.out.println(max);
    }
}
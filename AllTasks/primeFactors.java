import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                a=a/i;
                System.out.println(i);
                i--;
            }
        }
    }
}
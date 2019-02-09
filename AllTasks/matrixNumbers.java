import java.util.Scanner;

public class matrixNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.print(i);
            for (int j=1;j<n;j++){
                System.out.print(i+j);

            }

            System.out.println();
        }
    }
}
import java.util.Scanner;

public class MatrixEx {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = sc.nextInt();

        int[][] m1 = new int[n][n];
        for (int row = 0; row < m1.length; row++) {
            for (int col = 0; col < m1[row].length; col++) {
                m1[row][col] = count;
                count++;
                System.out.print(String.format("%d ", m1[row][col]));
            }

            System.out.println();

        }
    }

}

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arrStr = input.split(", ");
        int[] arrInt = new int[arrStr.length];

        for (int i = 0; i <= arrInt.length - 1; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        Arrays.sort(arrInt);
        for (int y = arrInt.length - 1; y >= 1; y--)
            System.out.print(arrInt[y] + ", ");
        System.out.print(arrInt[0]);
    }
}
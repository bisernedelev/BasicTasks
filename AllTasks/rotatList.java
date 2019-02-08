import java.util.Scanner;

public class rotatList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = sc.nextInt();

        String[] array = input.split(",");
        String[] array2 = new String[array.length];

        if (n <= array.length) {
            for (int i = 0; i < array.length; i++) {
                array2[(i + (array.length - n)) % array.length] = array[i];
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                array2[(i + (array.length - (n % array.length))) % array.length] = array[i];
            }
        }
        for (int y = 0; y < array2.length - 1; y++) {
            System.out.print(array2[y] + ",");
        }
        System.out.print(array2[array2.length - 1]);
    }
}
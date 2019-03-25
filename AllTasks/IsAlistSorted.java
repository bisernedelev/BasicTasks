import java.util.Scanner;

public class IsAlistSorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        int n = Integer.parseInt(n1);
        String[] result = new String[n];

        int flag = 0;
        for (int z = 0; z <n; z++) {

            String input = sc.nextLine();
            String[] array = input.split(",");
            int[] arrInt = new int[array.length];

            for (int i = 0; i < array.length - 1; i++) {
                arrInt[i] = Integer.parseInt(array[i]);
                arrInt[i + 1] = Integer.parseInt(array[i + 1]);
            }
            for (int y = 0; y <= arrInt.length - 2; y++) {
                if (arrInt[y] > arrInt[y + 1]) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                result[z]="false";
            } else {
                result[z]="true";
            }
            flag=0;
        }
        for(int a =0;a<result.length;a++){
            System.out.println(result[a]);
        }

    }
}

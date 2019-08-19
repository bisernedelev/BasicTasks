import java.util.Scanner;

public class CombineList {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        String[] array = input.split(",");
        String[] array2 = input2.split(",");
        int[] arrInt = new int[array.length];
        int[] arrInt2 = new int[array2.length];

        for (int i = 0; i <= arrInt.length - 1; i++) {
            arrInt[i] = Integer.parseInt(array[i]);
            arrInt2[i] = Integer.parseInt(array2[i]);

        }
        int[] array1and2 = new int[arrInt.length + arrInt2.length];

        for (int y = 0; y <= array1and2.length-1; y+=2) {
            if (y % 2 == 0) {
                array1and2[y] = arrInt[y/2];
            }
            if(y==0){
                array1and2[y + 1] = arrInt2[y];
            }
            if(y>0){
                array1and2[y + 1] = arrInt2[y/2];
            }
        }
        for (int z = 0; z <= array1and2.length-2; z++) {
            System.out.print(array1and2[z] + ",");
        }
        System.out.print(array1and2[array1and2.length-1] );
    }
}

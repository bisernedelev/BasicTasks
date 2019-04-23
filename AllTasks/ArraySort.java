import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(",");
        int[] arrayInt = new int[array.length];
        int[] array0 = new int[array.length];
        int[] arrayAbove0 = new int[array.length];
        int idx = 0;
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;

      for (int a1 = 0; a1 < array0.length; a1++) {
            array0[a1] = 999;
        }

        for (int a = 0; a < array.length; a++) {
            arrayInt[a] = Integer.parseInt(array[a]);
        }

        for (int b = 0; b < arrayInt.length; b++) {
            if (arrayInt[b] == 0) {
                array0[b] = arrayInt[b];
            } else {
                arrayAbove0[b] = arrayInt[b];
            }
        }
        for (int c = 0; c < array0.length; c++) {
            if (array0[c] == 0) {
                idx++;
            }
        }
        int[] only0 = new int[idx];
        for (int d = 0; d < array0.length; d++) {
            if (array0[d] == 0) {
                only0[idx1] = array0[d];
                idx1++;
            }
        }
        for (int e = 0; e < arrayAbove0.length; e++) {
            if (arrayAbove0[e] != 0) {
                idx2++;
            }
        }
        int[] arrayAbove = new int[idx2];

        for (int f = 0; f < arrayAbove0.length; f++) {
            if (arrayAbove0[f] != 0) {
                arrayAbove[idx3] = arrayAbove0[f];
                idx3++;
            }
        }

        for (int g = 0; g < arrayAbove.length; g++) {
            System.out.print(arrayAbove[g] + ",");
        }
        for (int h = 0; h < only0.length - 1; h++) {
            System.out.print(only0[h] + ",");
        }
        System.out.print(only0[only0.length - 1]);
    }

}

import java.util.Scanner;


public class fixOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(",");
        String[] array0 = new String[array.length];
        int[] arrayInt = new int[array.length];
        String[] arrayLow = new String[array.length];
        String[] arrayBig = new String[array.length];
        int count0 = 0;
        int countLow = 0;
        int countBig = 0;
        int f1 = 0;
        int g1 = 0;
        int h1 = 0;
        boolean has0=false;
        for (int i = 0; i < array0.length; i++) {
            if (array[i].equals("0")) {
                array0[i] = "0";
            }
        }

        for (int a = 0; a < array0.length; a++) {
            arrayInt[a] = Integer.parseInt(array[a]);
        }
        for (int b = 0; b < array0.length; b++) {
            if (arrayInt[b] < 0) {
                arrayLow[b] = Integer.toString(arrayInt[b]);
            } else if (arrayInt[b] > 0) {
                arrayBig[b] = Integer.toString(arrayInt[b]);
            }
        }
        for (int c = 0; c < array0.length; c++) {
            if (array0[c] != null) {
                count0++;
            }
        }
        for (int d = 0; d < array0.length; d++) {
            if (arrayLow[d] != null) {
                countLow++;
            }
        }
        for (int e = 0; e < array0.length; e++) {
            if (arrayBig[e] != null) {
                countBig++;
            }
        }
        String[] array01 = new String[count0];
        String[] arrayLow1 = new String[countLow];
        String[] arrayBig1 = new String[countBig];


        for (int z = 0; z < array0.length; z++) {
            if (array[z].equals("0")) {
                has0=true;
            }
        }


        for (int f = 0; f < array0.length; f++) {

            if (array0[f] != null) {
                array01[f1] = array0[f];
                f1++;
            }
        }

        for (int g = 0; g < arrayLow.length; g++) {

            if (arrayLow[g] != null) {
                arrayLow1[g1] = arrayLow[g];
                g1++;

            }
        }
        for (int h = 0; h < arrayBig.length; h++) {

            if (arrayBig[h] != null) {
                arrayBig1[h1] = arrayBig[h];
                h1++;
            }
        }

        if (!has0) {
            for (int p = 0; p < arrayLow1.length - 1; p++) {
                System.out.print(arrayLow1[p] + ",");
            }
            System.out.print(arrayLow1[arrayLow1.length - 1]);

        } else   {
            for (int l = 0; l < arrayLow1.length; l++) {
                System.out.print(arrayLow1[l] + ",");
            }

            for (int k = 0; k < array01.length; k++) {
                System.out.print(array01[k] + ",");
            }
            for (int o = 0; o < arrayBig1.length - 1; o++) {
                System.out.print(arrayBig1[o] + ",");


            }
            System.out.print(arrayBig1[arrayBig1.length - 1]);
        }

    }


}

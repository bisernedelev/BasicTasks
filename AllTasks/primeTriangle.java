import java.util.Scanner;

public class primeTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int primeNumbersCount = n - 1;
        String s = "1";
        String ss = "111";
        String emptyS = "";
        int idx = 3;


        for (int a = 1; a < array.length; a++) {
            array[a - 1] = a;
        }
        array[n - 1] = n;

        for (int b = 0; b < array.length; b++) {
            for (int c = 2; c < array[b] / 2; c++) {
                if (array[b] % c == 0) {
                    primeNumbersCount--;
                    break;
                }
            }
        }
        int[] primeNumbers = new int[primeNumbersCount];

        for (int c = 0; c < array.length; c++) {
            if (array[c] == 1) {
                primeNumbers[c] = 1;

            } else if (array[c] == 2) {
                primeNumbers[c] = 2;

            } else if (array[c] == 3) {
                primeNumbers[c] = 3;

            } else {
                int maxDividar = (int) Math.sqrt(array[c]);
                boolean isPrime = true;

                for (int e = 2; e <= maxDividar; e++) {
                    if (array[c] % e == 0) {
                        isPrime = false;
                    }
                }
                if (isPrime) {
                    primeNumbers[idx] = array[c];
                    idx++;
                }
            }
        }
        System.out.println(s);
        System.out.println(s + s);
        System.out.println(s + s + s);


        for (int f = 3; f <primeNumbers.length; f++) {
            for (int k = 1; k <=primeNumbers[f]; k++) {
                int maxDividar1 = (int) Math.sqrt(k);
                boolean isPrime1 = true;

                for (int e = 2; e <= maxDividar1; e++) {
                    if (k % e == 0) {
                        isPrime1 = false;
                    }
                }
                if (isPrime1) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }


            }


            System.out.println();

        }

    }
}
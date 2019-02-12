import java.util.Scanner;

public class crookedDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.replaceAll("[^0-9]", "");
        char[] ch = s.toCharArray();
        String[] stringArray = new String[ch.length];
        int[] intArray = new int[stringArray.length];

        int[]biggerSum=new int [2];

        for (int i = 0; i < ch.length - 1; i++) {
            stringArray[i] = ch[i] + "";
        }
        stringArray[ch.length - 1] = ch[ch.length - 1] + "";

        for (int b = 0; b < intArray.length; b++) {
            intArray[b] = Integer.parseInt(stringArray[b]);
        }
        int sum = intArray[0];
        if (intArray.length != 1) {
            for (int d = 1; d < intArray.length; d++) {
                sum+=intArray[d];
                if (sum>9){
                    biggerSum[0]=1;
                    biggerSum[1]=sum%10;
                    sum=biggerSum[0]+biggerSum[1];
                }

            }
            System.out.println(sum);
        }
        else
        {
            System.out.println(intArray[0]);
        }


    }
}
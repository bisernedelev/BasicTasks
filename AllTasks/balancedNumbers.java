import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class balancedNumbers {

    static void testInput() {
        String input = "275\n" +
                "693\n" +
                "110\n" +
                "742" ;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {


        int sum = 0 ;
        int[] array = new int [3];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int number = sc.nextInt();
            array[0]=number/100;
            array[1]=(number/10)%10;
            array[2]=(number%110)%10;

            if (array[0]+array[2]==array[1]){
                sum+=number;
            }




        }
        System.out.println(sum);
    }
}

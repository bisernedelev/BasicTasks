import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class theGame {

    static void testInput() {
        String input = "000" ;

        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {


        int[] array = new int [3];
        int[] array2 = new int [4];

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int number = sc.nextInt();
            array[0]=number/100;
            array[1]=(number/10)%10;
            array[2]=(number%110)%10;
        }

        array2[0]=array[0]*array[1]*array[2];
        array2[1]=array[0]+array[1]*array[2];
        array2[2]=array[0]*array[1]+array[2];
        array2[3]=array[0]+array[1]+array[2];

        if (array2[0]>array2[1] && array2[0]>array2[2] &&array2[0]>array2[3] ){
            System.out.println(array2[0]);
        }
        else if(array2[1]>array2[0]&& array2[1]>array2[2]&&array2[1]>array2[3]){
            System.out.println(array2[1]);
        }
        else if(array2[2]>array2[0]&& array2[2]>array2[1]&&array2[2]>array2[3]){
            System.out.println(array2[2]);
        }else if (array2[3]>array2[0]&& array2[3]>array2[1]&&array2[3]>array2[2]){
            System.out.println(array2[3]);
        }else {
            System.out.println("3");
        }


    }
}
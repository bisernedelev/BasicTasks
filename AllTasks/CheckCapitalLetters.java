

import java.util.ArrayList;
import java.util.Arrays;

public class CheckCapitalLetters {

    public static boolean checkCapitalLetter (String word) {
        char[] a = word.toLowerCase().toCharArray();
        char[] b = word.toCharArray();

        boolean result=false;
        for (int i=0;i<word.length();i++){
            if (a[i]!=b[i]){
                result=true;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        String text1 = "Welcome to this bullet proof exam!+"
                + "Can you invent and write a solution to this task!+"
                + " GOOD LUCK !! SUCCEED SUCCESS";

        String[]test1 = text1.split("[^A-Za-z]+");

        ArrayList<String> words1 = new ArrayList<String>();

        int counter = 0;
        for (int i = 0; i < test1.length; i++) {
            if (checkCapitalLetter(test1[i])){

                if (!words1.contains(test1[i])) {
                    words1.add(test1[i]);
                }


            }



         }
        System.out.println(test1.length);
        System.out.println(Arrays.toString(test1));
        System.out.println(counter);
        System.out.println(words1);

    }
}

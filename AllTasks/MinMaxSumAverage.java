import java.text.DecimalFormat;
import java.util.Scanner;

public class MinMaxSumAverage {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double number = sc.nextDouble();
        double min = number;
        double max = number;
        double total = number;
        double avg = number;

        for (int i = 1; i < x; i++) {

            double number2 = sc.nextDouble();
            total = total + number2;
            avg = total / x;
            if (number2 < min) {
                min = number2;
            }
            if (number2 > max) {
                max = number2;
            }

        }

        if (total != 0) {
            System.out.println("min=" + df.format(min));
            System.out.println("max=" + df.format(max));
            System.out.println("sum=" + df.format(total));
            System.out.println("avg=" + df.format(avg));
        } else {
            System.out.println("min=" + df.format(min));
            System.out.println("max=" + df.format(max));
            System.out.println("sum=0.00");
            System.out.println("avg=0.00");
        }


    }
}
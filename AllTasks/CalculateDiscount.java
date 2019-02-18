import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double number ;
        double total = 0;

        for (int i = 0; i < x; i++) {
            number = sc.nextDouble();
            total = number - (number * 0.65);
            System.out.println(df.format(total));
        }


    }
}

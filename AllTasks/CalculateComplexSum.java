import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateComplexSum {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00000");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        double a = 1;
        double total = 1;

        for (int i = 1; i <= n; i++) {
            int b = 0;
            double integral = (a * (a - (a - 1)));
            double sum = integral / (Math.pow(x, i));
            a = a * (i + 1);

            total += sum;
}
        System.out.println(df.format(total));
 }
}

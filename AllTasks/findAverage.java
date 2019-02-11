import java.text.DecimalFormat;
import java.util.Scanner;

public class findAverage {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        double x = Double.parseDouble(str);
        double sum= 0;

        for (int i = 1; i <= x; i++) {
            String str2 = sc.nextLine();
            double d = Double.parseDouble(str2);
            sum+=d;
        }
        double total = sum/x;

        String totalFormated = df.format(total);

        System.out.println(totalFormated);
    }
}
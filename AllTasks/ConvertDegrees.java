import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertDegrees {
    public static void main(String[] args) {

        
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
            int i = sc.nextInt();
            int a= (int) ((i*1.8)+32);
            System.out.println(a);
            
        }
    }
}

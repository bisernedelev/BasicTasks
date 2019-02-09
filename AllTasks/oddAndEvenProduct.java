import java.util.Scanner;

public class oddAndEvenProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd =1;
        int even=1;


        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if (i%2==1){
                odd*=a;
            }
            if (i%2==0){
                even*=a;
            }
        }
        if (odd==even){
            System.out.printf("yes %d",odd);
        }else{
            System.out.printf("no %d %d",odd,even);
        }
    }
}
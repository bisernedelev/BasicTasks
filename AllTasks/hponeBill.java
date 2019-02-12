import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class hponeBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");
        int messages = sc.nextInt();
        int minutes = sc.nextInt();

        int additionalMessages = messages - 20;
        double messageCost = additionalMessages * 0.06;

        double taxesMessages = messageCost * 0.2;

        double messageBill = messageCost + taxesMessages;


        int additionalMinutes = minutes - 60;
        double minuteCost = additionalMinutes * 0.1;

        double taxesMinutes = minuteCost * 0.2;

        double minuteBill = minuteCost + taxesMinutes;

        double taxes = taxesMessages + taxesMinutes;


        double bill = 12.00 + minuteBill + messageBill;
        double bill2 = 12.00+messageBill;

        if (additionalMessages > 0 && additionalMinutes > 0) {

            System.out.println(additionalMessages + " additional messages for " + formatter.format(messageCost) + " levas");
            System.out.println(additionalMinutes + " additional minutes for " + formatter.format(minuteCost) + " levas");
            System.out.println(formatter.format(taxes) + " additional taxes");
            System.out.println(formatter.format(bill) + " total bill");

        } else if (additionalMessages > 0 && additionalMinutes <= 0) {
            System.out.println(additionalMessages + " additional messages for " + formatter.format(messageCost) + " levas");
            System.out.println("0 additional minutes for " + "0.00 levas");
            System.out.println(formatter.format(taxesMessages) + " additional taxes");
            System.out.println(formatter.format(bill2) + " total bill");

        } else if (additionalMessages <= 0 && additionalMinutes > 0) {
            System.out.println(0 + " additional messages for 0.00 levas");
            System.out.println(additionalMinutes + " additional minutes for " + formatter.format(minuteCost) + " levas");
            System.out.println(formatter.format(taxesMinutes) + " additional taxes");
            System.out.println(formatter.format(bill) + " total bill");

        } else if (additionalMessages <= 0 && additionalMinutes <= 0) {
            System.out.println(0 + " additional messages for 0.00 levas");
            System.out.println(0 + " additional minutes for 0.00 levas");
            System.out.println("0.00 additional taxes");
            System.out.println(formatter.format(12) + " total bill");

        }
    }
}
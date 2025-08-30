package Level_1;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        double profit = sp - cp;
        double profitPercent = (profit / cp) * 100;

        System.out.println("The Cost Price is INR " + cp + " and Selling Price is INR " + sp +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}


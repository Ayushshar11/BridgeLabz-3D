package Level_1;
import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

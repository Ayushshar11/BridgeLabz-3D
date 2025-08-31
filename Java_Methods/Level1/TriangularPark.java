package Java_Methods.Level1;

import java.util.*;

public class TriangularPark {
    public static double rounds(double a, double b, double c) {
        return 5000 / (a + b + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(Math.ceil(rounds(a, b, c)));
    }
}

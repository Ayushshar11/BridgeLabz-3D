package Java_Methods.Level1;

import java.util.*;

public class SimpleInterest {
    public static double calculate(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        System.out.println(calculate(p, r, t));
    }
}

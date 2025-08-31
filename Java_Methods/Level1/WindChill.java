package Java_Methods.Level1;

import java.util.*;

public class WindChill {
    public static double calc(double t, double w) {
        return 35.74 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(w, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble(), w = sc.nextDouble();
        System.out.println(calc(t, w));
    }
}

package Java_Methods.Level3;

import java.util.*;

public class FactorsAdvanced {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int num : arr) prod *= num;
        return prod;
    }

    public static int productCube(int[] arr) {
        int prod = 1;
        for (int num : arr) prod *= Math.pow(num, 3);
        return prod;
    }

    public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] factors = findFactors(number);

        System.out.println(sum(factors));
        System.out.println(product(factors));
        System.out.println(productCube(factors));
        System.out.println(greatestFactor(factors));
    }
}

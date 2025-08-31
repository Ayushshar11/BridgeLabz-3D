package Java_Methods.Level3;

import java.util.*;

public class NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] digitsArray(int number) {
        int[] digits = new int[countDigits(number)];
        int index = digits.length - 1;
        while (number > 0) {
            digits[index--] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int number) {
        int[] digits = digitsArray(number);
        for (int digit : digits) if (digit != 0) return true;
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] digits = digitsArray(number);
        int sum = 0;
        int n = digits.length;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == number;
    }

    public static int[] largestTwo(int[] numbers) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > first) { second = first; first = num; }
            else if (num > second) second = num;
        }
        return new int[]{first, second};
    }

    public static int[] smallestTwo(int[] numbers) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < first) { second = first; first = num; }
            else if (num < second) second = num;
        }
        return new int[]{first, second};
    }

    public static int sumDigits(int number) {
        int sum = 0;
        for (int d : digitsArray(number)) sum += d;
        return sum;
    }

    public static int sumSquares(int number) {
        int sum = 0;
        for (int d : digitsArray(number)) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number) {
        return number % sumDigits(number) == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] freq = new int[10];
        for (int d : digitsArray(number)) freq[d]++;
        int[][] result = new int[10][2];
        for (int i = 0; i < 10; i++) { result[i][0] = i; result[i][1] = freq[i]; }
        return result;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean compareArrays(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int number) {
        return compareArrays(digitsArray(number), reverseArray(digitsArray(number)));
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) if (number % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        for (int d : digitsArray(square)) sum += d;
        return sum == number;
    }

    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        for (int d : digitsArray(number)) { sum += d; product *= d; }
        return sum == product;
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) if (number % i == 0) sum += i;
        return sum == number;
    }

    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) if (number % i == 0) sum += i;
        return sum > number;
    }

    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) if (number % i == 0) sum += i;
        return sum < number;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        for (int d : digitsArray(number)) {
            int fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
        }
        return sum == number;
    }
}

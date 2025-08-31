package Java_Methods.Level3;

import java.util.*;

public class ShortestTallestMean {

    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++)
            heights[i] = 150 + rand.nextInt(101);
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static int min(int[] arr) {
        int m = arr[0];
        for (int val : arr) if (val < m) m = val;
        return m;
    }

    public static int max(int[] arr) {
        int m = arr[0];
        for (int val : arr) if (val > m) m = val;
        return m;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Mean: " + mean(heights));
        System.out.println("Shortest: " + min(heights));
        System.out.println("Tallest: " + max(heights));
    }
}

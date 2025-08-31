package Java_Methods.Level3;

import java.util.*;

public class MatrixTransposeInverse {

    public static double[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] mat = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static double[][] transpose(double[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                trans[j][i] = mat[i][j];
        return trans;
    }

    public static void display(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        double[][] mat = createMatrix(r, c);
        display(mat);
        display(transpose(mat));
    }
}


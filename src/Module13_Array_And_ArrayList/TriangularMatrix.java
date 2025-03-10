package Module13_Array_And_ArrayList;

import java.util.Scanner;

public class TriangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Taking input for matrix size
        System.out.print("Enter the size of the matrix: ");
        n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Taking matrix input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        // Printing original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix, n);

        // Making lower triangular part zero
        System.out.println("\nUpper Triangular Matrix (Lower part zero):");
        printUpperTriangular(matrix, n);

        // Making upper triangular part zero
        System.out.println("\nLower Triangular Matrix (Upper part zero):");
        printLowerTriangular(matrix, n);
    }

    // Function to print matrix
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to print upper triangular matrix
    public static void printUpperTriangular(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Function to print lower triangular matrix
    public static void printLowerTriangular(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

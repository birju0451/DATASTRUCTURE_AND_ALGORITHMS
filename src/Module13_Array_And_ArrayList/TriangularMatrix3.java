package Module13_Array_And_ArrayList;

import java.util.Scanner;

public class TriangularMatrix3 {
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

        // Creating copies of the original matrix
        int[][] upperTriangular = new int[n][n];
        int[][] lowerTriangular = new int[n][n];

        // Copy original matrix to both copies
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                upperTriangular[i][j] = matrix[i][j];
                lowerTriangular[i][j] = matrix[i][j];
            }
        }

        // Convert to Upper Triangular (Make lower part zero)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                upperTriangular[i][j] = 0;
            }
        }

        // Convert to Lower Triangular (Make upper part zero)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                lowerTriangular[i][j] = 0;
            }
        }

        // Printing original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Printing Upper Triangular Matrix
        System.out.println("\nUpper Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(upperTriangular[i][j] + " ");
            }
            System.out.println();
        }

        // Printing Lower Triangular Matrix
        System.out.println("\nLower Triangular Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(lowerTriangular[i][j] + " ");
            }
            System.out.println();
        }
    }
}

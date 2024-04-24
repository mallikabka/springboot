package com.ojas.basic;

public class MatrixTwoDimensionalArray {

	    public static void main(String[] args) {
	        // Original matrix
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Print original matrix
	        System.out.println("Original Matrix:");
	        printMatrix(matrix);

	        // Transposing matrix
	        int[][] transposedMatrix = new int[3][3]; // since it's a 3x3 matrix

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                transposedMatrix[j][i] = matrix[i][j];
	            }
	        }

	        // Print transposed matrix
	        System.out.println("Transposed Matrix:");
	        printMatrix(transposedMatrix);
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }
	}



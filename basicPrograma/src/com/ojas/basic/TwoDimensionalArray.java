package com.ojas.basic;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		String[][] matrix= {{"a1","b1","c1"},{"a2","b2","c3"},{"a3","b3","c3"}};
		printMatrix(matrix);
		String[][] transposeMatrix=new String[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transposeMatrix[j][i]=matrix[i][j];
			}
		}
		System.out.println();
		printMatrix(transposeMatrix);
		
	}
	public static void printMatrix(String[][] arr) {
		for(String[] row:arr) {
			for(String val:row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}


	
}

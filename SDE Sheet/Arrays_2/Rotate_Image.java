package com.company.Arrays2;


//https://leetcode.com/problems/rotate-image/
public class Rotate_Image {
    public static void main(String[] args) {

    }
    public static void rotate(int[][] matrix) {
        tanspose (matrix);
        for (int[] mat : matrix) {
            reverse (mat);
        }
    }

    private static void reverse(int[] mat) {
        int n = mat.length - 1;
        for (int i = 0; i < mat.length / 2; i++) {
            int temp = mat[i];
            mat[i] = mat[n - i];
            mat[n - i] = temp;
        }
    }

    private static void tanspose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
    }

}

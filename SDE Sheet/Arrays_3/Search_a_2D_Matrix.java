//https://leetcode.com/problems/search-a-2d-matrix/
package com.company.Arrays_3;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {

    }

//    Binary Search in 2D array
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            int midVal = matrix[mid / col][mid % col];
            if (midVal == target) return true;
            if (midVal > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}

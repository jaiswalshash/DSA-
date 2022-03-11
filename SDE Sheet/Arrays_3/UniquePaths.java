package com.company.Arrays_3;

public class UniquePaths {
    public static void main(String[] args) {

    }
    public static int uniquePaths(int m, int n) {
        int M = m + n - 2;
        int r = m - 1;
        double ans = 1;
        for (int i = 1; i <= r; i++) {
            ans = ans * (M - r + i) / i;
        }
        return (int)ans;
    }
}

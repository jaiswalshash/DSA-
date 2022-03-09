package com.company.Arrays;

public class Kadane_Algo {
    public static void main(String[] args) {

    }
    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE, count = 0;
        for (int num : nums) {
            if (count < 0)
                count = num;
            else
                count += num;
            if (count > sum) {
                sum = count;
            }
        }
        return sum;
    }
}

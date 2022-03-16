package com.company.Arrays_4;

import java.util.HashSet;


public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[]  a= {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(a));
    }
    public static int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int a:nums) {
            set.add(a);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int temp = 1;
                while (set.contains(num + 1)) {
                    temp++;
                    num += 1;
                }
                ans = Math.max(ans, temp);
            }
        }
        return ans;
    }
}

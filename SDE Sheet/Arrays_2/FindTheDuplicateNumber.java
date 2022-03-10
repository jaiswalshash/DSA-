package com.company.Arrays2;


public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] a = {1,3,4,2,2};
        System.out.println(findDuplicate(a));

    }
    public static int findDuplicate(int[] nums) {
        int ans = 0;
        int[] temp = new int[nums.length];
        for (int num : nums) {
            temp[num]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1){
                ans = i;
                break;
            }
        }
        return ans;
    }
}

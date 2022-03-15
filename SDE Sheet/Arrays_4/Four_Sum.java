package com.company.Arrays_4;

import java.util.*;

public class Four_Sum {
    public static void main(String[] args) {
        int[] num = {2,2,2,2,2};
        System.out.println(fourSum(num, 8));

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i+1; j < nums.length - 2 ; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while(left<right){
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target) {
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[left]);
                        a.add(nums[right]);
                        ans.add(a);
                        while (left < right && nums[right] == a.get(2))++left;
                        while (left < right && nums[right] == a.get(3))--right;
                    }

                    else if(sum<target){
                        if (nums[left] == nums[left + 1]) left+=2;
                        else left++;
                    }

                    else right--;
                }
                while (j + 1 < nums.length && nums[j + 1] == nums[j])++j;
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i])++i;
        }
        return ans;
    }
}

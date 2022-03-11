package com.company.Arrays_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Majority_Elt {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        if(nums.length==1)
        {
            result.add(nums[0]);
            return result;
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer i : map.keySet())
        {
            if(map.get(i)>nums.length/3)
                result.add(i);
        }
        return result;
    }
}

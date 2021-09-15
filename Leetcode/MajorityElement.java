package Leetcode;

import java.util.HashMap;

public class MajorityElement {
    static public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (h.getOrDefault(nums[i], 0) == 0) {
                h.put(nums[i], 1);
            } else {
                h.put(nums[i], h.get(nums[i] + 1));
            }
        }
        int max = 0;
        for (int i : h.keySet()) {
            if (h.get(i) > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] nums={2,3,2,4};
        System.out.println(majorityElement(nums));
    }
}
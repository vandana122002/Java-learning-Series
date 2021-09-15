package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public static int  findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)
        {
            p.add(i);
        }
        while (!p.isEmpty()&&k>1)
        {
            p.poll();
            k--;
        }
        return p.poll();
    }
    public static void main(String[] args)
    {
        int[] nums={3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
}

package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Intersection_of_two_array {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int i:nums1)
        {
            s1.add(i);
        }
        for(int i:nums2)
        {
            s2.add(i);
        }
        s1.retainAll(s2);
        int[] ans=new int[s1.size()];
        int k=0;
        for(int i:s1)
        {
                ans[k++]=i;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> a=new ArrayList<>();
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] ans=intersection(nums1,nums2);
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}

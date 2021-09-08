package Java_ds_algo.Java;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
            int[] nums1={1,2,3,0,0,0};
        int m=3;
                int[] nums2={2,5,6};
        int n=3;

        int[] added=new int[m+n];
        for(int i=0;i<m;i++)
        {
            added[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            added[i+m]=nums2[i];
        }
        Arrays.sort(added);
        for(int i:added)
        {
            System.out.println(i);
        }
    }
}

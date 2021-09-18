package Geeks_For_Geeks;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> h=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            h.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            h.add(b[i]);
        }
        return h.size();
    }
    public static void main(String[] args)
    {
        int[] num={1,2,3,4,5};
        int[] num1={1,2,3};
    }
}

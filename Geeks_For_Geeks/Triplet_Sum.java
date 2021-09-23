package Geeks_For_Geeks;

import java.util.Arrays;

public class Triplet_Sum {

    static boolean twocheck(int[] A,int s,int e,int X)
    {
        int i=s,j=e-1;
        while(i<j)
        {
            System.out.println(A[i]+" "+A[j]);
            if(A[i]+A[j]>X)
            {
                j--;
            }else if(A[i]+A[j]<X)
            {
                i++;
            }else
            {
                return true;
            }
        }
        return false;
    }

    public static boolean find3Numbers(int A[], int n, int X) {

        // Your code Here
        Arrays.sort(A);
        for(int i:A)
        {
            System.out.print(i+" ");
        }

        for(int i=0;i<n-2;i++)
        {
            int val=X-A[i];
            System.out.println("val is "+val);
            if(twocheck(A,i+1,A.length,val))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int arr[] = {589,343,609,61,222,759,955,889,147,691,950,844,431,621,749,68,537,784,36,227,186,39,854,630,225,749,924,360,258,767,945,956,319,727,412,26,356,2,550,497,585,516,965,343,76,914,143,197,949,73};
        System.out.println(find3Numbers(arr,arr.length,182));
    }
}

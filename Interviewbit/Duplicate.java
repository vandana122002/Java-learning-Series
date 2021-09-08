package Interviewbit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Duplicate {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        static public int repeatedNumber(final int[] A) {
            int[] ans=new int[A.length];
            int a=-1;
            System.out.println("Length is "+A.length);
            for(int i=0;i<A.length;i++)
            {
                ans[A[i]]++;
            }
            for(int i=0;i<ans.length;i++)
            {
                System.out.println(i+" value is "+ans[i]);
            }
            for(int i=0;i<A.length;i++)
            {
                if(ans[i]>1)
                {
                    a=i;
                    break;
                }
            }
            return a;
        }
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=b.readLine().trim().split(", ");
        int[] A=new int[360];
        for(int i=0;i<arr.length;i++) {
            A[i] =Integer.parseInt(arr[i]);
        }
        System.out.println(repeatedNumber(A));
    }

}

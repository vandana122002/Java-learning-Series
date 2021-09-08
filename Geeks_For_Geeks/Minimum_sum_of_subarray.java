package Geeks_For_Geeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Minimum_sum_of_subarray {

    static int min(int[] arr)
    {
        Arrays.sort(arr);
        int sum=0;
        for(int i:arr)
        {
            if(i<0)
            {
                sum=sum+i;
            }
        }
        if(sum<0)
        {
            return sum;
        }else
        {
            return arr[0];
        }
    }
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int[] fwd = Arrays.copyOfRange(arr, i, arr.length);
                int ans = min(fwd);
                System.out.print(ans + " ");
            }
        }
    }
}

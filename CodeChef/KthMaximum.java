package CodeChef;

import java.util.Scanner;

public class KthMaximum {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        long T=scan.nextInt();
        while(T-->0)
        {
            int N= scan.nextInt();
            int K= scan.nextInt();
            long[] arr=new long[N];
            for(int i=0;i<N;i++)
            {
                arr[i]= scan.nextInt();
            }
            long max=Integer.MIN_VALUE;
            for(int i=0;i<N;i++)
            {
                max=Math.max(arr[i],max);
            }

            long ans=0;
            for(int i=K-1;i<N;i++)
            {
                if(arr[i]==max) {
                    ans += (N - i);
                }
            }
            System.out.println(ans);
        }
    }
}

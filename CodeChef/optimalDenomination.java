package CodeChef;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class optimalDenomination {
    static long gcd(long a,long b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int N= scan.nextInt();
            long[] arr=new long[N];
            if(N==1)
            {
                System.out.println("1");
            }else {
                int sum=0;
                for (int i = 0; i < N; i++) {
                    arr[i] = scan.nextInt();
                    sum+=arr[i];
                }
                long[] fwd = new long[N];
                long[] bwd = new long[N];
                long[] mid = new long[N];
                fwd[0] = arr[0];
                for (int i = 1; i < N; i++) {
                    fwd[i] = gcd(fwd[i - 1], arr[i]);
                }
                bwd[N - 1] = arr[N - 1];
                for (int i = N - 2; i >= 0; i--) {
                    bwd[i] = gcd(bwd[i +1], arr[i]);
                }
                mid[0]=bwd[0];
                mid[N-1]=fwd[N-2];
                for(int i=1;i<N-1;i++)
                {
                    mid[i]=gcd(fwd[i-1],bwd[i+1]);
                }
                long min=Long.MAX_VALUE;
                for(long i:fwd)
                {
                    System.out.println("fwd is "+i);
                }
                for(long i:bwd)
                {
                    System.out.println("bwd is "+i);
                }
                for(long i:mid)
                {
                    System.out.println("Earlier "+ i);
                }
                for(int i=0;i<N;i++)
                {
                    mid[i]=(sum-arr[i])/mid[i];
                    min=Math.min(min,mid[i]);
                }
                for(long i:mid)
                {
                    System.out.println(i);
                }
                System.out.println(min+1);
            }
            LinkedList<Integer> ll=new LinkedList<>();
        }
    }
}

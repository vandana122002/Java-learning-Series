package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class od {
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
                long sum=0;
                for (int i = 0; i < N; i++) {
                    arr[i] = scan.nextInt();
                    sum+=arr[i];
                }
                long[] fwd = new long[N];
                long[] bwd = new long[N];
                long[] mid = new long[N];
                fwd[0] = 0;
                fwd[1] = arr[0];
                for (int i = 2; i < N; i++) {
                    fwd[i] = gcd(fwd[i - 1], arr[i - 1]);
                }
                bwd[N - 1] = 0;
                bwd[N - 2] = arr[N - 1];
                for (int i = N - 3; i >= 0; i--) {
                    bwd[i] = gcd(bwd[i + 1], arr[i + 1]);
                }
                mid[0]=bwd[0];
                mid[N-1]=fwd[N-1];
                for(int i=1;i<N-1;i++)
                {
                    mid[i]=gcd(fwd[i],bwd[i]);
                }
                long min=Integer.MAX_VALUE;
                for(int i=0;i<N;i++)
                {
                    mid[i]=(sum-arr[i])/mid[i];
                    min=Math.min(min,mid[i]);
                }
                System.out.println(min+1);
            }

        }
    }
}

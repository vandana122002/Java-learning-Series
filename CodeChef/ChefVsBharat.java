package CodeChef;

import java.util.Scanner;

public class ChefVsBharat {
    static long power(long val,long p)
    {
        long mod = 1000000007;
        long res = 1;
        while(p!=0) {
        if(p% 2 == 0) {
            val = ((val % mod) * (val % mod)) % mod;
            p = p/2;
        }
        else {
            res = ((res % mod) * (val % mod)) % mod;
            p = p - 1;
        }
    }
        return res;
    }
    static long chefora(long a)
    {
        if(a<10)
        {
            return a;
        }else
        {
            long value=a;
            a=a/10;
            while(a!=0)
            {
                value=value*10+(a%10);
                a=a/10;
            }
            return value;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        long[] arr=new long[100001];
        long[] sum=new long[100001];
        for(int i=1;i<100001;i++)
        {
            arr[i]=chefora(i);
            sum[i]=sum[i-1]+arr[i];
        }
        long Q=scan.nextLong();
        while(Q-->0)
        {
            int L=scan.nextInt();
            int R= scan.nextInt();
            System.out.println(power(arr[L],sum[R]-sum[L]));
        }
    }
}

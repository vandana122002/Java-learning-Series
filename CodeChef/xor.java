package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class xor {
    static int power(int n,int n1)
    {
        int M=1000000007;
        if(n1==0)
        {
            return 1;

        }else if(n1%2!=0)
        {
            return n*power(n,n1-1)%M;
        }
        else
        {
            System.out.println((n*n)%M+" "+n1/2);
            return power((n*n)%M,n1/2);
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(b.readLine());
        while(T-->0) {
            int n=3;
            int n1=Integer.parseInt(b.readLine());
            System.out.println(power(n,n1-1));

        }
    }
}

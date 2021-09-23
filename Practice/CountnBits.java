package Practice;

import java.util.Scanner;

public class CountnBits
{

    public static int highest(int n)
    {
        int i=0;
        while((1<<i)<=n)
        {
            i++;
        }
        return i-1;
    }
    public static int countSetBits(int n){

        // Your code here
        if(n==0)
        {
            return 0;
        }
        int x=highest(n);

        int bx=(1<<(x-1))*x;
        int hax=n-(1<<x)+1;
        int res=n-(1<<x);
        int ans=bx+hax+countSetBits(res);
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(countSetBits(n));
    }
}

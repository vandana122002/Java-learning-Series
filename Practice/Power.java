package Practice;

import java.util.Scanner;
public class Power {
static int step=0;
    static int power(int n,int n1)
    {
        int M=1000000007;
        step++;
        if(n1==0)
        {
            return 1;

        }else if(n1%2!=0)
        {
            return (n*power(n,n1-1))%M;
        }
        else
        {
            return power(n*n%M,n1/2);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int n1=scan.nextInt();
        System.out.println(power(n,n1));
        System.out.println("steps taken is "+step);
    }
}

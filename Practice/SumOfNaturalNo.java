package Practice;

import java.util.Scanner;

public class SumOfNaturalNo {
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }else
        {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(sum(n));
    }
}

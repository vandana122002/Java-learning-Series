package CodeChef;

import java.util.Scanner;

public class FoodChain {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            long a= scan.nextLong();
            long b= scan.nextLong();
            int count=1;
            a=(long)Math.floor(a/b);
            while(a!=0)
            {
                count++;
                a=(long)Math.floor(a/b);
            }
            System.out.println(count);
        }
    }
}

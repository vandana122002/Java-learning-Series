package CodeChef;

import java.util.Scanner;

public class chocolate_monger {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int n=scan.nextInt();
            int x=scan.nextInt();
            long[] chocolate=new long[n];
            for(int i=0;i<n;i++)
            {
                chocolate[i]=scan.nextLong();
            }
            long count=1;
            long BrotherCount=0;
            for(int i=0;i<n-1;i++)
            {
                if(chocolate[i]!=chocolate[i+1])
                {
                    count++;
                }else
                {
                    BrotherCount++;
                }
            }
            if(BrotherCount>=x)
            {
                System.out.println(count);
            }else
            {
                count=count-(x-BrotherCount);
                System.out.println(count);
            }
        }
    }
}

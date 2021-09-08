package CodeChef;

import java.util.Scanner;

public class Bode_Builder {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int n=scan.nextInt();
            int R=scan.nextInt();
            int[] time=new int[n];
            long[] tension=new long[n];
            for(int i=0;i<n;i++)
            {
                time[i]= scan.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                tension[i]= scan.nextLong();
            }
            long produced=tension[0];
            long max=tension[0];
            for(int i=1;i<n;i++)
            {
                if((produced-((time[i]-time[i-1])*R))<0)
                {
                    produced=0;
                }else
                {
                    produced=produced-((time[i]-time[i-1])*R);
                }
                produced=produced+tension[i];
                if(produced>max)
                {
                    max=produced;
                }
            }
            System.out.println(max);
        }
    }
}

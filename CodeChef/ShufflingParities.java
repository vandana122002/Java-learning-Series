package CodeChef;

import java.util.Scanner;

public class ShufflingParities {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0)
        {
           int N= scan.nextInt();
           long[] A=new long[N];
            for(int i=0;i<N;i++)
            {
                A[i]= scan.nextLong();
            }
           int es,os;
           if(N%2==0)
           {
               es=N/2;
               os=N/2;
           }else
           {
               es=N/2;
               os=N/2+1;
           }

           int ce=0,co=0;
           for(long i:A)
           {
               if(i%2==0)
               {
                   ce++;
               }else
               {
                   co++;
               }
           }

           int sum=0;
           if(co<=es)
           {
              sum+=co;
           }else
           {
               sum+=Math.min(co,es);
           }
           if(ce<=os)
           {
              sum+=ce;
           }else
           {
               sum+=Math.min(ce,os);
           }

            System.out.println(sum);
        }
    }
}

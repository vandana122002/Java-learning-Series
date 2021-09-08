package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortestRoute {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        long  T=Long.parseLong(b.readLine());
        while(T-->0)
        {
            String[] arr=b.readLine().trim().split(" ");
            int N=Integer.parseInt(arr[0]);
            int M=Integer.parseInt(arr[1]);
            String[] train=b.readLine().trim().split(" ");
            String[] passenger=b.readLine().trim().split(" ");
            long[] a=new long[N];
            long value=Integer.MAX_VALUE;
            long ot=-1;
            for(int i=0;i<N;i++)
            {
                if(Long.parseLong(train[i])==1||Long.parseLong(train[i])==2)
                {
                    a[i]=0;
                }else
                {
                    a[i]=value;
                }
            }
            for(int i=0;i<N;i++)
            {
                if(Long.parseLong(train[i])==1)
                {
                    ot=i;
                }
                if(ot==-1)
                {
                    a[i]=Math.min(value,ot);
                }else
                {
                    a[i]=Math.min(value,(i-ot));
                }
            }

            ot=-1;
            for(int i=N-1;i>=0;i--)
            {
                if(Long.parseLong(train[i])==2)
                {
                    ot=i;
                }
                if(ot==-1)
                {
                    a[i]=Math.max(a[i],ot);
                }else
                {
                    if(a[i]==-1)
                    {
                        a[i]=Math.max(a[i],(ot-i));
                    }else{
                        a[i]=Math.min(a[i],(ot-i));}
                }
            }

            for(int i=0;i<M;i ++)
            {
                System.out.print(a[Integer.parseInt(passenger[i])-1]+" ");
            }
            System.out.println();
        }
    }
}

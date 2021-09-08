package CodeChef;
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Modularity {
    public static void main(String[] args) throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(read.readLine());
        while(T-->0)
        {
            String[] a=read.readLine().trim().split(" ");
            long N=Long.parseLong(a[0]);
            long M=Long.parseLong(a[1]);
//            long count=0;
//            for(int i=2;i<=N;i++)
//            {
//                long ans=M-(M%i);
//                for(long j=1;j<i;j++)
//                {
//                    if(ans%j==0)
//                    {
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);
            Set<Long> arr=new HashSet<>();
            long count=N-1;
            for(long i=2;i<=N;i++)
            {
                if(M%i==0)
                {
                    arr.add(i);
                }
            }
            long ans=arr.size();
            long fact=0;
            for(long i=1;i<ans;i++)
            {
                fact=fact+i;
            }
            ans=count+fact;
            System.out.println(String.valueOf(ans));
        }
    }
}
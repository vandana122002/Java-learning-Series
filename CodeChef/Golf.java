package CodeChef;

import java.io.*;

public class Golf {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(b.readLine());
        while(T-->0) {
            String[] a=b.readLine().trim().split(" ");
            long N=Long.parseLong(a[0]);
            long x=Long.parseLong(a[1]);
            long k=Long.parseLong(a[2]);
            if(x%k==0&&k<=x+1)
            {
                System.out.println("YES");
            }else if(((N+1)-x)%k==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}

package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marathon {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(b.readLine());
        while(T-->0) {
            String[] s=b.readLine().trim().split(" ");
            int D=Integer.parseInt(s[0]);
            int d=Integer.parseInt(s[1]);
            int A=Integer.parseInt(s[2]);
            int B=Integer.parseInt(s[3]);
            int C=Integer.parseInt(s[4]);

            int result=d*D;
            if(result>=42)
            {
                System.out.println(C);
            }else if(result>=21)
            {
                System.out.println(B);
            }else if(result>=10)
            {
                System.out.println(A);
            }else
            {
                System.out.println("0");
            }
        }
    }
}

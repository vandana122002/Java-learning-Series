package Practice;

import java.io.*;
import java.util.*;

public class position{
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan=new Scanner(System.in);
            long num=scan.nextInt();
            long pos=scan.nextInt();
            //Your Solve
            long ans=0;
            long count=0;
            for(long i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
                if(count==pos)
                {
                    ans=i;
                    break;
                }
            }
            if(count==pos)
            {
                System.out.println(ans); }
            else{
                System.out.println("-1");
            }

        } catch (Exception e) {
            return;
        }
    }

}


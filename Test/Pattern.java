package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.valueOf(b.readLine());
        int value=(k/2)+1,count=0;
        for(int i=0;i<value;i++)
        {
            for(int j=0;j<k;j++)
            {
                count++;
                System.out.print(count+" ");
            }
            count+=6;
            System.out.println();
        }

    }
}

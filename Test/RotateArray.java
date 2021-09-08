package Test;

import java.io.*;
import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String[] val=b.readLine().trim().split(" ");
        int k=Integer.valueOf(b.readLine());
        k=k%val.length;
        int[] arr=new int[val.length];
        int count=val.length-k;
        for(int i=0;i<k;i++)
        {
            arr[i]=Integer.valueOf(val[count]);
            count++;
        }
        count=k;
        for(int i=0;i<val.length-k;i++)
        {
            arr[count]=Integer.valueOf(val[i]);
            count++;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
}

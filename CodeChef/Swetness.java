package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Swetness {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.valueOf(b.readLine());
        while(T-->0)
        {
            String[] val=b.readLine().trim().split(" ");
            int N=Integer.valueOf(val[0]);
            long D=Long.valueOf(val[1]);
            String[] s=b.readLine().trim().split(" ");
            String[] s1=b.readLine().trim().split(" ");
           HashMap<Long,Long> h=new HashMap<>();
            for(int i=0;i<N;i++)
            {
               h.put(Long.valueOf(s[i]),Long.valueOf(s1[i]));
            }
            ArrayList<Long> a=new ArrayList<>();
            for(long i :h.keySet())
            {
                a.add(i);
            }
            Collections.sort(a);
            long swetness=0;
            long max_swetness=0;
            int i=0,j=N-1;
           while(i<j)
           {
               if(a.get(i)+a.get(j)>D)
               {
                   j--;
               }else if(a.get(i)+a.get(j)<D)
               {
                   i++;
               }else
               {
                   swetness=h.get(a.get(i))+h.get(a.get(j));
                   max_swetness=Math.max(swetness,max_swetness);
               }
           }
            System.out.println(max_swetness);
        }
    }
}

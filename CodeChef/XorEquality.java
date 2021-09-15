package CodeChef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class XorEquality {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while (t-->0)
        {
            long n= scan.nextInt();
            long X=scan.nextLong();
            ArrayList<Long> s=new ArrayList<>();
            HashMap<Long,Long> h=new HashMap<>();
            HashMap<Long,Long> count=new HashMap<>();
//            for(int i=0;i<n;i++)
//            {
//                s.add(scan.nextLong());
//                h.put(s.get(i),0l);
//                if(!count.containsKey(s.get(i))) {
//                    count.put(s.get(i), 1l);
//                }
//                else {
//                    count.put(s.get(i), count.get(s.get(i)) + 1);
//                }
//
//            }
//            for(long i:s)
//            {
//                long val=i^X;
//                if(h.containsKey(val))
//                {
//                    h.put(val,h.get(val)+1);
//                }
//            }


//
//            for(long i:count.keySet())
//            {
//                count.put(i,count.get(i)+h.get(i));
//            }
//
//            long maxV=-1,first=-1,sec=-1;
//            for(long i:count.keySet())
//            {
//                if(maxV<=count.get(i))
//                {
//                    maxV=count.get(i);
//                    if(first==-1)
//                    {
//                        first=i;
//                    }else
//                    {
//                        sec=i;
//                    }
//                }
//            }
//
//
//            System.out.println(h);
//            System.out.println(count);
//            System.out.println(first+" "+sec);
//
//            if(sec==-1)
//            {
//                System.out.println(maxV+" "+h.get(first));
//            }else if(X==0)
//            {
//                System.out.println(maxV+" "+"0");
//            }
//            else
//            {
//                System.out.println(maxV+" "+Math.min(h.get(first), h.get(sec)));
//            }
//            System.out.println(h.get(first)+" "+h.get(sec));
//            System.out.println(h);
//            System.out.println(count);




            for(int i=0;i<n;i++)
            {
                s.add(scan.nextLong());
                    if(h.getOrDefault(s.get(i),0l)==0l)
                    {
                        h.put(s.get(i),1l);
                    }else
                    {
                        h.put(s.get(i),h.get(s.get(i))+1);
                    }
            }

            for(int i=0;i<n;i++)
            {
                if(count.getOrDefault((s.get(i)^X),0l)==0)
                {
                    count.put((s.get(i)^X),1l);
                }else
                {
                    count.put((s.get(i)^X),count.get((s.get(i)^X))+1);
                }
            }


            long max = 0l, min =100000008;

            for(int i = 0; i < n; i++){
                if(X == 0 && h.get(s.get(i)) >= max){
                    max = h.get(s.get(i));
                    min = 0;
                }else if(h.get(s.get(i)) + count.getOrDefault(s.get(i),0l)>= max && min > count.getOrDefault(s.get(i),0l)){
                    max = h.get(s.get(i)) + count.getOrDefault(s.get(i),0l);
                    min = count.getOrDefault(s.get(i),0l);
                }
            }
            System.out.println(max+" "+min);
        }
    }
}

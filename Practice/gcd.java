package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class gcd {
    static int hcf(int n1,int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
    public static void main(String[] args)
    {
        int[] Arr={20,10,15,60};
        Set<Integer> s=new HashSet<>();
        ArrayList<Integer> a=new ArrayList<>();
        int[] ass=new int[2];
        for(int i:Arr)
        {
            a.add(i);
        }
        while(a.size()>=3)
        {
            int gcd=hcf(a.get(0),a.get(1));
            int ans=(a.get(0)*a.get(1))/gcd;
            a.add(0,ans);
              a.remove(1);
             a.remove(1);
        }
        int gcd=hcf(a.get(0),a.get(1));
        int ans=(a.get(0)*a.get(1))/gcd;
        a.add(0,ans);

        int LCM=a.get(0);
        for(int i=2;i<Math.sqrt(a.get(0))&&LCM!=1;i++)
        {
                   while(LCM%i==0) {
                    s.add(i);
                    LCM = LCM / i;
                }
        }
        int[] arr=new int[s.size()];
        int h=0;
        for(int i:s)
        {
           arr[h]=i;
           h++;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}

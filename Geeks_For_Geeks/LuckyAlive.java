package Geeks_For_Geeks;

import java.util.ArrayList;
import java.util.LinkedList;

public class LuckyAlive {
    public static void main(String[] args)
    {
        int N=5;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=N;i++)
        {
            a.add(i);
        }
        int sword=0;
        while(a.size()!=1)
        {
            int val=++sword;
            if(val>=a.size())
            {
                System.out.println(val+" "+a.size());
                val=val%a.size();
                System.out.println(val+" "+a.size()+a.get(val));
            }
            System.out.println(val+" "+a.size()+a.get(val));
            a.remove(val);
        }
        System.out.println(a.get(0));
    }
}

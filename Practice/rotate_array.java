package Practice;

import java.net.Inet4Address;
import java.util.ArrayList;

public class rotate_array {
    public static void main(String[] args)
    {
        ArrayList<Integer> a=new ArrayList<>();
        int k=3;
        a.add(1); a.add(2); a.add(3); a.add(4); a.add(5); a.add(6); a.add(7);
        int i=a.size()-1;

        while(k-->0)
        {
            int val=a.remove(i);
            a.add(0,val);
        }
        for(int x:a)
        {
            System.out.print(x+" ");
        }
    }
}

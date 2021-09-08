package Practice;

import java.util.Scanner;

public class smallestAndLargest {
    static String smallest(String s,String ans,int k)
    {
        if(s.length()<k)
        {
            return ans;
        }
        if(s.length()==k)
        {
            return s.compareTo(ans)>0?ans:s;
        }
        if(s.substring(0,k).compareTo(ans)>0)
            return smallest(s.substring(1),ans,k);
        else
            return smallest(s.substring(1),s.substring(0,k),k);
    }

    static String largest(String s,String ans,int k)
    {
        if(s.length()<k)
        {
            return ans;
        }
        if(s.length()==k)
        {
            return s.compareTo(ans)>0?s:ans;
        }
        if(s.substring(0,k).compareTo(ans)>0)
            return largest(s.substring(1),s.substring(0,k),k);
        else
            return largest(s.substring(1),ans,k);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int k= scan.nextInt();

        System.out.println(smallest(s.substring(1),s.substring(0,k),k));
        System.out.println(largest(s.substring(1),s.substring(0,k),k));
    }
}

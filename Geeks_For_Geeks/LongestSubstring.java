package Geeks_For_Geeks;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {

    static int longestCount(String s)
    {
        HashMap<Character,Integer> h=new HashMap<>();
        int ahead=-1;
        int reverse=-1;
        int ans=Integer.MIN_VALUE;

        while(true)
        {
            boolean f1=false;
            boolean f2=false;
            while(ahead<s.length()-1)
            {
                f1=true;
                ahead++;
                char ch=s.charAt(ahead);
                h.put(ch,h.getOrDefault(ch,0)+1);
                if(h.get(ch)==2)
                {
                    break;
                }else
                {
                    ans=Math.max(ans,ahead-reverse);
                }
            }

            while(reverse<ahead)
            {

                f2=true;
                reverse++;
                char ch=s.charAt(reverse);
                h.put(ch,h.get(ch)-1);
                if(h.get(ch)==1)
                {
                    break;
                }
            }
            if(f1 ==false &&f2 ==false )
            {
                break;
            }

        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();


        System.out.println(longestCount(s));
    }
}

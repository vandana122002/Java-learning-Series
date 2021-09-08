package Practice;

import java.util.Scanner;

public class LargestCommonSubstring {
    static int maxLength(String a,String b,String c,int ans)
    {
        if(c.contains(a))
        {
            ans=Math.max(ans,a.length());
        }
        if(b.length()==0)
        {
            return ans;
        }
        return maxLength(a+b.charAt(0),b.substring(1),c,ans);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2= scan.nextLine();
        int ans=0;
        for(int i=0;i<s1.length();i++)
        {
            ans=Math.max(ans,maxLength(s1.substring(i,i+1),s1.substring(i+1),s2,ans));
        }
        System.out.println(ans);
    }
}

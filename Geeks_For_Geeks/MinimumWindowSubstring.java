package Geeks_For_Geeks;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args)
    {
        String S="timetopractice";
        String P="toc";
        HashMap<Character,Integer> h=new HashMap<>();
        HashMap<Character,Integer> ans=new HashMap<>();
        for(int i=0;i<P.length();i++)
        {
            if(h.getOrDefault(P.charAt(i),0)==0)
            {
                h.put(P.charAt(i),1);
            }else
            {
                h.put(P.charAt(i),h.get(S.charAt(i))+1);
            }
        }

        int matchCount=0,release=0;
        String ansString="";
        for(int i=0;i<S.length();i++)
        {
            if(h.get(S.charAt(i))==null)
            {
                continue;
            }else
            {
                if(ans.getOrDefault(S.charAt(i),0)==0)
                {
                    ans.put(S.charAt(i),1);
                    matchCount++;
                }else if(ans.get(S.charAt(i))<h.get(S.charAt(i)))
                {
                    ans.put(S.charAt(i), ans.get(S.charAt(i))+1);
                    matchCount++;
                }else
                {
                    ans.put(S.charAt(i), ans.get(S.charAt(i))+1);
                }
            }
            while(matchCount==P.length())
            {
                if(ans.get(S.charAt(release))==null)
                {
                    release++;
                }else if(ans.get(S.charAt(release))>h.get(S.charAt(release)))
                {
                    release++;
                }else if(ans.get(S.charAt(release))==h.get(S.charAt(release)))
                {
                    matchCount--;
                }
                ansString=S.substring(release,i+1);
            }
        }
    }
}

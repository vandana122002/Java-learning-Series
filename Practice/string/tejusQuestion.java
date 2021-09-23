package Practice.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class prio implements Comparable<prio>
{

    String word;
    HashMap<Character,Integer> a=new HashMap<>();
    prio(String word,HashMap<Character,Integer> a)
    {
        this.word=word;
        this.a=a;
    }

    @Override
    public int compareTo(prio o) {
        int i=0,j=0;
        while(i<this.word.length()&&j<o.word.length())
        {
            System.out.println("check "+this.word+" "+o.word);
            if(a.get(this.word.charAt(i))>a.get(o.word.charAt(j)))
            {
                return -1;
            }else if(a.get(this.word.charAt(i))<a.get(o.word.charAt(j)))
            {
                return 1;
            }else
            {
                i++;
                j++;
            }
        }
        return 1;
    }
}
public class tejusQuestion {
    public static void main(String[] args )throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T=Integer.parseInt(br.readLine());

while(T-->0) {

    String val=br.readLine();
    int M=Integer.parseInt(br.readLine());

    String[] val1=new String[M];
    for(int i=0;i<M;i++)
    {
        val1[i]=br.readLine();
    }

    HashMap<Character,Integer> h=new HashMap<>();

    for(int i=0;i<26;i++)
    {
        h.put(val.charAt(i),i);
    }
    HashMap<Character,ArrayList<String>> ans=new HashMap<>();
    ArrayList<prio> a=new ArrayList<>();


    for (int i = 0; i < val1.length; i++) {
            char c=val1[i].charAt(0);
            if(ans.getOrDefault(val1[i].charAt(0),null)==null)
            {
                ArrayList<String> check=new ArrayList<>();
                check.add(val1[i]);
                ans.put(c,check);
            }else
            {
                ArrayList<String> check2;
                check2=ans.get(val1[i].charAt(0));
                check2.add(val1[i]);
                ans.put(val1[i].charAt(0),check2);
            }
    }

//    System.out.println(ans);
for(int i=0;i<val.length();i++)
{
    ArrayList<String> cc=ans.get(val.charAt(i));
    if (cc==null)
    {
        continue;
    }
    for(String n:cc)
    {
        for (int j = 0; j < n.length(); j++) {

        }
//        System.out.println("sum is "+sum);
        a.add(new prio(n, h));
    }

    Collections.sort(a);
    for (prio n : a) {
        System.out.println(n.word);
    }
   a.clear();
}



}


    }
}

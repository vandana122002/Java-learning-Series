package Practice;

import java.util.ArrayList;

public class english {
    public static void main(String[] args)
    {
        String val="ThisIsAnAutomationEra";
        String ans="";
        ArrayList<Integer> a=new ArrayList<>();

        int count=0;
        for(int i=0;i<val.length();i++)
        {
            if(val.charAt(i)>=65&&val.charAt(i)<=90)
            {
                a.add(i);
            }
        }

        for(int i=0;i<a.size()-1;i++)
        {
            if(i==0)
            {
                ans+=Character.toLowerCase(val.charAt(a.get(i)))+val.substring(a.get(i)+1,a.get(i+1));
            }else
            {
                ans+=" "+Character.toLowerCase(val.charAt(a.get(i)))+val.substring(a.get(i)+1,a.get(i+1));
            }
        }
        ans+=" "+Character.toLowerCase(val.charAt(a.get(a.size()-1)))+val.substring(a.get(a.size()-1)+1);
        System.out.println(ans);
    }
}

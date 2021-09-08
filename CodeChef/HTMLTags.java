package CodeChef;


import java.io.*;


public class HTMLTags {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.valueOf(b.readLine());
        while(T-->0)
        {
            String s=b.readLine();
            String ans="Success";
            if(s.length()<3)
            {
                ans="Error";
            }else if(s.charAt(0)!='<'||s.charAt(1)!='/'||s.charAt(s.length()-1)!='>')
            {
                ans="Error";
            }else
            {
                for(int i=2;i<s.length()-1;i++)
                {
                    if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='1'&&s.charAt(i)<='9')))
                    {
                        ans="Error";
                    }
                }
            }
            System.out.println(ans);
        }
    }
}


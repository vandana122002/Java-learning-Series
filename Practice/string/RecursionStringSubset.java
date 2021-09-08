package Practice.string;

public class RecursionStringSubset {
    static void subset(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return ;
        }
        char ch=s.charAt(0);
        String res=s.substring(1);
        subset(res,ans);
        subset(res,ans+ch);
    }
    public static void main(String[] args)
    {
        String s="abcd";
        subset(s,"");
    }
}

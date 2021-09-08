package Practice;


import java.util.Scanner;

public class subsequence {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();
        getSubsequence(s,"");
    }

    static void getSubsequence(String s,String ss)
    {
        if(s.length()==0)
        {
            return;
        }

        char ch=s.charAt(0);
        getSubsequence(s.substring(1),ss+ch);
        getSubsequence(s.substring(1),ss);

    }
}

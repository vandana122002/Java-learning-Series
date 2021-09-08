package Practice;

import java.util.Scanner;

public class largestWordinSentence {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();
        int j=0,max_length=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                j++;
            }else
            {
                j=0;
            }
            max_length=Math.max(max_length,j);
        }
        System.out.println("Maximum length is "+max_length);
    }
}

package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrangement {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        char[] a=s.toCharArray();
        Arrays.sort(a);
        String maxNo="";
        for(int i=a.length-1;i>=0;i--)
        {
            maxNo=maxNo+a[i];
        }
        System.out.println(maxNo);
    }
}

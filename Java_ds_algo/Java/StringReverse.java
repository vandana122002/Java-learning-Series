package Java_ds_algo.Java;

import java.util.Scanner;

public class StringReverse {
    static void reverse(String s,int i)
    {
        if(i==-1)
        {
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s,i-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        reverse(s,s.length()-1);
    }
}

package Java_ds_algo.Java;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Permutations {
    static Set<String> set=new HashSet<>();
    static String swap(String s,int l,int r)
    {
        char[] arr=s.toCharArray();
        char temp=arr[r];
        arr[r]=arr[l];
        arr[l]=temp;
        return String.valueOf(arr);
    }
    static void interChange(String s,int k)
    {
        for(int i=0;i<s.length();i++)
        {
            String value=swap(s,i,k);
            System.out.println(value);
//            set.add(value);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        for(int i=0;i<s.length();i++)
        {
            interChange(s,i);
        }
//        for(String i:set)
//        {
//            System.out.println(i);
//        }
    }
}

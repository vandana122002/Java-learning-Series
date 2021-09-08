package Geeks_For_Geeks;

import java.util.Scanner;

public class String_reverse {
    static String reverseWords(String S) {
        // code here
//        int i=S.length()-1;
//        int j=S.length();
        String reverse="";
//        for(int a=S.length()-1;a>=0;a--)
//        {
//            if(S.charAt(a)=='.')
//            {
//                reverse=reverse+S.substring(j,i+1);
//                i=j-2;
//                j=j-2;
//            }else
//            {
//                if(i<0||j<0)
//                {
//                    break;
//                }
//                j--;
//            }
//        }
//        int count=0;
//        for(int a=0;a<S.length();a++)
//        {
//            if(S.charAt(a)=='.')
//            {
//                break;
//            }else
//            {
//                count++;
//            }
//        }
//        reverse=reverse+"."+S.substring(0,count);
//        return reverse;
        S=S.replace(".","-");
        String[] arr=S.split("-");
        for(int a=arr.length-1;a>=0;a--)
        {
            reverse=reverse+arr[a]+".";
        }
        return reverse.substring(0,S.length());
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(reverseWords(str));
    }

}

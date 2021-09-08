package Geeks_For_Geeks;

import java.util.Scanner;

public class RearrangeCharacters {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int[] arr=new int[26];
        char[] ans=new char[s.length()];
        String result="";
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int maxCount=0;
        char c='a';
//        for(int i:arr)
//        {
//            System.out.println(i);
//        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]>maxCount)
            {
                maxCount=arr[i];
                c=(char)(97+i);
            }
        }
        if(maxCount>(s.length()+1)/2)
        {
            System.out.println("");
        }else
        {
            int index=0;
            while(maxCount>0)
            {
                ans[index]=c;
                maxCount--;
                index+=2;
            }
            arr[c-97]=0;
//            for(char i:ans)
//            {
//                System.out.println(" ans is "+i);
//            }
            for(int i=0;i<26;i++)
            {
                while(arr[i]>0)
                {
                    index=index>=s.length()?1:index;
                    ans[index]=(char)(i+97);
                    System.out.println(ans[index]);
                    index+=2;
                    arr[i]--;
                }
            }

        }
        for(char i:ans)
        {
            result+=i;
        }
        System.out.println(result);
    }
}

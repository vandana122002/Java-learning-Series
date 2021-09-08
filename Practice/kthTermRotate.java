package Practice;

import java.util.Scanner;

public class kthTermRotate {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        long n=scn.nextLong();
        long k=scn.nextLong();
        String s=String.valueOf(n);
        long val=-1;
        k=k%s.length();
//        if(Math.abs(k)>s.length()){
//            val=Math.abs(k)%s.length();
//        }

        if(k>0)
        {
//            if(val!=-1){
//            k=val;}
            s=s.substring(s.length()-(int)k)+s.substring(0,s.length()-(int)k);
        }else
        {
//            if(val!=-1){
//                k=val;
//            }else{
            k=Math.abs(k);
            s=s.substring((int)k)+s.substring(0,(int)k);
        }
        System.out.println(s);
    }
}


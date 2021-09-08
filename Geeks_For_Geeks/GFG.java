package Geeks_For_Geeks;

import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static int ans(int first,int second,int third,int n)
    {
        System.out.println(n);
        if(n==3)
        {
            return third;
        }
        return ans(second,third,first+second+third,n-1);
    }

    public static void main (String[] args) {
        //code
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int n=scan.nextInt();
            int first=1,second=2,third=3;
            System.out.println(ans(first,second,third,n));
        }
    }
}
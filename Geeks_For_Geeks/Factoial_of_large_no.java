package Geeks_For_Geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Factoial_of_large_no {

    public static void multiply(ArrayList<Integer> a,int n)
    {
        int carry=0;
        for(int i=0;i<a.size();i++)
        {
            int data=a.get(i)*n+carry;
            a.set(i,data%10);
            carry=data/10;
        }
        while (carry!=0)
        {
            a.add(carry%10);
            carry=carry/10;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        for(int i=2;i<=s;i++)
        {
            multiply(a,i);
        }

        for(int i=a.size()-1;i>=0;i--)
        {
            System.out.print(a.get(i));
        }
    }
}

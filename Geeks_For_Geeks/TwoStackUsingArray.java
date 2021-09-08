package Geeks_For_Geeks;

import java.util.Scanner;

public class TwoStackUsingArray {
    static int[] arr=new int[101];
    static int top1=-1;
    static int top2=101;

    static void push1(int a)
    {
        top1++;
        arr[top1]=a;
    }
    static void push2(int a)
    {
        top2--;
        arr[top2]=a;
    }
    static int pop1()
    {
        if(top1==-1)
        {
            return -1;
        }
        int a=arr[top1];
        top1--;
        return a;
    }
    static int pop2()
    {
        if(top2==101)
        {
            return -1;
        }
        int a=arr[top2];
        top2++;
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0) {
            int n = scan.nextInt();
            while (n-- > 0) {
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    if (a == 1 && b == 1) {
                        int no = scan.nextInt();
                        push1(no);
                    } else if (a == 2 && b == 1) {
                        int no = scan.nextInt();
                        push2(no);
                    } else if (a == 2 && b == 2){
                        System.out.print(pop2() + " ");
                    }else
                    {
                        System.out.print(pop1() + " ");
                    }
            }
            System.out.println();
        }
    }
}

package Practice;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Practice.Solution. */
        System.out.println("Enter the length of array");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("Enter the array");
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            array.add(scan.nextInt());
        }
        System.out.println("Enter the no of operations");
        int cases=scan.nextInt();
        for(int i=0;i<cases;i++)
        {
            scan.nextLine();
            System.out.println("Enter the task");
            String task=scan.nextLine();
            if(task.equals("Insert"))
            {
                System.out.println("Enter the Practice.position");
                int pos=scan.nextInt();
                System.out.println("Enter the value");
                int value=scan.nextInt();
                array.add(pos,value);
            }else
            {
                System.out.println("Enter the deleting value");
                int del=scan.nextInt();
                array.remove(del);
            }
        }
    }
}
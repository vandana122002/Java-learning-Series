package Practice;

import java.util.*;
public class random
{
    static void TeamDivider(String[] arr)
    {
                ArrayList<String> first=new ArrayList<String>();
        Random r=new Random();
        for(int i=0;i<arr.length/2;i++)
        {
            int randomNumber=r.nextInt(arr.length);
            if(first.contains(arr[randomNumber])) {
                i--; }else
            {
               first.add(arr[randomNumber]); }
        }
        System.out.println("First team is ");
        for(String i:first) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Second team is ");
        for(String i:arr)
        { if(first.contains(i)) {
                continue;
            }else
            {
                System.out.print(i+" ");
            }
        }

    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of participant");
        int n=scan.nextInt();
        String[] arr=new String[n];
        System.out.println("Enter the participant");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.next();
        }
        TeamDivider(arr);
    }
}
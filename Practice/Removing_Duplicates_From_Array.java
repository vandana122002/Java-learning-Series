package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Removing_Duplicates_From_Array {
    public static void main(String[] args) throws IOException
    {
//        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
//        String[] a=b.readLine().trim().split(" ");
//        Set<Integer> c=new HashSet<>();
//        for(int i=0;i<a.length;i++)
//        {
//            c.add(Integer.parseInt(a[i]));
//        }
//        for(int i:c)
//        {
//            System.out.println(i);
//        }
        Scanner scan=new Scanner(System.in);
        int a=0;
        ArrayList<Integer> b=new ArrayList<>();
        while(a>=0)
        {
            a=scan.nextInt();
            b.add(a);
        }
        scan.close();
        for(int i=b.size()-2;i>=0;i--)
        {
            System.out.print(b.get(i)+" ");
        }
    }
}

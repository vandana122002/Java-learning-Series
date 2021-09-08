package Practice;

import java.util.*;
public class max_and_min {
    public static void main(String[] args)
    {
        Integer[] ar=new Integer[5];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the array");
        for(int i=0;i<5;i++)
        {
            ar[i]=scan.nextInt();
        }
        System.out.println(Collections.max(Arrays.asList(ar)));

    }
}

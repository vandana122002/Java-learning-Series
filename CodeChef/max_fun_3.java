package CodeChef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class max_fun_3 {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();
        while(no>0)
        {
            int first=0,second=1,third=2;
            int len=scan.nextInt();
            int[] arr=new int[len];
            ArrayList<Integer> sol=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                arr[i]=scan.nextInt();
            }
            while(first<len-2)
            {
                while(second<len-1)
                {
                    if(third==len)
                    {
                        second++;
                        third=second+1;
                    }
                    else if(arr[first]==arr[second]&&arr[second]==arr[third])
                    {
                        third++;
                        continue;
                    }else
                    {
                        System.out.println(arr[first]+" "+arr[second]+" "+arr[third]);
                        sol.add(Math.abs(arr[first]-arr[second])+Math.abs(arr[second]-arr[third])+Math.abs(arr[third]-arr[first]));
                        third++;
                    }
                }
                first++;
            }
            if(sol.size()==0)
            {
                System.out.println("0");
            }else{
            System.out.println(Collections.max(sol));}
            no--;
        }
    }
}

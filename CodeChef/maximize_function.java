package CodeChef;

import java.util.*;

public class maximize_function {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();

        while(no>0)
        {
            int first=0,second=1,third=2;
            long len=scan.nextLong();
            ArrayList<Long> arr=new ArrayList<>();
            ArrayList<Long> sol=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                arr.add(scan.nextLong());
            }
            while(first<arr.size()-2)
            {
                while(second<arr.size()-1)
                {
                    if(third!=arr.size()&&arr.get(first)==arr.get(second)&&arr.get(second)==arr.get(third))
                    {
                        sol.add(0L);
                        if (third < arr.size()) {
                            third++;
                        } else {
                            second++;
                            third = second + 1;
                        }
                    }else if(third!=arr.size()){
                        System.out.println(arr.get(first));
                        System.out.println(arr.get(second));
                        System.out.println(arr.get(third));
                        sol.add(Math.abs(arr.get(first) - arr.get(second)) + Math.abs(arr.get(second) - arr.get(third)) + Math.abs(arr.get(third) - arr.get(first)));
                        if (third < arr.size()) {
                            third++;
                        } else {
                            second++;
                            third = second + 1;
                        }
                    }else
                    {
                        second++;
                    }
                }
                first++;
            }
            System.out.println(Collections.max(sol));
            no--;
        }
    }
}

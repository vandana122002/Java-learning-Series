package Practice;

import java.util.*;
public class unique {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> count=new ArrayList<>();
        ArrayList<Integer> sums=new ArrayList<>();
        ArrayList<Integer> remainingSums=new ArrayList<>();
        count.add(1);
        count.add(2);
        count.add(3);
        int n=scan.nextInt();
        int sum;
        while(n-3>0)
        {
            for(int i=0;i<count.size()-1;i++)
            {
                sum=count.get(count.size()-1)+count.get(i);
                sums.add(sum);
            }

            for(int i=0;i<sums.size();i++) {
                if (!(remainingSums.contains(sums.get(i)))) {
                    count.add(sums.get(i));
                    sums.remove(i);
                    break;
                }
            }
             remainingSums.addAll(sums);
            n--;
        }
        for(int i=0;i<count.size();i++)
        {
            System.out.print(count.get(i)+" ");
        }
    }
}

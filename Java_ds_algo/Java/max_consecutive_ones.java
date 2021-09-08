package Java_ds_algo.Java;
import java.util.*;
public class max_consecutive_ones {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] nums=new int[6];
        for(int i=0;i<6;i++)
        {
            nums[i]=scan.nextInt();
        }
        ArrayList<Integer> consecutive=new ArrayList<>();
        int count =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                System.out.println("i is "+i);
                count++;
                System.out.println("cou is "+count);
            }
            else
            {
                consecutive.add(count);
                count=0;
            }
        }

        for(int i=0;i<consecutive.size();i++)
        {
            System.out.println(consecutive.get(i));
        }
        System.out.println(Collections.max(consecutive));
    }
}

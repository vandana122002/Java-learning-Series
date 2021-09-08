package CodeChef;

import java.util.Scanner;

public class Even_max_sum {

        public static void main (String[] args)
        {
            Scanner scan=new Scanner(System.in);
            int T= scan.nextInt();
            while(T-->0) {
                int a = scan.nextInt();
                System.out.println(maxSubArraySum(a));
            }
        }

        static int maxSubArraySum(int a)
        {
            int ans=0;
            int ans_far=0;
            int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

            for (int i = 1; i <=a; i++)
            {

                max_ending_here = max_ending_here + i;
                ans=ans+1;
                if (max_so_far < max_ending_here&&max_ending_here%2==0){
                    max_so_far = max_ending_here;
                    ans_far=ans;
                }
                if (max_ending_here < 0){
                    max_ending_here = 0;
                    ans=0;
                }
            }
            return ans_far;
        }
}

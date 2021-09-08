package CodeChef;

import java.util.Scanner;

public class chef_and_dice {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T>0) {
            long n = scan.nextLong();
            if (n == 1) {
                System.out.println("20");
            } else if (n == 2) {
                System.out.println("36");
            } else if (n == 3) {
                System.out.println("51");
            } else {
                long ans = 0;
                if (n % 4 == 0) {
                    long stack = n / 4;
                    ans = (44 * (stack - 1)) + 60;
                    System.out.println(ans);
                } else {
                    long stack = n / 4;
                    long rem_stack = n % 4;
                    if (stack - 1 > 0) {
                        ans = (stack - 1) * 44;
                    }
                    if (rem_stack == 1) {
                        ans = ans + 76;
                    } else if (rem_stack == 2) {
                        ans = ans + 88;
                    } else if (rem_stack == 3) {
                        ans = ans + 99;
                    }
                    System.out.println(ans);
                }
            }
            T--;
        }
    }
}

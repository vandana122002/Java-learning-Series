package CodeChef;

import java.util.Scanner;

public class specialTriplets {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0) {
            int n = scan.nextInt();
            int f = 0;
            for (int c = 1; c <= n; c++) {
                for (int b = c; b <= n; b = b + c) {
                    for (int a = c; a <= n; a = a + b) {
                        if (a % b == c && b % c == 0) {
                            f++;
                        }
                    }
                }
            }
            System.out.println(f);
        }

    }
}

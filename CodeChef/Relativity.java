package CodeChef;

import java.util.Scanner;

public class Relativity {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0) {
            int g = scan.nextInt();
            int c = scan.nextInt();
            System.out.println((c * c) / (2 * g));
        }
    }
}

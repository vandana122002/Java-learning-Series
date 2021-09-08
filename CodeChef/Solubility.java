package CodeChef;

import java.util.Scanner;

public class Solubility {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0) {
            int X= scan.nextInt();
            int A = scan.nextInt();
            int B = scan.nextInt();
            long ans=A+((100-X)*B);
            System.out.println(ans*10);
        }
    }
}

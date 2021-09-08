package CodeChef;

import java.util.Scanner;

public class Passing_marks {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0)
        {
            int Amin=scan.nextInt();
            int Bmin=scan.nextInt();
            int Cmin=scan.nextInt();
            int Tmin=scan.nextInt();
            int A=scan.nextInt();
            int B= scan.nextInt();
            int C=scan.nextInt();
            if(A>=Amin&&B>=Bmin&&C>=Cmin&&(A+B+C)>=Tmin)
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
            n--;
        }
    }
}

package Geeks_For_Geeks;
import java.util.*;
public class Pythagoras {
    public  static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n==1||n==2)
        {
            System.out.println("-1");
        }else if(n%2==0)
        {
            int var=(n*n)/4;
            System.out.println(var-1+" "+(var+1));
        }else
        {
            int var=n*n+1;
            System.out.println(var/2-1+" "+var/2);
        }
    }
}

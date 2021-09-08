package Geeks_For_Geeks;
import java.util.*;
public class Implement_atoi {
    static int atoi(String str)
    {
        // Your code here
        try
        {
            return Integer.valueOf(str);
        }catch(Exception e)
        {
            return -1;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(atoi(str));
    }
}

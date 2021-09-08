package Practice;

import java.io.*;
import java.util.*;

public class year{
    static boolean yearCheck(String newYear)
    {
        for(int i=0;i<newYear.length()-1;i++)
        {
            for(int j=i+1;j<newYear.length();j++)
            {
                if(newYear.charAt(i)==newYear.charAt(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan=new Scanner(System.in);
            int year=scan.nextInt();
            int ans=0;
            while(ans==0)
            {
                year=year+1;
                String newYear=String.valueOf(year);
                if(yearCheck(newYear))
                {
                    ans=1;
                    System.out.println(year);
                }
            }
        } catch (Exception e) {
            return;
        }
    }

}


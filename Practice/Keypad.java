package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypad {

    static ArrayList<String> pairs(String str)
    {
        String[] arr={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
        if(str.length()==1)
        {
            ArrayList<String> a=new ArrayList<>();
            String s=arr[Integer.parseInt(str)];
            while(s.length()!=0)
            {
                a.add(s.substring(0,1));
                s=s.substring(1);
            }
            return a;
        }
        ArrayList<String> h=pairs(str.substring(1));

        ArrayList<String> mpairs=new ArrayList<>();
        String s=arr[Integer.parseInt(str.substring(0,1))];
        for(int i=0;i<s.length();i++)
        {
            for(String j:h) {
                    mpairs.add(s.charAt(i)+j);
            }
        }

        return mpairs;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        ArrayList<String> a=pairs(s);
        System.out.println(a);
    }
}

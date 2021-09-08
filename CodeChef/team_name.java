package CodeChef;

import java.util.ArrayList;
import java.util.Scanner;

public class team_name {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();
        while(no>0)
        {
            long noOfWords=scan.nextInt();
            ArrayList<String> words=new ArrayList<>();
            long count=0;
            String first,second;
            for(int i=0;i<noOfWords;i++)
            {
                words.add(scan.next());
            }
            for(int i=0;i<noOfWords;i++)
            {
                for(int j=0;j<noOfWords;j++)
                {
                        first=words.get(j).charAt(0)+words.get(i).substring(1,words.get(i).length());
                        second=words.get(i).charAt(0)+words.get(j).substring(1,words.get(j).length());
                        if(words.contains(first)||words.contains(second))
                        {
                            continue;
                        }else
                        {
//                            System.out.println(first+" "+second);
                            count=count+1;
                        }
                }
            }
            System.out.println(count);
            no--;
        }
    }
}

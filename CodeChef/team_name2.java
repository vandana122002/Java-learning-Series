package CodeChef;

import java.util.ArrayList;
import java.util.*;

public class team_name2 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();
        while(no>0) {
            int noOfWords=scan.nextInt();
           ArrayList<String> words=new ArrayList<>();
           ArrayList<String> first_letter=new ArrayList<>();
           ArrayList<String> last_letter=new ArrayList<>();
           ArrayList<String> unique_words=new ArrayList<>();
            for(int i=0;i<noOfWords;i++)
            {
                words.add(scan.next());
            }
           for(int i=0;i<words.size();i++)
           {
               first_letter.add(words.get(i).substring(0,1));
               last_letter.add(words.get(i).substring(1,words.get(i).length()));
           }
           for(int i=0;i<words.size();i++)
           {
               System.out.println(words.contains(first_letter.get(i)+last_letter.get(i)));
               if(!(words.contains(first_letter.get(i)+last_letter.get(i))))
               {
                   System.out.println(first_letter.get(i)+last_letter.get(i));
                   System.out.println(!(unique_words.contains(first_letter.get(i)+last_letter.get(i))));
                   if(!(unique_words.contains(first_letter.get(i)+last_letter.get(i))))
                   {
                       System.out.println("un "+first_letter.get(i)+last_letter.get(i));
                    unique_words.add(first_letter.get(i)+last_letter.get(i));
                   }
               }
           }
            System.out.println(unique_words.size());
           no--;
        }
    }
}

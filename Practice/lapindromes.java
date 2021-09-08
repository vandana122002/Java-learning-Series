package Practice;

import java.util.*;
public class lapindromes {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int test=scan.nextInt();
        scan.nextLine();
        while(test>0)
        {
            int[] al1=new int[26];
            int[] al2=new int[26];
            String word=scan.nextLine();
            String halfFirst;
            String halfSecond;
            String check="true";
            if(word.length()%2==0) {
                int half = word.length() / 2;
                halfFirst = word.substring(0, half);
                halfSecond = word.substring(half);
                for (int i = 0; i < halfFirst.length(); i++) {
                    al1[((int) halfFirst.charAt(i)) - 97]++;
                    al2[((int) halfSecond.charAt(i)) - 97]++;
                }
                for (int i = 0; i < al1.length; i++) {
                    if (al1[i] != al2[i]) {
                        check = "false";
                        break;
                    }
                }
                if (check == "false") {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }else
            {
                int half=word.length()/2;
                halfFirst=word.substring(0,half);
                halfSecond=word.substring(half+1);
                for(int i=0;i<halfFirst.length();i++)
                {
                    al1[((int)halfFirst.charAt(i))-97]++;
                    al2[((int)halfSecond.charAt(i))-97]++;
                }
                for(int i=0;i<al1.length;i++)
                {
                    if(al1[i]!=al2[i])
                    {
                        check="false";
                        break;
                    }
                }
                if(check=="false")
                {
                    System.out.println("NO");
                }else
                {
                    System.out.println("YES");
                }
            }
            test--;
        }
    }
}

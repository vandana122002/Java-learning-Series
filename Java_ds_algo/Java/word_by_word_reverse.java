package Java_ds_algo.Java;
import java.util.*;
public class word_by_word_reverse {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        String reverse="";
        int i=word.length()-1,j=0;
        while(i>=0) {
            while (i>=0&&word.charAt(i) ==' ') i--;
            j = i;
            if (i<0)
                break;
            while (i>=0&&word.charAt(i)!=' ')i--;
            reverse=reverse+word.substring(i+1,j+1)+" ";
        }
        System.out.println(reverse);
    }
}






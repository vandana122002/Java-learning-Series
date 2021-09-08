package Java_ds_algo.Java;
import java.util.*;
public class string_reverse {
 public static void main(String[] args)
 {
     int a,i;
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter a string");
     String word=scan.nextLine();
     String reverse="";
     i=word.length()-1;
     while(i>=0) {
      while (i >= 0 && word.charAt(i) == ' ') i--;
      a=i;
      while (i >= 0 && word.charAt(i) != ' ') i--;
      if(i<0)
      {
        i=0;
       reverse=reverse+" "+word.substring(i,a+1);
       break;
      }
      if(reverse.isEmpty()) {
       reverse = reverse + word.substring(i + 1, a + 1);
      }else
      {
       reverse = reverse + " "+word.substring(i + 1, a + 1);
      }
     }
  System.out.println(reverse);
 }
}

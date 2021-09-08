package CodeChef;
import java.util.*;
public class star_check {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int K;
        String s;
        String star="";
        K=scan.nextInt();
        scan.nextLine();
        s=scan.nextLine();
        boolean check=false;
        for(int i=0;i<K;i++)
        {
            star=star+"*";
        }
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '*' && i + K <= s.length()&&s.substring(i,i+K).equals(star)) {
                    check = true;
                    System.out.println("YES");
                    break;
            }
        }
        if(!check)
        {
            System.out.println("NO");
        }

    }
}

package Practice;

import java.io.*;
import java.util.*;

public class stone{
    public static void main(String[] args) throws IOException {
        try {
              Scanner scan=new Scanner(System.in);
              int n=scan.nextInt();
              scan.nextLine();
              String s=scan.nextLine();
              long count=0;
              for(int i=0;i<s.length()-1;i++)
              {
                  if(s.charAt(i)==s.charAt(i+1))
                  {
                      count++;
                  }
              }
            System.out.println(count);
        } catch (Exception e) {
            return;
        }
    }

}



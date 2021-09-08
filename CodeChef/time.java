package CodeChef;

import java.util.Scanner;

public class time {
    public static void main(String[] args)
    {
        int up=0,down=0,same=0;
        Scanner scan=new Scanner(System.in);
        String check=scan.nextLine();
        String str=scan.nextLine();
        for(int i=0;i<5;i++)
        {
            if(i==2) continue;
            if(check.charAt(5)==str.charAt(5))
            {
                if((int)check.charAt(i)<(int)str.charAt(i))
                {
                    System.out.println("1");
                    up=1;
                    break;
                }else if((int)check.charAt(i)==(int)str.charAt(i))
                {
                    System.out.println("2");
                    continue;
                }else if((int)check.charAt(i)>(int)str.charAt(i))
                {
                    System.out.println("3");
                    down=1;
                    break;
                }
            }
        }
        if(up!=1&&down!=1)
        {
            System.out.println("Both time is same");
        }else
        {
            System.out.println(up +" "+down);
        }
    }
}

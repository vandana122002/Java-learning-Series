package Practice;

import java.io.*;
import java.util.*;

class fairElection
{
    public static void main(String[] args) throws IOException
    {
        try{
              Scanner scan=new Scanner(System.in);
              int n=scan.nextInt();
              while(n>0)
              {
                  int sumJack=0,sumJohn=0;
                  int[] Length=new int[2];
                  for(int i=0;i<2;i++)
                  {
                      Length[i]=scan.nextInt();
                  }
                  int[] johnArr=new int[Length[0]];
                  for(int i=0;i<Length[0];i++)
                  {
                      johnArr[i]=scan.nextInt();
                  }
                  int[] jackArr=new int[Length[1]];
                  for(int i=0;i<Length[1];i++)
                  {
                      jackArr[i]=scan.nextInt();
                  }
                  Arrays.sort(johnArr);
                  Arrays.sort(jackArr);
                  for(int i=0;i<Length[0];i++)
                  {
                      sumJohn=sumJohn+johnArr[i];
                  }
                  for(int i=0;i<Length[1];i++)
                  {
                      sumJack=sumJack+jackArr[i];
                  }
                  int same=0;
                  if(Length[0]==Length[1])
                  {
                      for(int i=0;i<Length[0];i++)
                      {
                          if(jackArr[i]==johnArr[i])
                          {
                              same=1;
                          }else
                          {
                              same=0;
                              break;
                          }
                      }
                  }
                  int j=0,k=jackArr.length-1,count=0;
                  while(sumJohn<=sumJack&&j<johnArr.length&&k>=0)
                  {
                      if(johnArr[j]<jackArr[k])
                      {
                          int temp=johnArr[j];
                          johnArr[j]=jackArr[k];
                          jackArr[k]=temp;
                          sumJohn=(sumJohn-jackArr[k])+johnArr[j];
                          sumJack=(sumJack-johnArr[j])+jackArr[k];
                      }
                      count++;
                      j++;
                      k--;
                  }
                  if(sumJohn<sumJack)
                  {
                      System.out.println("-1");
                  }else if(same==1)
                  {
                      System.out.println("-1");
                  }else{
                  System.out.println(count);}
                  n--;
              }
            //Your Solve
        }catch(Exception e){
            return;
        }
    }
}


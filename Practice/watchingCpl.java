package Practice;

import java.io.*;
import java.util.*;

class watchingCpl {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            while (n > 0) {
                ArrayList<Integer> sums=new ArrayList<>();
                int noOfBoxes = scan.nextInt();
                int Height = scan.nextInt();
                int[] boxHeights = new int[noOfBoxes];
                for (int i = 0; i < noOfBoxes; i++) {
                    boxHeights[i] = scan.nextInt();
                }
                Arrays.sort(boxHeights);
                int sum = 0,remaining;
                for(int i=boxHeights.length-1;i>0;i--)
                {
                    if(sums.size()<2) {
                        sum = sum + boxHeights[i];
//                        System.out.println("sum is "+sum);
                        boxHeights[i] = -1;
                        remaining = Height - sum;
//                        System.out.println("reamining is "+remaining);
                        if (remaining <= 0) {
                            sums.add(sum);
                            boxHeights[i] = -1;
                            sum = 0;
                        } else {
                            int leftBoxes = i - 1;
                            while (leftBoxes >= 0) {
                                if (boxHeights[leftBoxes] > remaining) {
                                    leftBoxes--;
                                    continue;
                                } else {
                                    if(boxHeights[leftBoxes]!=-1) {
                                        sum = sum + boxHeights[leftBoxes];
                                        boxHeights[leftBoxes] = -1;
//                                        System.out.println("sum is "+sum);il  remaining = Height - sum;
//                                        System.out.println("rem is "+remaining);
                                        if (sum == Height) {
                                            boxHeights[leftBoxes] = -1;
                                            sums.add(sum);
                                            sum = 0;
                                            break;
                                        }else
                                        {
                                            leftBoxes--;
                                            continue;
                                        }
                                    }
                                }
                                leftBoxes--;
                            }

                        }
                    }else
                    {
                        break;
                    }
                }
//                for(int i=0;i<boxHeights.length;i++)
//                {
//                    System.out.print("box heights "+boxHeights[i]);
//                }
//                System.out.println();
//                for(int i=0;i<sums.size();i++)
//                {
//                    System.out.print("sums "+sums.get(i));
//                }
                if(sums.size()<2)
                {
                    System.out.println("-1");
                }else{
                    int count=0;
                    for(int i=0;i<boxHeights.length;i++)
                    {
                        if(boxHeights[i]==-1)
                        {
                            count++;
                        }
                    }
                    System.out.println(count);
                }
                n--;
            }
            //Your Solve
        } catch (Exception e) {
            return;
        }
    }

}


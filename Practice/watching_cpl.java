package Practice;

import java.io.*;
import java.util.*;

class watching_cpl {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan = new Scanner(System.in);
            int noOfTimes=scan.nextInt();
            while(noOfTimes>0) {
                ArrayList<Integer> firstPerson = new ArrayList<>();
                ArrayList<Integer> secondPerson = new ArrayList<>();
                ArrayList<Integer> checkPerson = new ArrayList<>();
                int outer = 0, remaining = 0;
                int noOfBoxes = scan.nextInt();
                boolean[] usedBoxes = new boolean[noOfBoxes];
                boolean[] usedBoxesWhileFindingLargest = new boolean[noOfBoxes];
                boolean[] usedsecondBoxes = new boolean[noOfBoxes];
                int Height = scan.nextInt();
                int[] boxHeights = new int[noOfBoxes];
                for (int i = 0; i < noOfBoxes; i++) {
                    boxHeights[i] = scan.nextInt();
                }
                Arrays.sort(boxHeights);
                int largest=0;
                for(int j=boxHeights.length-1;j>=0;j--)
                {
                    if(boxHeights[j]>=Height&&largest<3)
                    {
                        largest++;
                        usedBoxesWhileFindingLargest[j]=true;
                    }
                }
                int sum = 0, i = 0;
                i = noOfBoxes - 1;
                if(largest==0)
                {

                    while (i >= 0) {
                        sum = sum + boxHeights[i];
                        System.out.println("sum is "+sum);
                        remaining = Height - sum;
                        System.out.println("remaining is "+remaining);
                        for (int j = i - 1; j >= 0; j--) {
                            if (boxHeights[j] > remaining) {
                                continue;
                            } else if (boxHeights[j] == remaining) {
                                firstPerson.add(boxHeights[i]);
                                System.out.println("box height1 "+boxHeights[i]);
                                usedBoxes[i] = true;
                                firstPerson.add(boxHeights[j]);
                                usedBoxes[j] = true;
                                System.out.println("box height2 "+boxHeights[j]);
                                sum = 0;
                                remaining = 0;
                                outer = 1;
                                break;
                            } else {
                                sum = sum + boxHeights[j];
                                System.out.println("sum2 is "+sum);
                                firstPerson.add(boxHeights[j]);
                                System.out.println("firstPerson2 is "+boxHeights[j]);
                                usedBoxes[j] = true;
                                remaining = Height - sum;
                            }
                        }
                        if (outer == 1) {
                            System.out.println("hi");
                            break;
                        }
                        for (int a = 0; a < noOfBoxes; a++) {
                            if (usedBoxes[a] == true) {
                                usedBoxes[a] = false;
                            }
                        }
                        firstPerson.clear();
                        sum = 0;
                        remaining = 0;
                        i--;
                    }

                    if (firstPerson.isEmpty()) {
                        for (int j = boxHeights.length - 1; j >= 0; j--) {
                            sum = sum + boxHeights[j];
                            firstPerson.add(boxHeights[j]);
                            usedBoxes[j] = true;
                            if (sum > Height) {
                                break;
                            }
                        }
                    }
                    for (int j:firstPerson)
                    {
                        System.out.println("first person "+j);
                    }
//                //Second Person
                    int secondOrder = 0;
                    sum = 0;
                    while (i >= 0) {
                        if (usedBoxes[i] != true) {
                            sum = sum + boxHeights[i];
                            remaining = Height - sum;
                            for (int j = i - 1; j >= 0; j--) {
                                if (usedBoxes[j] != true) {
                                    if (boxHeights[j] > remaining) {
                                        continue;
                                    } else if (boxHeights[j] == remaining) {
                                        secondPerson.add(boxHeights[i]);
                                        usedsecondBoxes[i] = true;
                                        secondPerson.add(boxHeights[j]);
                                        usedsecondBoxes[j] = true;
                                        sum = 0;
                                        remaining = 0;
                                        secondOrder = 1;
                                        break;
                                    } else {
                                        sum = sum + boxHeights[j];
                                        secondPerson.add(boxHeights[j]);
                                        usedsecondBoxes[j] = true;
                                        remaining = Height - sum;
                                    }
                                }
                            }
                            if (secondOrder == 1) {
                                break;
                            }
                            for (int a = 0; a < noOfBoxes; a++) {
                                if (usedsecondBoxes[a] == true) {
                                    usedsecondBoxes[a] = false;
                                }
                            }
                            secondPerson.clear();
                            sum = 0;
                            remaining = 0;
                        }
                        i--;
                    }

                    if (secondPerson.isEmpty()) {
                        for (int j = boxHeights.length - 1; j >= 0; j--) {
                            if (usedBoxes[j] != true) {
                                sum = sum + boxHeights[j];
                                checkPerson.add(boxHeights[j]);
                                usedsecondBoxes[j] = true;
                                if (sum > Height) {
                                    secondPerson = checkPerson;
                                    break;
                                }
                            }
                        }
                    }

                    if(firstPerson.isEmpty()||secondPerson.isEmpty())
                    {
                        System.out.println("-1");
                    }else
                    {
                        int count=firstPerson.size()+secondPerson.size();
                        System.out.println(count);
                    }
                }else if(largest==1)
                {
                    while (i >= 0) {
                        if(usedBoxesWhileFindingLargest[i]!=true){
                            sum = sum + boxHeights[i];
                            remaining = Height - sum;
                            for (int j = i - 1; j >= 0; j--) {
                                if (boxHeights[j] > remaining) {
                                    continue;
                                } else if (boxHeights[j] == remaining) {
                                    firstPerson.add(boxHeights[i]);
                                    usedBoxes[i] = true;
//                                System.out.println("first "+boxHeights[i]);
                                    firstPerson.add(boxHeights[j]);
                                    usedBoxes[j] = true;
//                                System.out.println("second is "+boxHeights[j]);
                                    sum = 0;
                                    remaining = 0;
                                    outer = 1;
                                    break;
                                } else {
                                    sum = sum + boxHeights[j];
//                                System.out.println("sum in else "+sum);
                                    firstPerson.add(boxHeights[j]);
                                    usedBoxes[j] = true;
                                    remaining = Height - sum;
//                                System.out.println("remaining in else "+remaining);
                                }
                            }
                            if (outer == 1) {
                                break;
                            }
                            for (int a = 0; a < noOfBoxes; a++) {
                                if (usedBoxes[a] == true) {
                                    usedBoxes[a] = false;
                                }
                            }
                            firstPerson.clear();
                            sum = 0;
                            remaining = 0;
                        }
                        i--;
                    }

                    if (firstPerson.isEmpty()) {
                        for (int j = boxHeights.length - 1; j >= 0; j--) {
                            if(usedBoxesWhileFindingLargest[j]!=true)
                            {
                                sum = sum + boxHeights[j];
                                checkPerson.add(boxHeights[j]);
                                usedBoxes[j] = true;
                                if (sum > Height) {
                                    firstPerson=checkPerson;
                                    break;
                                }
                            }
                        }
                    }
                    int largestOne=firstPerson.size()+1;
                    if(largestOne==1)
                    {
                        System.out.println("-1");
                    }else{
                    System.out.println(largestOne);}

                }else
                {
                    System.out.println("2");
                }

                noOfTimes--;
            }
            //Your Solve
        } catch (Exception e) {
            return;
        }
    }

}


package Practice;

import java.io.*;
import java.util.*;

class warching_cpl {
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
                    if(boxHeights[j]>Height&&largest<3)
                    {
                        largest++;
                    }
                }
                int sum = 0, i = 0;
                i = noOfBoxes - 1;
                if(largest==0)
                {

                    while (i >= 0) {
                        sum = sum + boxHeights[i];
//                    System.out.println("sum is "+sum);
                        remaining = Height - sum;
//                    System.out.println("remaining1 is "+remaining);
                        for (int j = i - 1; j >= 0; j--) {
                            if (boxHeights[j] > remaining) {
                                continue;
                            } else if (boxHeights[j] == remaining) {
                                firstPerson.add(boxHeights[i]);
                                usedBoxes[i] = true;
//                            System.out.println("first "+boxHeights[i]);
                                firstPerson.add(boxHeights[j]);
                                usedBoxes[j] = true;
//                            System.out.println("second is "+boxHeights[j]);
                                sum = 0;
                                remaining = 0;
                                outer = 1;
                                break;
                            } else {
                                sum = sum + boxHeights[j];
//                            System.out.println("sum2 is "+sum);
                                firstPerson.add(boxHeights[j]);
                                usedBoxes[j] = true;
//                            System.out.println("third is "+boxHeights[j]);
                                remaining = Height - sum;
//                            System.out.println("remaining2 is "+remaining);
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

//                System.out.println("first person");
//                for (int j = 0; j < firstPerson.size(); j++) {
//                    System.out.print(firstPerson.get(j) + " ");
//                }
//                for (boolean j : usedBoxes) {
//                    System.out.print(j);
//                }
//                //Second Person
                    int secondOrder = 0;
                    sum = 0;
                    while (i >= 0) {
                        if (usedBoxes[i] != true) {
                            sum = sum + boxHeights[i];
//                        System.out.println("sum is "+sum);
                            remaining = Height - sum;
//                        System.out.println("remaining1 is "+remaining);
                            for (int j = i - 1; j >= 0; j--) {
                                if (usedBoxes[j] != true) {
                                    if (boxHeights[j] > remaining) {
                                        continue;
                                    } else if (boxHeights[j] == remaining) {
                                        secondPerson.add(boxHeights[i]);
                                        usedsecondBoxes[i] = true;
//                                System.out.println("first " + boxHeights[i]);
                                        secondPerson.add(boxHeights[j]);
                                        usedsecondBoxes[j] = true;
//                                System.out.println("second is " + boxHeights[j]);
                                        sum = 0;
                                        remaining = 0;
                                        secondOrder = 1;
                                        break;
                                    } else {
                                        sum = sum + boxHeights[j];
//                                System.out.println("sum2 is " + sum);
                                        secondPerson.add(boxHeights[j]);
                                        usedsecondBoxes[j] = true;
//                                System.out.println("third is " + boxHeights[j]);
                                        remaining = Height - sum;
//                                System.out.println("remaining2 is " + remaining);
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
//            System.out.println("second person ");
//            for(int j=0;j<secondPerson.size();j++)
//            {
//                System.out.print(secondPerson.get(j)+" ");
//            }
//            System.out.println("outside sum "+sum);
                    if (secondPerson.isEmpty()) {
                        for (int j = boxHeights.length - 1; j >= 0; j--) {
                            if (usedBoxes[j] != true) {
//                        System.out.println("j is "+boxHeights[j]);
                                sum = sum + boxHeights[j];
//                        System.out.println("sum is "+sum);
                                checkPerson.add(boxHeights[j]);
                                usedsecondBoxes[j] = true;
                                if (sum > Height) {
                                    secondPerson = checkPerson;
                                    break;
                                }
                            }
                        }
                    }

//             System.out.println("remaining is "+remaining);
//                System.out.println("second person");
//                for (int j = 0; j < secondPerson.size(); j++) {
//                    System.out.print(secondPerson.get(j) + " ");
//                }

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
                        sum = sum + boxHeights[i];
//                    System.out.println("sum is "+sum);
                        remaining = Height - sum;
//                    System.out.println("remaining1 is "+remaining);
                        for (int j = i - 1; j >= 0; j--) {
                            if (boxHeights[j] > remaining) {
                                continue;
                            } else if (boxHeights[j] == remaining) {
                                firstPerson.add(boxHeights[i]);
                                usedBoxes[i] = true;
//                            System.out.println("first "+boxHeights[i]);
                                firstPerson.add(boxHeights[j]);
                                usedBoxes[j] = true;
//                            System.out.println("second is "+boxHeights[j]);
                                sum = 0;
                                remaining = 0;
                                outer = 1;
                                break;
                            } else {
                                sum = sum + boxHeights[j];
//                            System.out.println("sum2 is "+sum);
                                firstPerson.add(boxHeights[j]);
                                usedBoxes[j] = true;
//                            System.out.println("third is "+boxHeights[j]);
                                remaining = Height - sum;
//                            System.out.println("remaining2 is "+remaining);
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

//                System.out.println("first person");
//                for (int j = 0; j < firstPerson.size(); j++) {
//                    System.out.print(firstPerson.get(j) + " ");
//                }
//                for (boolean j : usedBoxes) {
//                    System.out.print(j);
//                }
//
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


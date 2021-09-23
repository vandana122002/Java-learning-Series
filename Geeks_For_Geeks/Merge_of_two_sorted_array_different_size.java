package Geeks_For_Geeks;

public class Merge_of_two_sorted_array_different_size {
    public static void main(String[] args)
    {
        int[] array1 = {4};
        int[] array2 = {1,3,4,6,7};
        int sum=array1.length+array2.length;

        int count=0,i=0,j=0;
        double one=0,sec=0;
        if(sum%2==0)
        {
            while(count<=sum/2&&i<array1.length&&j<array2.length)
            {
                if(array1[i]<array2[j])
                {
                    if(count==sum/2)
                    {
                        one=array1[i];
                    }else if(count==(sum/2)-1)
                    {
                        sec=array1[i];
                    }
                    count++;
                    i++;
//                    System.out.println("inner1 "+one +" "+sec+" "+count);
                }else if(array1[i]>array2[j])
                {
                    if(count==sum/2)
                    {
                        one=array2[j];
                    }else if(count==(sum/2)-1)
                    {
                        sec=array2[j];
                    }
                    count++;
                    j++;
//                    System.out.println("inner2 "+one +" "+sec+" "+count);
                }else
                {
//                    System.out.println("count is "+count);
                    if(count==sum/2)
                    {
                        one=array2[j];
                    }else if(count==(sum/2)-1)
                    {
                        sec=array2[j];
                    }

                    count++;
                    if(count==sum/2)
                    {
                        one=array2[j];
                    }else if(count==(sum/2)-1)
                    {
                        sec=array2[j];
                    }
                    i++;
                    j++;
                    count++;
//                    System.out.println("inner3 "+one +" "+sec+" "+count);
                }
            }

            while(count<=(sum/2)&&i<array1.length)
            {
                if(count==sum/2)
                {
                    one=array1[i];
                }else if(count==(sum/2)-1)
                {
                    sec=array1[i];
                }
                i++;
                count++;
//                System.out.println("inner4 "+one +" "+sec+" "+count);
            }
            while(count<=(sum/2)&&j<array2.length)
            {
                if(count==sum/2)
                {
                    one=array2[j];
                }else if(count==(sum/2)-1)
                {
                    sec=array2[j];
                }
                j++;
                count++;
//                System.out.println("inner5 "+one +" "+sec);
            }
//            System.out.println(one+" "+sec);
            System.out.println((one+sec)/2);
        }else
        {
            while(count<=sum/2&&i< array1.length&&j< array2.length)
            {
                if(array1[i]<array2[j])
                {
                    if(count==sum/2)
                    {
                        one=array1[i];
                    }
                    i++;
                    count++;
                }else if(array1[i]>array2[j])
                {
                    if(count==sum/2)
                    {
                        one=array2[j];
                    }
                    j++;
                    count++;
                }else
                {
                    if(count==sum/2)
                    {
                        one=array2[j];
                    }
                    count++;

                    if(count==sum/2)
                    {
                        one=array2[j];
                    }
                    i++;
                    j++;
                    count++;
                }
            }

            while(count<=sum/2&&i< array1.length)
            {
                if(count==sum/2)
                {
                    one=array1[i];
                }
                i++;
                count++;
            }
            while(count<=sum/2&&j< array2.length)
            {
                if(count==sum/2)
                {
                    one=array2[j];
                }
                j++;
                count++;
            }


            System.out.println(one);
        }
    }
}

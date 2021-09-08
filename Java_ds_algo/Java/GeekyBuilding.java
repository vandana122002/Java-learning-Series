package Java_ds_algo.Java;

import java.util.Stack;

public class GeekyBuilding {

    static boolean recreationalSpot(int[] arr , int n){
        // Your code goes here
        int[] minArray=new int[n];
        minArray[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            minArray[i]=Math.min(minArray[i-1],arr[i]);
        }
        Stack<Integer> s=new Stack<>();
        int j=arr.length-1;
        boolean found=false;
        while(j>=0) {
            while (!s.empty() && s.peek() <=minArray[j]) {
                s.pop();
            }

                if (!s.empty() && s.peek() < arr[j]) {
                        found=true;
                        break;
                }

            s.push(arr[j]);
            j--;
        }
        return found;
    }
    public static void main(String args[])
    {
        int[] arr={5,4,3,2,1};
        System.out.println(recreationalSpot(arr , arr.length));
    }
}

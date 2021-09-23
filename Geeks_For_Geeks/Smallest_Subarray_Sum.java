package Geeks_For_Geeks;

public class Smallest_Subarray_Sum {
    static int smallestSubWithSum(int arr[], int n, int x)
    {
        // Initialize current sum and minimum length
        int curr_sum = 0, min_len = n + 1;

        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= x && end < n) {
                System.out.println(curr_sum);
                curr_sum += arr[end++];
                System.out.println("check1 " + curr_sum + " " + end);// If current sum becomes greater than x.
                while (curr_sum > x && start < n) {
                    // Update minimum length if needed
                    if (end - start < min_len)
                        min_len = end - start;

                    // remove starting elements
                    curr_sum -= arr[start++];
                    System.out.println("check2  " + curr_sum+" start "+start+" "+end);
                }
            }
        }
        return min_len;
    }
    public static void main(String[] args)
    {
        int arr1[] = { 6,3,4,5,4,3,7,9 };
        int x = 16;
        int n1 = arr1.length;
        int res1 = smallestSubWithSum(arr1, n1, x);
        System.out.println(res1);
    }
}

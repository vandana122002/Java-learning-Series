package CodeChef;

import java.util.Scanner;

public class worthy_matrix {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T>0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            long k = scan.nextLong();
            long[][] arr = new long[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scan.nextLong();
                }
            }
            long count = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (arr[i][j] >= k) {
                        count++;
                    }
                    if ((arr[i][j] + arr[i + 1][j] + arr[i][j + 1] + arr[i + 1][j + 1]) / 4 >= k) {
                        count++;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                if (arr[n - 1][i] >= k) {
                    count++;
                }
            }
            for (int i = 0; i < n - 1; i++) {
                if (arr[i][m - 1] >= k) {
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}

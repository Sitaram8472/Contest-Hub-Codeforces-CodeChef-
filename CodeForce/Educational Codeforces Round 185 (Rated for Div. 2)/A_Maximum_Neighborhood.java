import java.util.*;

public class A_Maximum_Neighborhood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 1) {
                System.out.println(1);
                continue;
            }
            if (n == 2) {
                System.out.println(9);
                continue;
            }
            if (n == 3) {
                System.out.println(29);
                continue;
            }
            if (n == 4) {
                System.out.println(56);
                continue;
            }

            int start = 1;
            int[][] num = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    num[i][j] = start++;
                }
            }

            int sum = num[n - 2][n - 3]
                    + num[n - 2][n - 2]
                    + num[n - 2][n - 1]
                    + num[n - 1][n - 2]
                    + num[n - 3][n - 2];

            System.out.println(sum);
        }
        sc.close();
    }
}

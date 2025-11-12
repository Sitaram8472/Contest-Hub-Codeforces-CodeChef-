import java.util.*;

public class Interesting_Binary_Easy_Version {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    StringBuilder sb = new StringBuilder();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();

      int dp0 = 0;
      int dp1 = 1;

      for (int i = 1; i < n; i++) {
        int ndp0 = Integer.MAX_VALUE;
        int ndp1 = Integer.MAX_VALUE;

        if (a[i - 1] != a[i])
          ndp0 = Math.min(ndp0, dp0);
        if ((a[i - 1] + 1) != a[i])
          ndp0 = Math.min(ndp0, dp1);

        if (a[i - 1] != (a[i] + 1))
          ndp1 = Math.min(ndp1, dp0 + 1);

        if ((a[i - 1] + 1) != (a[i] + 1))
          ndp1 = Math.min(ndp1, dp1 + 1);

        dp0 = ndp0;
        dp1 = ndp1;
      }

      int ans = Math.min(dp0, dp1);
      sb.append(ans).append('\n');
    }

    System.out.print(sb.toString());
    sc.close();
  }
}

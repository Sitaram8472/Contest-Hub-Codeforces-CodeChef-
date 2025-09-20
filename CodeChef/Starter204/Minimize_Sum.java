import java.util.*;

public class Minimize_Sum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] count = new int[m];
      int[] arr = new int[n];
      long totalSum = 0;

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        count[arr[i]]++;
        totalSum += arr[i];
      }

      int[] prefixCount = new int[m + 1];
      for (int i = 0; i < m; i++) {
        prefixCount[i + 1] = prefixCount[i] + count[i];
      }
      long minSum = Long.MAX_VALUE;

      for (int i = 0; i < n; i++) {
        int k = (m - arr[i]) % m;

        int w = prefixCount[m] - prefixCount[Math.max(0, m - k)];
        long After = totalSum + (long) k * n - (long) w * m;
        minSum = Math.min(minSum, After);
      }
      System.out.println(minSum);
    }

    sc.close();
  }
}

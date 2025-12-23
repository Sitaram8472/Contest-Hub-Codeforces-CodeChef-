import java.util.*;

public class B_Blackslex_and_Showering {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      long total = 0;
      for (int i = 0; i + 1 < n; i++) {
        total += Math.abs(num[i] - num[i + 1]);
      }

      long best = 0;

      best = Math.max(best, Math.abs(num[0] - num[1]));

      best = Math.max(best, Math.abs(num[n - 2] - num[n - 1]));

      for (int i = 1; i < n - 1; i++) {
        long r = Math.abs(num[i - 1] - num[i]) +
            Math.abs(num[i] - num[i + 1]) -
            Math.abs(num[i - 1] - num[i + 1]);
        best = Math.max(best, r);
      }

      System.out.println(total - best);
    }
    sc.close();
  }
}

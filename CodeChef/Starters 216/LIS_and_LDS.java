import java.util.*;

public class LIS_and_LDS {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      if (n == 1) {
        System.out.println(num[0]);
        continue;
      }

      int ans = 0;
      for (int i = 0; i < n; i++) {
        ans += Math.min(num[i], 2);
      }
      System.out.println((ans + 1) / 2);

    }
    sc.close();
  }
}
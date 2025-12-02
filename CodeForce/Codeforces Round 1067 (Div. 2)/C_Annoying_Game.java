import java.util.*;

public class C_Annoying_Game {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] a = new int[n];
      long sum = 0;
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        sum += a[i];
      }

      int[] b = new int[n];
      for (int i = 0; i < n; i++) {
        b[i] = sc.nextInt();
      }

      if (k % 2 == 0) {
        System.out.println(sum);
        continue;
      }

      
      long[] prev1 = new long[n];
      long[] prev2 = new long[n];

      prev1[0] = a[0];
      long x = a[0];
      for (int i = 1; i < n; i++) {
        prev1[i] = Math.max(a[i], prev1[i - 1] + a[i]);
        x = Math.max(a[i], prev1[i]);
      }

      prev2[n - 1] = b[n - 1];
      for (int i = n - 2; i >= 0; i--) {
        prev2[i] = Math.max(a[i], prev2[i + 1] + a[i]);
      }

      long ans2 = 0;
      for (int i = 0; i < n; i++) {
        long y = prev1[i] + prev2[i] - a[i];
        long z = y + b[i];
        ans2 = Math.max(ans2, z);
      }
      System.out.println(ans2);

    }
    sc.close();
  }
}
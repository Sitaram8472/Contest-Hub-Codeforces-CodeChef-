import java.util.*;

public class C_Cyclic_Merging {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      long[] a = new long[n];
      long max = 0;
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextLong();
        max = Math.max(a[i], max);

      }

      long sum = 0;
      for (int i = 0; i < n; i++) {
        long w = Math.max(a[i], a[(i + 1) % n]);
        sum += w;

      }

      System.out.println(sum - max);
    }
    sc.close();
  }
}

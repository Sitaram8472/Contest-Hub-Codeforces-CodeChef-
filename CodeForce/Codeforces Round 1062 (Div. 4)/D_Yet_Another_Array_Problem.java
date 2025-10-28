import java.util.*;

public class D_Yet_Another_Array_Problem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextLong();

      long ans = -1;
      for (long x = 2; x <= 1000000; x++) {
        boolean ok = false;
        for (long v : a) {
          if (gcd(v, x) == 1) {
            ok = true;
            break;
          }
        }
        if (ok) {
          ans = x;
          break;
        }
      }

      if (ans == -1)
        ans = 1000000007L;
      System.out.println(ans);
    }
    sc.close();
  }

  static long gcd(long a, long b) {
    while (b != 0) {
      long tmp = a % b;
      a = b;
      b = tmp;
    }
    return Math.abs(a);
  }
}

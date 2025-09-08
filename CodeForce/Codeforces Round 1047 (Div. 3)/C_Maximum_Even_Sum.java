import java.util.*;

public class C_Maximum_Even_Sum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long a = sc.nextLong();
      long b = sc.nextLong();

      long best = -1;

      for (long d = 1; d * d <= b; d++) {
        if (b % d == 0) {
          long k1 = d;
          long k2 = b / d;

          long val1 = a * k1 + b / k1;
          if (val1 % 2 == 0)
            best = Math.max(best, val1);

          if (k1 != k2) {
            long val2 = a * k2 + b / k2;
            if (val2 % 2 == 0)
              best = Math.max(best, val2);
          }
        }
      }

      System.out.println(best);
    }
    sc.close();
  }
}

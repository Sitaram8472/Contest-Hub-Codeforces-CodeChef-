import java.util.*;

public class G_Mukhammadali_and_the_Smooth_Array {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long[] a = new long[n];
      long[] c = new long[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextLong();
      }

      long total = 0;

      for (int i = 0; i < n; i++) {
        c[i] = sc.nextLong();
        total += c[i];
      }

      long[] Cost = new long[n];
      long bestKeep = 0;

      for (int i = 0; i < n; i++) {
        Cost[i] = c[i];
        for (int j = 0; j < i; j++) {
          if (a[j] <= a[i]) {
            long possible = Cost[j] + c[i];
            if (possible > Cost[i]) {
              Cost[i] = possible;
            }
          }
        }
        if (Cost[i] > bestKeep) {
          bestKeep = Cost[i];
        }
      }

      System.out.println(total - bestKeep);
    }
    sc.close();
  }
}

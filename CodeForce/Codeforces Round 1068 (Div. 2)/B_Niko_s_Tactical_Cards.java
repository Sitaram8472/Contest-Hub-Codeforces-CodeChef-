import java.util.*;

public class B_Niko_s_Tactical_Cards {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
      int t = sc.nextInt();
      while (t-- > 0) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
          a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
          b[i] = sc.nextInt();
        }

        long maxs = 0;
        long mins = 0;

        for (int i = 0; i < n; i++) {
          long val1 = maxs - a[i];
          long val2 = b[i] - maxs;

          long val3 = mins - a[i];
          long val4 = b[i] - mins;

          maxs = Math.max(Math.max(val1, val2), Math.max(val3, val4));
          mins = Math.min(Math.min(val1, val2), Math.min(val3, val4));
        }

        System.out.println(maxs);
      }
    }
    sc.close();
  }
}
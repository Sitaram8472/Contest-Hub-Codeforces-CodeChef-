import java.util.*;

public class C_Maximum_GCD_on_Whiteboard {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    StringBuilder out = new StringBuilder();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      Arrays.sort(a);

      int ans = 1;
      for (int d = n; d >= 1; d--) {
        int idx = lowerBound(a, d); // first index where a[i] >= d
        int less = idx; // count of elements < d
        if (less <= k) {
          ans = d;
          break;
        }
      }

      out.append(ans).append('\n');
    }

    System.out.print(out);
    sc.close();
  }

  private static int lowerBound(int[] arr, int x) {
    int l = 0, r = arr.length;
    while (l < r) {
      int m = (l + r) >>> 1;
      if (arr[m] < x)
        l = m + 1;
      else
        r = m;
    }
    return l;
  }
}

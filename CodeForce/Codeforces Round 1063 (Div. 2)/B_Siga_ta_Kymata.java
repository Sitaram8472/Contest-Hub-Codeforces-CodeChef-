import java.util.*;

public class B_Siga_ta_Kymata {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] p = new int[n + 1];
      for (int i = 1; i <= n; i++)
        p[i] = sc.nextInt();
      String x = sc.next();

      // If x[1] == 1 or x[n] == 1 → impossible
      if (x.charAt(0) == '1' || x.charAt(n - 1) == '1') {
        System.out.println(-1);
        continue;
      }

      // Collect indices where x[i] = 1
      ArrayList<Integer> ones = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
        if (x.charAt(i - 1) == '1')
          ones.add(i);
      }

      // Case: all zeros
      if (ones.isEmpty()) {
        System.out.println(0);
        continue;
      }

      // Otherwise, we try to find one valid (l, r)
      int L = Collections.min(ones);
      int R = Collections.max(ones);

      int l = Math.max(1, L - 1);
      int r = Math.min(n, R + 1);

      // Check if this (l,r) really works; if not, fallback to (1,n)
      boolean works = true;
      for (int idx : ones) {
        if (idx <= l || idx >= r) {
          works = false;
          break;
        }
        int minv = Math.min(p[l], p[r]);
        int maxv = Math.max(p[l], p[r]);
        if (!(p[idx] > minv && p[idx] < maxv)) {
          works = false;
          break;
        }
      }

      if (!works) {
        l = 1;
        r = n;
      }

      System.out.println(1);
      System.out.println(l + " " + r);
    }
    sc.close();
  }
}

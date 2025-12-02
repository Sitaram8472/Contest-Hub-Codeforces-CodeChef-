import java.util.*;

public class B_Split {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[2 * n];

      for (int i = 0; i < 2 * n; i++) {
        num[i] = sc.nextInt();
      }

      HashMap<Integer, Integer> freq = new HashMap<>();
      for (int x : num) {
        freq.put(x, freq.getOrDefault(x, 0) + 1);
      }

      int o = 0;
      int e = 0;

      for (int c : freq.values()) {
        if ((c & 1) == 1) {
          o++;
        } else {
          e++;
        }
      }

      // int k = Math.min(e, n);
      // if (o == 0 && (k % 2 != n % 2)) {
      // k = Math.max(0, k - 1);
      // }
      // int ans = o + 2 * k;

      int ans = 0;
      if (o > 0) {
        ans = o + 2 * e;
      } else {
        if (n % 2 == 0) {
          ans = 2 * e;
        } else {
          if (e == 1) {
            ans = 2;
          } else {
            ans = 2 * e - 2;
          }
        }
      }

      System.out.println(ans);
    }

    sc.close();
  }
}

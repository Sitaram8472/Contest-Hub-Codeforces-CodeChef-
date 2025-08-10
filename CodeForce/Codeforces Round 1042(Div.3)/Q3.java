import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int[] b = new int[n];
      for (int i = 0; i < b.length; i++) {
        b[i] = sc.nextInt();
      }

      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        int rem = a[i] % k;
        int op = Math.min(rem, k - rem);
        map.put(op, map.getOrDefault(op, 0) + 1);
      }

      for (int i = 0; i < n; i++) {
        int rem = b[i] % k;
        int op = Math.min(rem, k - rem);
        map.put(op, map.getOrDefault(op, 0) - 1);
      }

      boolean flag = true;
      for (int x : map.values()) {
        if (x != 0) {
          flag = false;
          break;
        }
      }

      if (flag) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
  }
}

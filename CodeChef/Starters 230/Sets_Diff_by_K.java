
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Sets_Diff_by_K {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] b = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        b[i] = sc.nextInt();
      }

      int last = -1000000;
      boolean ok = true;

      for (int i = 1; i <= n; i++) {
        if (b[i] == 1) {
          if (i - last <= k) {
            ok = false;
            break;
          }
          last = i;
        }
      }

      if (ok) {
        for (int i = 1; i <= n; i++) {
          if (b[i] == 0) {
            boolean till = false;

            for (int j = Math.max(1, i - k); j <= Math.min(n, i + k); j++) {
              if (b[j] == 1) {
                till = true;
                break;
              }
            }

            if (!till) {
              ok = false;
              break;
            }
          }
        }
      }

      System.out.println(ok ? "Yes" : "No");
    }
  }
}
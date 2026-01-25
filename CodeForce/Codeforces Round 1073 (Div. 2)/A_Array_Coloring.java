
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class A_Array_Coloring {
  /**
   * author: sitaram sahu
   * created: 17.01.2026 20:09:44
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    // int[][] temp = new int[n][2];
    // for (int i = 0; i < n; i++) {
    // temp[i][0] = nums[i];
    // temp[i][1] = i;
    // }

    // Arrays.sort(temp, (a, b) -> Integer.compare(a[0], b[0]));

    // boolean found = true;
    // for (int i = 0; i < n - 1; i++) {
    // if (temp[i][1] % 2 == temp[i + 1][1] % 2) {
    // found = false;
    // break;
    // }
    // }

    boolean found = true;
    for (int i = 0; i < n - 1; i++) {
      if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0) || (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1)) {
        found = false;
      }
    }

    if (found) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          String line = br.readLine();
          if (line == null)
            return null;
          st = new StringTokenizer(line);
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}

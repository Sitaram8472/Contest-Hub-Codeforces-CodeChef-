
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class D_Absolute_Cinema {

  /**
   * author: sitaram sahu
   * created: 15.02.2026 20:44:08
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
    out.flush();
    out.close();
  }

  private static void solve() {
    int n = sc.nextInt();
    long[] nums = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextLong();
    }

    long totalsum = (nums[1] + nums[n]) / (n - 1);

    long[] a = new long[n + 1];

    for (int i = 2; i < n; i++) {
      a[i] = (nums[i + 1] - 2 * nums[i] + nums[i - 1]) / 2;
    }

    a[1] = (nums[2] - nums[1] + totalsum) / 2;
    a[n] = (nums[n - 1] - nums[n] + totalsum) / 2;

    for (int i = 1; i <= n; i++) {
      System.out.print(a[i] + (i == n ? "" : " "));
    }
    System.out.println();

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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Divisible_Permutation {
  /**
   * author: sitaram sahu
   * created: 29.01.2026 20:15:11
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
    int[] p = new int[n + 1];
    int low = 1;
    int high = n;

    for (int i = n; i >= 1; i--) {
      if ((n - i) % 2 == 0) {
        p[i] = low++;
      } else {
        p[i] = high--;
      }
    }

    for (int i = 1; i <= n; i++) {
      System.out.print(p[i] + (i == n ? "" : " "));
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

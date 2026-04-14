
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Interval_Subset {

  /**
   * author: sitaram sahu
   * created: 14.04.2026 21:14:48
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
    int m = sc.nextInt();

    long[] a = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextLong();
    }

    int L = 0;
    int R = n + 1;

    for (int i = 0; i < m; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      L = Math.max(L, l);
      R = Math.min(R, r);
    }

    if (L > R) {
      System.out.println(0);
    } else {
      long minScore = 0;
      for (int i = L; i <= R; i++) {
        minScore += a[i];
      }
      System.out.println(minScore);
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
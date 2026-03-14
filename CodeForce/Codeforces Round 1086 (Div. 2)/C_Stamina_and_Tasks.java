
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Stamina_and_Tasks {

  /**
   * author: sitaram sahu
   * created: 14.03.2026 21:20:14
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
    int[] c = new int[n];
    int[] p = new int[n];

    for (int i = 0; i < n; i++) {
      c[i] = sc.nextInt();
      p[i] = sc.nextInt();
    }

    double max = 0;

    for (int i = n - 1; i >= 0; i--) {
      double multiplier = 1.0 - (p[i] / 100.0);

      max = Math.max(max, c[i] + multiplier * max);
    }

    System.out.printf("%.10f\n", max);
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
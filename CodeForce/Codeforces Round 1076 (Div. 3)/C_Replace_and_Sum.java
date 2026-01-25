
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Replace_and_Sum {

  /**
   * author: sitaram sahu
   * created: 25.01.2026 20:49:57
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
    int q = sc.nextInt();

    int[] a = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    int[] b = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      b[i] = sc.nextInt();
    }

    int max = 0;
    for (int i = n; i >= 1; i--) {
      max = Math.max(max, Math.max(a[i], b[i]));
      a[i] = max;
    }

    int[] prefix = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      prefix[i] = prefix[i - 1] + a[i];
    }

    while (q-- > 0) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      System.out.print((prefix[r] - prefix[l - 1]) + " ");
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
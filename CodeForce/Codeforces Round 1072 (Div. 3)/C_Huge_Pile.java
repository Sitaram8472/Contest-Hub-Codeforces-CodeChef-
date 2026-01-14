
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Huge_Pile {

  /**
   * author: sitaram sahu
   * created: 12.01.2026 20:40:14
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    long n = sc.nextLong();
    long k = sc.nextLong();

    if (k > n) {
      System.out.println(-1);
      return;
    }

    for (int t = 0; t <= 60; t++) {
      long div = 1L << t;

      long low = n / div;
      long high = (n + div - 1) / div;

      if (low <= k && k <= high) {
        System.out.println(t);
        return;
      }
    }

    System.out.println(-1);
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
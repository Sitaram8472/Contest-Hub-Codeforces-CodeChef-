
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_The_Curse_of_the_Frog {

  /**
   * author: sitaram sahu
   * created: 23.01.2026 20:33:42
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
    long x = sc.nextLong();

    Long l = 0 * 1L;
    long maxd = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      long ai = sc.nextLong();
      long bi = sc.nextLong();
      long ci = sc.nextLong();

      l += (bi - 1) * ai;
      long currd = (bi * ai) - ci;

      if (currd > maxd) {
        maxd = currd;
      }
    }
    if (l >= x) {
      System.out.println(0);
    } else if (maxd <= 0) {
      System.out.println(-1);
    } else {
      long need = x - l;
      long back = (need + maxd - 1) / maxd;
      System.out.println(back);
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
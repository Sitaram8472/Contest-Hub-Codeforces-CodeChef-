
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Grid_L {

  /**
   * author: sitaram sahu
   * created: 13.04.2026 21:29:02
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
    long p = sc.nextLong();
    long q = sc.nextLong();

    long target = 2 * (p + 2 * q) + 1;
    for (long i = 3; i * i <= target; i += 2) {
      if (target % i == 0) {
        long a = i;
        long b = target / i;

        long n = (a - 1) / 2;
        long m = (b - 1) / 2;

        if (n > 0 && m > 0) {
          long h = (n + 1) * m;
          long v = (m + 1) * n;

          if (q <= h && q <= v) {
            System.out.println(n + " " + m);
            return;
          }
        }
      }
    }
    System.out.println("-1");
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
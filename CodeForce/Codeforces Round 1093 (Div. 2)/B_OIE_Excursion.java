
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_OIE_Excursion {

  /**
   * author: sitaram sahu
   * created: 13.04.2026 20:23:19
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
    long m = sc.nextLong();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    long curr = 0;

    for (int i = 0; i < n; i++) {

      long forbidden = (m - (a[i] + (i + 1L)) % m) % m;

      if (curr % m == forbidden) {
        curr++;
      }

      if (curr >= m)
        break;
    }

    if (curr < m) {
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
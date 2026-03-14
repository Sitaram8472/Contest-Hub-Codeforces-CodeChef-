
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Parkour_Design {

  /**
   * author: sitaram sahu
   * created: 23.02.2026 20:11:01
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
    long x = sc.nextInt();
    long y = sc.nextInt();

    long d = x - 2 * y;
    if (d < 0 || d % 3 != 0) {
      System.out.println("NO");
      return;
    }

    long k = d / 3;

    if (k >= Math.max(0, -2 * y))

    {
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
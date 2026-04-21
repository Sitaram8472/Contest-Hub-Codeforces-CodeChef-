
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Red_Black_Pairs {

  /**
   * author: sitaram sahu
   * created: 21.04.2026 20:45:51
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

  public static void solve() {
    int n = sc.nextInt();
    String t = sc.next();
    String b = sc.next();

    int i = 0;
    int cost = 0;

    while (i < n) {
      if (t.charAt(i) == b.charAt(i)) {
        i++;
      } else {
        int opta = 1;

        int optb = Integer.MAX_VALUE;

        if (i + 1 < n) {
          optb = 0;
          if (t.charAt(i) != t.charAt(i + 1))
            optb++;
          if (b.charAt(i) != b.charAt(i + 1))
            optb++;
        }

        if (optb < opta) {
          cost += optb;
          i += 2;
        } else {
          cost += opta;
          i++;
        }
      }
    }

    System.out.println(cost);
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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class F_Max_Subarrays {

  /**
   * author: sitaram sahu
   * created: 14.04.2026 21:12:25
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
    int MOD = 1000000007;
    int n = sc.nextInt();
    int m = sc.nextInt();

    long ans = 1;

    for (int i = 0; i < m - 1; i++) {
      ans = (ans * 2) % MOD;
    }

    for (int i = 1; i <= n - m + 1; i++) {
      ans = (ans * i) % MOD;
    }

    System.out.println(ans);
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
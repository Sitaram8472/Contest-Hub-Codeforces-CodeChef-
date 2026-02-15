
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Dice_Roll_Sequence {

  /**
   * author: sitaram sahu
   * created: 15.02.2026 20:39:38
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
    int[] a = new int[n + 1];

    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }

    int ans = 0;

    for (int i = 2; i <= n; i++) {
      if (a[i] == a[i - 1] || a[i] == 7 - a[i - 1]) {
        ans++;
        i++;
      }
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
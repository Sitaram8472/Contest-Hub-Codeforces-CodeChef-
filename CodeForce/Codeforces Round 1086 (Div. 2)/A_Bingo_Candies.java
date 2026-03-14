
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Bingo_Candies {

  /**
   * author: sitaram sahu
   * created: 14.03.2026 20:06:43
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
    int[][] nums = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        nums[i][j] = sc.nextInt();
      }

    }

    int[] num = new int[n * n + 1];
    for (int j = 0; j < n; j++) {
      for (int i = 0; i < n; i++) {
        num[nums[j][i]]++;
      }

    }

    boolean found = true;
    for (int x : num) {
      if (x > n * (n - 1)) {
        found = false;
        break;
      }
    }

    System.out.println(found ? "YES" : "NO");

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
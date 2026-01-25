
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_1_XOR_Convenience_Easy_Version {

  /**
   * author: sitaram sahu
   * created: 23.01.2026 21:02:06
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

    int[] ans = new int[n];
    ans[n - 1] = 1;
    for (int i = 2; i < n; i++) {
      ans[i - 1] = (i ^ 1);
    }

    if (n % 2 == 0) {
      ans[0] = n;
    } else {
      ans[0] = n - 1;
    }

    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
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
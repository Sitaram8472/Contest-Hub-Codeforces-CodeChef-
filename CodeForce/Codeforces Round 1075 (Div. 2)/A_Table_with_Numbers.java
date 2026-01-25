
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Table_with_Numbers {
  /**
   * author: sitaram sahu
   * created: 23.01.2026 20:12:25
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
    int h = sc.nextInt();
    int l = sc.nextInt();

    int[] nums = new int[n];
    int max = 0;
    int min = 0;
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    max = Math.max(h, l);
    min = Math.min(h, l);

    int cnt = 0;
    int cnt2 = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] <= max) {
        cnt++;
      }
      if (nums[i] <= min) {
        cnt2++;
      }
    }

    System.out.println(Math.min(cnt / 2, cnt2));

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

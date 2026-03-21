
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Right_Maximum {

  /**
   * author: sitaram sahu
   * created: 16.03.2026 20:24:40
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
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    int[] premax = new int[n];
    premax[0] = nums[0];
    for (int i = 1; i < n; i++) {
      premax[i] = Math.max(premax[i - 1], nums[i]);
    }

    int cnt = 0;
    int i = n - 1;

    while (i >= 0) {
      int currmax = premax[i];
      int j = i;

      while (j >= 0 && nums[j] != currmax) {
        j--;
      }
      cnt++;
      i = j - 1;
    }
    System.out.println(cnt);

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
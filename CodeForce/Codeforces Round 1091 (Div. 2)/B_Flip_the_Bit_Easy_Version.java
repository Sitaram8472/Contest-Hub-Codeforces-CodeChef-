
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Flip_the_Bit_Easy_Version {

  /**
   * author: sitaram sahu
   * created: 07.04.2026 20:30:04
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
    int k = sc.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    int p = sc.nextInt() - 1;

    int x = nums[p];

    int l = 0;
    int prev = 0;

    for (int i = 0; i <= p; i++) {
      int curr = (nums[i] == x) ? 0 : 1;
      if (curr != prev) {
        l++;
      }
      prev = curr;
    }

    int r = 0;
    prev = 0;

    for (int i = n - 1; i >= p; i--) {
      int curr = (nums[i] == x) ? 0 : 1;
      if (curr != prev) {
        r++;
      }
      prev = curr;
    }

    System.out.println(Math.max(r, l));

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
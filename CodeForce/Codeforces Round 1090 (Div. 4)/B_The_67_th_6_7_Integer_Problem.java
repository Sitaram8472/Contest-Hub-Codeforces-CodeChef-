
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_The_67_th_6_7_Integer_Problem {

  /**
   * author: sitaram sahu
   * created: 04.04.2026 20:10:43
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

    int[] nums = new int[7];
    int sum = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < 7; i++) {
      nums[i] = sc.nextInt();
      sum += nums[i];
      if (nums[i] > max) {
        max = nums[i];
      }

    }

    System.out.println((2 * max) - sum);

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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_The_Equalizer {

  /**
   * author: sitaram sahu
   * created: 07.04.2026 20:10:06
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
    int sum = 0;

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
      sum += nums[i];
    }

    if (sum % 2 == 0 && k % 2 == 1 && n % 2 == 1) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
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
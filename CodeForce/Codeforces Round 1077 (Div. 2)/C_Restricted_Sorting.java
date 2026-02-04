
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Restricted_Sorting {

  /**
   * author: sitaram sahu
   * created: 29.01.2026 21:07:54
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
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
      if (nums[i] < min)
        min = nums[i];
      if (nums[i] > max)
        max = nums[i];
    }

    int[] sorted = nums.clone();
    Arrays.sort(sorted);

    int maxk = Integer.MAX_VALUE;
    boolean issort = true;

    for (int i = 0; i < n; i++) {

      if (nums[i] != sorted[i]) {
        issort = false;
        int curr = Math.max(nums[i] - min, max - nums[i]);
        maxk = Math.min(maxk, curr);
      }
    }

    if (issort) {
      System.out.println("-1");
    } else {
      System.out.println(maxk);
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
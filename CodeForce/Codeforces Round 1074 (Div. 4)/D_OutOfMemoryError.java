
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class D_OutOfMemoryError {

  /**
   * author: sitaram sahu
   * created: 18.01.2026 20:25:38
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
    int m = sc.nextInt();
    long h = sc.nextLong();

    long[] nums = new long[n + 1];
    long[] temp = new long[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextLong();
      temp[i] = nums[i];
    }

    int[] b = new int[m];
    long[] c = new long[m];
    int idxcras = -1;
    List<Integer> modified = new ArrayList<>();

    for (int i = 0; i < m; i++) {
      b[i] = sc.nextInt();
      c[i] = sc.nextLong();

      nums[b[i]] += c[i];
      modified.add(b[i]);

      if (nums[b[i]] > h) {
        idxcras = i;
        for (int idx : modified) {
          nums[idx] = temp[idx];
        }
        modified.clear();
      }
    }

    for (int i = idxcras + 1; i < m; i++) {
      temp[b[i]] += c[i];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      sb.append(temp[i]).append(i == n ? "" : " ");
    }
    System.out.println(sb);
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

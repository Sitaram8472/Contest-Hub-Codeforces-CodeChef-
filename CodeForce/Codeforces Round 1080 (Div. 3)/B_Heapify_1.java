
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Heapify_1 {

  /**
   * author: sitaram sahu
   * created: 15.02.2026 20:20:12
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
    int[] nums = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextInt();
    }

    for (int i = 1; i <= n; i++) {
      if (root(i) != root(nums[i])) {
        System.out.println("NO");
        return;
      }
    }

    System.out.println("YES");

  }

  private static int root(int x) {
    while (x % 2 == 0) {
      x /= 2;
    }
    return x;
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
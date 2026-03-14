
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Cyclists {

  /**
   * author: sitaram sahu
   * created: 14.03.2026 20:27:26
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
    int p = sc.nextInt();
    int m = sc.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    int wincost = nums[p - 1];
    long initial = 0;

    if (p > k) {
      List<Integer> pool = new ArrayList<>();
      for (int i = 0; i < p - 1; i++) {
        pool.add(nums[i]);
      }
      Collections.sort(pool);
      for (int i = 0; i < p - k; i++) {
        initial += pool.get(i);
      }
    }

    if (initial + wincost > m) {
      System.out.println(0);
      return;
    }

    List<Integer> cyclepool = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (i == p - 1) {
        continue;
      }
      cyclepool.add(nums[i]);
    }

    Collections.sort(cyclepool);

    long cyclefill = 0;
    for (int i = 0; i < n - k; i++) {
      cyclefill += cyclepool.get(i);
    }

    long full = (long) wincost + cyclefill;
    long remain = m - (initial + wincost);

    System.out.println(1 + (remain / full));
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
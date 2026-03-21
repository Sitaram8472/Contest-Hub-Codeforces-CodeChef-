
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Cinema_Line {

  /**
   * author: sitaram sahu
   * created: 21.03.2026 13:05:11
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {

    solve();

    out.flush();
    out.close();
  }

  private static void solve() {
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    int cnt25 = 0;
    int cnt50 = 0;
    boolean found = true;
    for (int i = 0; i < n; i++) {
      if (nums[i] == 25) {

        cnt25++;
      } else if (nums[i] == 50) {
        if (cnt25 >= 1) {
          cnt50++;
          cnt25--;
        } else {
          found = false;
          break;
        }
      } else {

        if (cnt50 >= 1 && cnt25 >= 1) {
          cnt25--;
          cnt50--;
        } else if (cnt25 >= 3) {
          cnt25 -= 3;
        } else {
          found = false;
          break;
        }
      }
    }
    if (found) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
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

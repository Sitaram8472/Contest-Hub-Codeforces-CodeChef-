
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Hourglass {

  /**
   * author: sitaram sahu
   * created: 12.01.2026 20:18:22
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int s = sc.nextInt();
    int k = sc.nextInt();
    int m = sc.nextInt();

    if (k >= s) {
      System.out.println(s - m % k < 0 ? 0 : s - m % k);
    } else {
      int temp = (m / k) % 2 == 0 ? s : k;
      System.out.println(temp - m % k);
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
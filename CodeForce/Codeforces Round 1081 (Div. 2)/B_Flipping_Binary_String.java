
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Flipping_Binary_String {

  /**
   * author: sitaram sahu
   * created: 21.02.2026 20:32:40
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
    String s = sc.next();

    int one = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '1') {
        one++;
      }
    }
    int zero = n - one;
    if (one == 0) {
      System.out.println(0);
      return;
    }

    if (one % 2 == 0) {
      System.out.println(one);
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '1') {
          System.out.print((i + 1) + " ");
        }
      }
      System.out.println();
    } else if (zero % 2 != 0) {
      System.out.println(zero);
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '0') {
          System.out.print((i + 1) + " ");
        }
      }
      System.out.println();
    } else {
      System.out.println("-1");
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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_String_Rotation_Game {

  /**
   * author: sitaram sahu
   * created: 21.02.2026 20:08:29
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

    int ans = 0;
    boolean found = false;

    for (int i = 0; i < n; i++) {
      if (s.charAt(i) != s.charAt((i + 1) % n)) {
        ans++;
      }
      if (s.charAt(i) == s.charAt((i + 1) % n)) {
        found = true;
      }
    }

    if (ans == 0) {
      System.out.println(1);
    } else if (found) {
      System.out.println(ans + 1);
    } else {
      System.out.println(ans);
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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_ABAB_Construction {

  /**
   * author: sitaram sahu
   * created: 23.02.2026 20:40:23
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

    char[] ch = sc.next().toCharArray();

    boolean found = true;

    if (n % 2 == 0) {
      for (int i = 0; i < n; i += 2) {
        if (ch[i] != '?' && ch[i] == ch[i + 1]) {
          found = false;
        }
      }
    } else {
      if (ch[0] == 'b') {
        found = false;
      }

      for (int i = 1; i < n; i += 2) {
        if (ch[i] != '?' && ch[i] == ch[i + 1]) {
          found = false;
        }
      }
    }

    System.out.println(found ? "YES" : "NO");

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
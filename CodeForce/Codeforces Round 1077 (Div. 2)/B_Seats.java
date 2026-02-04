
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Seats {

  /**
   * author: sitaram sahu
   * created: 29.01.2026 20:42:16
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

    long res = 0;
    for (int i = 0; i < n;) {

      if (s.charAt(i) == '1') {
        i++;
        res++;
        continue;
      }

      int j = i;
      while (j < n && s.charAt(j) == '0') {
        j++;
      }

      int len = j - i;
      if (len == n) {
        System.out.println((len + 2) / 3);
        return;
      }

      if (i == 0 || j == n) {
        res += (len + 1) / 3;
      } else {
        res += (len / 3);
      }

      i = j;
    }

    System.out.println(res);
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
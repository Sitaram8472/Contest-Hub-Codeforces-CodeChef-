
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class A_Vadim_s_Collection {

  /**
   * author: sitaram sahu
   * created: 03.04.2026 19:41:34
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
    String s = sc.next();

    int[] num = new int[10];
    for (int i = 0; i < s.length(); i++) {
      int curr = s.charAt(i) - '0';
      num[curr]++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 10; i++) {
      int min = 10 - i;

      for (int d = min; d <= 9; d++) {
        if (num[d] > 0) {
          sb.append(d);
          num[d]--;
          break;
        }
      }

    }

    System.out.println(sb.toString());

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
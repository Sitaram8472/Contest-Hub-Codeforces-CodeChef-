
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class E_The_67_th_XOR_Problem {

  /**
   * author: sitaram sahu
   * created: 04.04.2026 21:25:32
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
    int[] a = new int[n];

    int xor = 0;
    int max = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      xor ^= a[i];
      max = Math.max(max, a[i]);
    }

    if (n % 2 == 0) {
      System.out.println(xor);
    } else {
      long maxxor = 0;
      for (int i = 0; i < n; i++) {
        maxxor = Math.max(maxxor, a[i] ^ maxxor);
      }
      System.out.println(max);
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
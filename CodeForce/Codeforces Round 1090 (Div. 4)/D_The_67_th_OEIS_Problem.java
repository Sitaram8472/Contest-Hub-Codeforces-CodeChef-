
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class D_The_67_th_OEIS_Problem {

  /**
   * author: sitaram sahu
   * created: 04.04.2026 20:34:06
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    precompute();
    while (testCases-- > 0) {
      solve();
    }
    out.flush();
    out.close();
  }

  static ArrayList<Long> list = new ArrayList<>();

  public static void precompute() {
    int limit = 200000;

    boolean[] isprime = new boolean[200000];
    Arrays.fill(isprime, true);

    for (int i = 2; i * i < 200000; i++) {
      if (isprime[i]) {
        for (int j = i * i; j < 200000; j += i) {
          isprime[j] = false;
        }
      }
    }
    for (int i = 2; i < limit; i++) {
      if (isprime[i]) {
        list.add((long) i);
      }
    }
  }

  private static void solve() {
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      long val = list.get(i) * list.get(i + 1);
      System.out.print(val + (i == n - 1 ? "" : " "));
    }
    System.out.println();
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
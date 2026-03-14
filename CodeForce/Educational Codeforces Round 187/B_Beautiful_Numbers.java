
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Beautiful_Numbers {

  /**
   * author: sitaram sahu
   * created: 25.02.2026 20:37:18
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
    int n = s.length();
    int[] digits = new int[n];
    long sum = 0;

    for (int i = 0; i < n; i++) {
      digits[i] = s.charAt(i) - '0';
      // sum += digits[i];
    }

    digits[0]--;
    int moves = digits.length;
    Arrays.sort(digits);
    for (int x : digits) {
      sum += x;
      if (sum < 9) {
        moves--;
      }
    }

    // if (sum <= 9) {
    // System.out.println(0);
    // return;
    // }

    // int[] other = new int[n - 1];
    // for (int i = 1; i < n; i++) {
    // other[i - 1] = digits[i];
    // }
    // Arrays.sort(other);

    // long currsum = sum;

    // for (int i = n - 2; i > 0; i--) {
    // if (currsum <= 9) {
    // break;
    // }

    // currsum -= other[i];
    // moves++;

    // if (currsum <= 9) {
    // System.out.println(moves);
    // return;
    // }
    // }

    // if (currsum > 9) {
    // moves++;
    // }

    System.out.println(moves);
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
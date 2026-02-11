
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Offshores {

  /**
   * author: sitaram sahu
   * created: 08.02.2026 14:49:54
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
    long x = sc.nextLong();
    long y = sc.nextLong();
    long totalpro = 0;
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
      totalpro += ((nums[i] / x) * y);
    }

    long money = 0;
    for (int i = 0; i < n; i++) {
      long otherbank = totalpro - ((nums[i] / x) * y);
      long wholetprofit = otherbank + nums[i];
      if (wholetprofit > money) {
        money = wholetprofit;
      }
    }

    System.out.println(money);

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
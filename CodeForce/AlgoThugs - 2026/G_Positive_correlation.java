
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class G_Positive_correlation {

  /**
   * author: sitaram sahu
   * created: 14.04.2026 21:10:43
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
    int[] arr = new int[n];

    int odd = 0;

    // input + count odd numbers
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (arr[i] % 2 == 1) {
        odd++;
      }
    }

    // if odd count is odd → impossible
    if (odd % 2 == 1) {
      System.out.println("NO");
      return;
    }

    // otherwise possible
    System.out.println("YES");

    // we take all elements and x = 2
    System.out.println(n + " " + 2);

    // print indices (1-based)
    for (int i = 1; i <= n; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

    // build answer string
    StringBuilder ans = new StringBuilder();

    int usedOdd = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] % 2 == 0) {
        ans.append('0'); // even → 0
      } else {
        if (usedOdd < odd / 2) {
          ans.append('1'); // make -1
          usedOdd++;
        } else {
          ans.append('0'); // make +1
        }
      }
    }

    System.out.println(ans.toString());
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
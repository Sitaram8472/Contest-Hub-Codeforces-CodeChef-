import java.util.*;
import java.io.*;

public class B_God_is_1_and_his_name_is_1 {

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  static final int MAX = 200005;
  static int[] dp = new int[MAX];

  public static void main(String[] args) {
    precompute();

    String tStr = sc.next();
    if (tStr != null) {
      int testCases = Integer.parseInt(tStr);
      while (testCases-- > 0) {
        solve();
      }
    }
    out.flush();
    out.close();
  }

  private static void solve() {
    int X = sc.nextInt();

    out.println(dp[X] - 1);
  }

  static void precompute() {

    for (int i = 1; i < MAX; i++) {
      dp[i] = i;
    }

    for (int iter = 0; iter < 3; iter++) {

      for (int i = 2; i < MAX; i++) {
        dp[i] = Math.min(dp[i], dp[i - 1] + 1);
      }

      for (int i = 2; i < MAX; i++) {
        for (int j = 2; i * j < MAX; j++) {
          if (dp[i] + dp[j] < dp[i * j]) {
            dp[i * j] = dp[i] + dp[j];
          }
        }
      }

      for (int i = MAX - 2; i >= 1; i--) {
        dp[i] = Math.min(dp[i], dp[i + 1] + 1);
      }
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
  }
}
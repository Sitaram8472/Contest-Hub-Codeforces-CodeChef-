import java.util.*;
import java.io.*;

public class D_Product_Pairs {

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  static final int MAX = 100005;
  static int[] spf = new int[MAX];
  static int[] sqFree = new int[MAX];
  static long[] precomputedAns = new long[MAX];
  static int[] counts = new int[MAX];

  public static void main(String[] args) {
    sieve();
    precomputeResults();

    String tInput = sc.next();
    if (tInput != null) {
      int t = Integer.parseInt(tInput);
      while (t-- > 0) {
        int n = sc.nextInt();
        out.println(precomputedAns[n]);
      }
    }
    out.flush();
    out.close();
  }

  static void sieve() {
    for (int i = 1; i < MAX; i++)
      spf[i] = i;
    for (int i = 2; i * i < MAX; i++) {
      if (spf[i] == i) {
        for (int j = i * i; j < MAX; j += i) {
          if (spf[j] == j)
            spf[j] = i;
        }
      }
    }

    for (int i = 1; i < MAX; i++) {
      sqFree[i] = getsq(i);
    }
  }

  static void precomputeResults() {
    long currentTotalPairs = 0;

    for (int n = 1; n < MAX - 1; n++) {
      int x = n + 1;
      int s = sqFree[x];

      currentTotalPairs += 2L * counts[s] + 1;
      counts[s]++;

      precomputedAns[n] = currentTotalPairs;
    }
  }

  static int getsq(int x) {
    int res = 1;
    while (x > 1) {
      int p = spf[x];
      int cnt = 0;
      while (x % p == 0) {
        x /= p;
        cnt++;
      }
      if (cnt % 2 == 1)
        res *= p;
    }
    return res;
  }

  static class FastReader {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          String line = br.readLine();
          if (line == null)
            return null;
          st = new StringTokenizer(line);
        } catch (Exception e) {
          return null;
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }
}
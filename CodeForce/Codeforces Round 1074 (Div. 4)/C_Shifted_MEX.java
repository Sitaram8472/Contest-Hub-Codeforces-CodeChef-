
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class C_Shifted_MEX {

  /**
   * author: sitaram sahu
   * created: 18.01.2026 20:12:57
   **/

  static FastReader sc = new FastReader();

  public static void main(String[] args) {
    int testCases = sc.nextInt();
    while (testCases-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

    Set<Integer> s = new HashSet<>();
    for (int x : nums) {
      s.add(x);
    }

    List<Integer> list = new ArrayList<>();
    for (int x : s) {
      list.add(x);
    }

    Collections.sort(list);

    int max = 0;
    int curr = 1;

    for (int i = 1; i < list.size(); i++) {
      if (list.get(i) == list.get(i - 1) + 1) {
        curr++;
      } else {
        curr = 1;
      }
      max = Math.max(max, curr);
    }
    max = Math.max(max, curr);

    System.out.println(Math.min(max, n));

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
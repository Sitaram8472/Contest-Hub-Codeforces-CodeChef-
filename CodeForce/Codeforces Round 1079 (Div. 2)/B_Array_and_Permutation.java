
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Array_and_Permutation {

  /**
   * author: sitaram sahu
   * created: 11.02.2026 20:15:59
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
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    List<Integer> list = new ArrayList<>();
    list.add(a[0]);
    for (int i = 1; i < n; i++) {
      if (a[i] != a[i - 1]) {
        list.add(a[i]);
      }
    }

    Set<Integer> s = new HashSet<>();
    for (int x : list) {
      if (s.contains(x)) {
        System.out.println("NO");
        return;
      } else {
        s.add(x);
      }
    }

    int i = 0;
    int j = 0;

    while (j < n && i < list.size()) {
      if (p[j] == list.get(i)) {
        i++;
      }
      j++;
    }

    System.out.println(i == list.size() ? "YES" : "NO");

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
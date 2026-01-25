
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class C_Sorting_Game {

  /**
   * author: sitaram sahu
   * created: 17.01.2026 20:53:39
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
    String s = sc.next();
    boolean found = true;
    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) > s.charAt(i + 1)) {
        found = false;
        break;
      }
    }

    if (found) {
      System.out.println("Bob");
      return;
    }
    int cnt0 = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == '0') {
        cnt0++;
      }
    }

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < cnt0; i++) {
      if (s.charAt(i) == '1') {
        list.add(i + 1);
      }
    }

    for (int i = cnt0; i < n; i++) {
      if (s.charAt(i) == '0') {
        list.add(i + 1);
      }
    }

    System.out.println("Alice");
    System.out.println(list.size());

    for (int x : list) {
      System.out.print(x + " ");
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

/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_MEX_Reordering {

  /**
   * author: sitaram sahu
   * created: 17.01.2026 20:25:51
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

    int[] temp = new int[n + 1];
    for (int i = 0; i < n; i++) {
      temp[nums[i]]++;
    }

    if (temp[0] == 0) {
      System.out.println("NO");
    } else if (temp[0] == 1) {
      System.out.println("YES");
    } else {
      if (temp[1] > 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    // boolean found = true;
    // for (int i = 0; i < n - 1; i++) {
    // Set<Integer> left = new HashSet<>();
    // Set<Integer> right = new HashSet<>();

    // int l = 0;
    // int r = i + 1;

    // int leftmex = 0;
    // int rightmex = 0;
    // while (l != i) {
    // left.add(nums[i]);
    // if (!left.contains(i)) {
    // leftmex = i;
    // }
    // l++;
    // }

    // while (r != n) {
    // right.add(nums[r]);
    // if (!right.contains(i)) {
    // rightmex = i;
    // }
    // r++;
    // }

    // if (leftmex == rightmex) {
    // found = false;
    // break;
    // }
    // }

    // if (found) {
    // System.out.println("YES");
    // } else {
    // System.out.println("NO");
    // }

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
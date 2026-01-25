
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Reverse_a_Permutation {

  /**
   * author: sitaram sahu
   * created: 25.01.2026 20:22:19
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
    int[] nums = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      nums[i] = sc.nextInt();
    }

    int start = -1;
    int target = n;
    for (int i = 1; i <= n; i++) {
      if (nums[i] == target) {
        target--;
      } else {
        start = i;
        break;
      }
    }
    if (start == -1) {
      for (int p = 1; p <= n; p++) {
        System.out.print(nums[p] + " ");
      }
      System.out.println();
      return;
    }
    int end = n;
    while (nums[end] != target) {
      end--;
    }

    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }

    for (int p = 1; p <= n; p++) {
      System.out.print(nums[p] + " ");
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
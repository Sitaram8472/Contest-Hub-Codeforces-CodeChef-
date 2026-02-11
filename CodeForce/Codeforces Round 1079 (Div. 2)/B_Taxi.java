
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class B_Taxi {

  /**
   * author: sitaram sahu
   * created: 11.02.2026 19:42:02
   **/

  static FastReader sc = new FastReader();
  static PrintWriter out = new PrintWriter(System.out);

  public static void main(String[] args) {
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println(solve(nums));
    out.flush();
    out.close();
  }

  private static int solve(int[] arr) {

    int n = arr.length;

    int sum = 0;
    int a1 = 0;
    int a2 = 0;
    int a3 = 0;
    int a4 = 0;

    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        a1++;
      } else if (arr[i] == 2) {
        a2++;
      } else if (arr[i] == 3) {
        a3++;
      } else {
        a4++;
      }
    }

    sum += a4;

    int min = Math.min(a1, a3);
    if (a1 == min) {
      sum += min;
      sum += a2 / 2;
      sum += a3 - min;
    } else {
      sum += min;
      sum += a2 / 2;
      a1 = a1 - min;
      if (a2 % 2 == 0) {
        if (a1 < 3) {
          sum++;
        } else {
          if (a1 == 3) {
            sum += 2;
          } else {
            a1 = a1 / 4;
            if (a1 <= 3) {
              sum += 2;
            }
          }
        }
      }
    }

    return sum;
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
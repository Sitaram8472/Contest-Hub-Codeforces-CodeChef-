
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Reselling_Items {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      Integer[] a = new Integer[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      Arrays.sort(a, Collections.reverseOrder());

      int profit = 0;

      for (int i = 0; i < Math.min(k, n); i++) {
        if (a[i] > 5) {
          profit += (a[i] - 5);
        }
      }

      for (int i = k; i < n; i++) {
        if (a[i] > 10) {
          profit += (a[i] - 10);
        }
      }

      System.out.println(profit);

    }
  }
}
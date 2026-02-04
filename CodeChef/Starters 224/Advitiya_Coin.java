
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Advitiya_Coin {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int trade = 0;
      int min = Integer.MAX_VALUE;
      int max = -1;
      for (int i = 0; i < n; i++) {

        min = Math.min(min, a[i]);
        max = Math.max(max, a[i]);
        if (max - min - k > 0) {
          trade++;
          min = 10000;
          max = -1;
        }
      }

      System.out.println(trade);

    }
  }
}
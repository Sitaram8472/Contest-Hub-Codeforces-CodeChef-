
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Sorting_Prefixes {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int ans = 0;
      for (int i = n - 1; i >= 0; i--) {
        if (a[i] != i + 1) {
          ans = a[i];
          break;
        }
      }

      System.out.println(ans);

    }

  }
}
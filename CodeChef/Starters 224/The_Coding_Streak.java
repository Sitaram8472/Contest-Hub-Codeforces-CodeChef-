
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class The_Coding_Streak {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      int max = 0;
      int curr = 0;
      for (int i = 0; i < n; i++) {
        if (a[i] > 0) {
          curr++;
        } else {
          curr = 0;
        }
        max = Math.max(max, curr);
      }
      System.out.println(max);

    }
  }
}
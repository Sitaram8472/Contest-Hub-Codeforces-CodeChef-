
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class School_Trip {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int k = sc.nextInt();

      int a = (x / k) * k;
      int ans = x - a;

      int up = a + k;
      if (up <= n) {
        ans = Math.min(ans, up - x);
      }

      ans = Math.min(ans, x);

      System.out.println(ans);

    }
  }
}
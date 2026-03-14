
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Sub_A_Add_B {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (n < a) {
        System.out.println(n);
      } else {
        int d = a - b;
        int ans = b + (n - a) % d;
        System.out.println(ans);
      }

    }
  }
}
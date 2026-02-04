
/**
 * author: sitaram sahu
 **/

import java.util.*;
import java.io.*;

public class Accommodation {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      long b = sc.nextLong();
      long g = sc.nextLong();
      long x = sc.nextLong();
      long y = sc.nextLong();
      long n = sc.nextLong();

      if (x + y > n) {
        System.out.println(-1);
        continue;
      }

      long minroom = (b + g + n - 1) / n;
      long maxroom = Math.min(b / x, g / y);

      if (minroom > maxroom) {
        System.out.println(-1);
      } else {
        System.out.println(minroom);
      }
    }

    sc.close();
  }
}

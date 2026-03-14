
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class IceCream_Cones {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {

      int x = sc.nextInt();
      int y = sc.nextInt();
      int n = sc.nextInt();

      int rest = n * y;

      if (rest > x) {
        System.out.println(0);
      } else {
        System.out.println(x - rest);
      }

    }
  }
}
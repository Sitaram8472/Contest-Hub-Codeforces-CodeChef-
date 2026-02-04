
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Adding_123_to_4 {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      int a = Math.min(x, z);
      System.out.println((y / 2) + a);
    }
  }
}
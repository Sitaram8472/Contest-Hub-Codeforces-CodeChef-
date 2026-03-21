
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Passing_Exams {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();

      if (x >= 50 && y >= 50 || x >= 50 && z >= 50 || y >= 50 && z >= 50) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }
  }
}
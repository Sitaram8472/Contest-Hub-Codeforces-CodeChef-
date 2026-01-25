
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

import java.util.*;
import java.lang.*;
import java.io.*;

class Candy_Types {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      HashMap<Integer, Integer> map = new HashMap<>();
      for (int x : a) {
        map.put(x, map.getOrDefault(x, 0) + 1);
      }

      int ans = 0;
      int val = 0;
      for (int x : map.keySet()) {
        if (map.get(x) > val) {
          ans = x;
          val = map.get(x);
        }

      }
      System.out.println(ans);

    }
  }
}
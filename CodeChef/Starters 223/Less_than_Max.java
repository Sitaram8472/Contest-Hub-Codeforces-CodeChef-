
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Less_than_Max {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int[] freq = new int[n + 1];

      for (int i = 0; i < n; i++) {
        freq[a[i]]++;
      }
      int used = freq[1];
      int ans = used;

      for (int i = 2; i <= n; i++) {
        int curr = Math.min(freq[i], used);
        used = curr;
        ans += used;
      }

      System.out.println(ans);

    }
  }
}
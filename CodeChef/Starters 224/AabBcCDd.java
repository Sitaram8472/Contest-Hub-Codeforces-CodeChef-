
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class AabBcCDd {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      int[] freq = new int[26];

      for (int i = 0; i < n; i++) {
        char ch = s.charAt(i);

        if (Character.isLowerCase(ch)) {
          freq[ch - 'a']++;
        } else if (Character.isUpperCase(ch)) {
          freq[ch - 'A']++;
        }
      }

      Arrays.sort(freq);
      System.out.println(freq[25] + freq[24]);

    }
  }
}
import java.util.*;
import java.lang.*;
import java.io.*;

public class Layered_Cake {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int[] b = new int[m];
      for (int i = 0; i < m; i++) {
        b[i] = sc.nextInt();
      }

      Arrays.sort(a);
      Arrays.sort(b);

      int count = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (a[i] > b[j]) {
            count++;
          }
        }
      }
      System.out.println(count);

    }

  }
}
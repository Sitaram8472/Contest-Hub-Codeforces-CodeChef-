import java.util.*;
import java.lang.*;
import java.io.*;

public class Sell_Upto_2 {
  public static void main(String[] args) throws java.lang.Exception {
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while (t-- > 0) {
      int n = s.nextInt();
      int[] x = new int[n];
      for (int i = 0; i < n; i++) {
        x[i] = s.nextInt();
      }

      PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
      int r = 0;

      for (int i = n - 1; i >= 0; i--) {
        q.add(x[i]);
        q.add(x[i]);
        r += q.poll();
      }

      System.out.println(r);
    }
  }

}

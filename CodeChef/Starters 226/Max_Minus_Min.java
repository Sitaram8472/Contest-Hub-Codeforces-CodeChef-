
/**
 * author:  sitaram sahu
**/

import java.util.*;
import java.io.*;

public class Max_Minus_Min {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      PriorityQueue<Long> pq = new PriorityQueue<>();
      long max = 0;

      for (int i = 0; i < n; i++) {
        long val = sc.nextInt();
        pq.add(val);
        if (val > max) {
          max = val;
        }
      }

      long limit = max;
      long diff = max - pq.peek();
      while (pq.peek() < limit) {
        long min = pq.poll();
        long next = min * 2;
        pq.add(next);
        if (next > max) {
          max = next;
        }

        diff = Math.min(diff, max - pq.peek());

      }

      System.out.println(diff);

    }
  }
}
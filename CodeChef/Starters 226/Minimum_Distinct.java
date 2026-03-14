import java.util.*;
import java.io.*;

public class Minimum_Distinct {

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] a = new int[n];
      Map<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        map.put(a[i], map.getOrDefault(a[i], 0) + 1);
      }

      int f = a[0];
      ArrayList<Integer> freq = new ArrayList<>();

      for (int key : map.keySet()) {
        if (key != f) {
          freq.add(map.get(key));
        }
      }

      Collections.sort(freq);

      int d = freq.size();

      for (int x : freq) {
        if (k >= x) {
          k -= x;
          d--;
        } else {
          break;
        }
      }

      System.out.println(1 + d);
    }
  }
}

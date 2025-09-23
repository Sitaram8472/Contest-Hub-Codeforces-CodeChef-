import java.util.*;

public class D_Game_on_Array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }

      HashMap<Long, Integer> freq = new HashMap<>();
      for (long val : arr) {
        freq.put(val, freq.getOrDefault(val, 0) + 1);
      }

      long[][] num = new long[freq.size()][2];
      int idx = 0;
      for (long k : freq.keySet()) {
        num[idx][0] = k;
        num[idx][1] = freq.get(k);
        idx++;
      }

      Arrays.sort(num, (a, b) -> Long.compare(b[1], a[1]));

      long alice = 0, bob = 0;
      int c = 1;

      for (long[] k : num) {
        long value = k[0];
        long count = k[1];

        if (value % 2 == 0) {
          long prod = value * count;
          alice += prod / 2;
          bob += prod / 2;
        } else {
          if (c % 2 != 0) {
            alice += count;
          } else {
            bob += count;
          }
          long prod = (value - 1) * count;
          alice += prod / 2;
          bob += prod / 2;
          c++;
        }
      }

      System.out.println(alice + " " + bob);
    }
    sc.close();
  }
}

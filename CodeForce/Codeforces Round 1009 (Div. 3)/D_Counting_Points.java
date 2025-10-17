import java.util.*;

public class D_Counting_Points {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] x = new int[n];
      for (int i = 0; i < n; i++)
        x[i] = sc.nextInt();

      int[] r = new int[n];
      for (int i = 0; i < n; i++)
        r[i] = sc.nextInt();

      HashMap<Integer, Integer> map = new HashMap<>();

      for (int i = 0; i < n; i++) {
        int xi = x[i];
        int ri = r[i];
        int r2 = ri * ri;

        for (int j = -ri; j <= ri; j++) {
          int a = xi + j;
          int y = (int) Math.sqrt(r2 - j * j);
          map.put(a, Math.max(map.getOrDefault(a, 0), y));
        }
      }

      long total = 0;
      for (int y : map.values()) {
        total += (2L * y + 1);
      }

      System.out.println(total);
    }
    sc.close();
  }
}

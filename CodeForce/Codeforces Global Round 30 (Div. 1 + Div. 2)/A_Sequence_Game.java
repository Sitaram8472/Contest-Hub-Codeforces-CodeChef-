import java.lang.reflect.Array;
import java.util.*;

public class A_Sequence_Game {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;

      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        min = Math.min(min, num[i]);
        max = Math.max(max, num[i]);
      }
      int x = sc.nextInt();

      if (min <= x && max >= x) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
    sc.close();
  }
}

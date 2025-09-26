import java.lang.reflect.Array;
import java.util.*;

public class B_Unconventional_Pairs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      int min = Integer.MIN_VALUE;
      for (int i = 0; i < n; i += 2) {
        int diff = Math.abs(arr[i] - arr[i + 1]);
        min = Math.max(min, diff);

      }
      System.out.println(min);
    }
    sc.close();
  }
}

import java.util.*;

public class D_Not_Alone {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int cnt = 0;

      for (int i = 1; i < n - 1; i++) {
        if (num[i] == num[i - 1] || num[i] == num[i + 1]) {
          continue;
        } else {
          int left = Math.abs(num[i] - num[i - 1]);
          int right = Math.abs(num[i] - num[i + 1]);
          cnt += Math.min(left, right);
          
        }
      }

      if (num[n - 1] == num[n - 2]) {
        continue;
      } else {
        cnt += Math.abs(num[n - 1] - num[n - 2]);
      }

      System.out.println(cnt);
    }
    sc.close();
  }
}
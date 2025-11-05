import java.util.*;

public class Subarray_Maximums {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int cnt = 0;

      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '0') {
          cnt++;
        } else {
          break;
        }
      }

      for (int i = n - 1; i >= 0; i--) {
        if (s.charAt(i) == '0') {
          cnt++;
        } else {
          break;
        }
      }

      int[] ans = new int[n];

      if (cnt > 0) {
        System.out.println(-1);
        continue;
      }

      int fill = n;
      for (int i = 0; i < n; i++) {
        ans[i] = fill;
        fill--;
      }

      for (int i = 0, j = n - 1; i < n; i++, j--) {
        if (s.charAt(i) == '0') {
          int temp = ans[j];
          ans[j] = ans[j - 1];
          ans[j - 1] = temp;
        }
      }

      for (int i = 0; i < n; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();

    }
    sc.close();
  }
}
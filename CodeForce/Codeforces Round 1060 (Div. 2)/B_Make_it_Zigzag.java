import java.util.*;

public class B_Make_it_Zigzag {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int[] prev = new int[n];
      prev[0] = arr[0];
      for (int i = 1; i < n; i++) {
        prev[i] = Math.max(arr[i], prev[i - 1]);
      }

      long ans = 0;
      for (int i = 0; i < n; i += 2) {
        int diff = -1;
        if (i > 0) {
          diff = Math.max(diff, arr[i] - prev[i - 1]);
        }
        if (i < n - 1) {
          diff = Math.max(diff, arr[i] - prev[i + 1]);
        }
        ans += diff + 1;
      }

      System.out.println(ans);

    }
    sc.close();
  }
}
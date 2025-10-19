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

      int max = arr[0];
      for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
          arr[i] = Math.max(max, arr[i]);
        }
      }

      int cnt = 0;
      for (int i = 1; i < n - 1; i++) {
        if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
          cnt++;
        }
      }

      System.out.println(cnt);

    }
    sc.close();
  }
}
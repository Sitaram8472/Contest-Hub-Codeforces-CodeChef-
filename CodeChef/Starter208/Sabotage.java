import java.util.*;

public class Sabotage {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int k = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      Arrays.sort(arr);
      int cnt = 1;
      int f = x + (k * 100);

      for (int i = n - k - 1; i >= 0; i--) {
        if (arr[i] > f) {
          cnt++;
        } else {
          break;
        }
      }
      System.out.println(cnt);
    }
    sc.close();
  }
}
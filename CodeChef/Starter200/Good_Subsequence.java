import java.util.*;

public class Good_Subsequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      if (n == 1) {
        System.out.println(1);
        continue;
      }
      int cnt = 0;
      int next = -1;
      for (int i = 0; i < n; i++) {
        if (arr[i] % 2 != next) {
          cnt++;
          next = arr[i]%2;
        }
      }
      System.out.println(cnt);
    }
    sc.close();
  }

}

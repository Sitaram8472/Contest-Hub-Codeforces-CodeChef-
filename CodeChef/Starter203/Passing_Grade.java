import java.util.*;

public class Passing_Grade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int cnt = 0;
      for (int i = 0; i < n; i++) {
        if (arr[i] >= arr[0]) {
          cnt++;
        }
      }
      System.out.println(cnt);
    }
    sc.close();
  }

}

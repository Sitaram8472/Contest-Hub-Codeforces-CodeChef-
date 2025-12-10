import java.util.*;

public class Best_Seats {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }
      int ans = 1000000;

      for (int i = 0; i < n - 1; i++) {
        int curr = num[i] + num[i + 1];
        ans = Math.min(ans, curr);
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
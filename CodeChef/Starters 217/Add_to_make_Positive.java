import java.util.*;

public class Add_to_make_Positive {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      int ans = 0;
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        ans += num[i];
      }
      if (ans >= 0) {
        System.out.println(0);
      } else {
        int x = (-ans + n - 1) / n;
        System.out.println(x);

      }

    }
    sc.close();
  }
}
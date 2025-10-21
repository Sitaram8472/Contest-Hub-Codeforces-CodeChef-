import java.util.*;

public class B_Square_Pool {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int s = sc.nextInt();
      int ans = 0;

      for (int i = 0; i < n; i++) {
        int dxi = sc.nextInt();
        int dyi = sc.nextInt();
        int xi = sc.nextInt();
        int yi = sc.nextInt();

        if (dxi == dyi) {
          ans += (xi == yi) ? 1 : 0;
        } else {
          ans += (xi + yi == s) ? 1 : 0;
        }
      }

      System.out.println(ans);
    }
    sc.close();
  }
}

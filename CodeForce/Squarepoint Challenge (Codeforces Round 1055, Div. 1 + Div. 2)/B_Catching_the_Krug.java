import java.util.*;

public class B_Catching_the_Krug {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int rk = sc.nextInt();
      int ck = sc.nextInt();
      int rd = sc.nextInt();
      int cd = sc.nextInt();

      int ans = 0;

      if (rd > rk) {
        ans = Math.max(ans, rd);
      } else if (rd < rk) {
        ans = Math.max(ans, n - rd);
      }

      if (cd > ck) {
        ans = Math.max(ans, cd);
      } else if (cd < ck) {
        ans = Math.max(ans, n - cd);
      }

      System.out.println(ans);
    }
    sc.close();
  }
}
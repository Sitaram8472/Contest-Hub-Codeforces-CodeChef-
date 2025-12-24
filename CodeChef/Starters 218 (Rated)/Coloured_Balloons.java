import java.util.*;

public class Coloured_Balloons {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        num[i] = sc.nextInt();
      }
      int ans = 0;

      for (int i = 1; i <= n; i++) {
        ans += (i * num[i]);
      }
      System.out.println(ans);

    }
    sc.close();
  }
}
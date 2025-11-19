import java.util.*;

public class EXML_Race {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int ans = 0;
      int cnt = 0;
      for (int i = 1; i <= n; i++) {
        int di = sc.nextInt();
        int ti = sc.nextInt();
        int res = di / ti;
        if (i == 1) {
          ans = res;
          cnt = i;

        } else {
          if (res > ans) {
            cnt = i;
            ans = res;
          }
        }

      }
      System.out.println(cnt);
    }

    sc.close();
  }
}
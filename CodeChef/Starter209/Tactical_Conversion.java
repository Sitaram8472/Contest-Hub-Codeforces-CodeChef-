import java.util.*;

public class Tactical_Conversion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int one = 0;
      int zero = 0;

      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '1') {
          one++;
        } else {
          zero++;
        }
      }

      if (one == n) {
        System.out.println("No");
      } else if (s.charAt(n - 2) == '1' && s.charAt(n - 1) == '1' && zero == n - one) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }

    }
    sc.close();
  }
}
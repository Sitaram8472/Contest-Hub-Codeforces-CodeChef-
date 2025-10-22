import java.util.*;

public class q1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int one = 0;
      int space = 0;
      int cur = 0;

      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '1') {
          one++;
          cur++;
        } else {
          space = Math.max(space, cur);
          cur = 0;
        }
      }
      space = Math.max(space, cur);

      if (one == 0 || space >= 2 * space - 1) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

    sc.close();
  }
}

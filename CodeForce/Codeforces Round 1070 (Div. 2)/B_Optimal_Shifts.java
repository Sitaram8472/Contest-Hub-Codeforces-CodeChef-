import java.util.*;

public class B_Optimal_Shifts {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      String s = sc.next();
      int last = -1;
      int ans = 0;
      for (int i = 0; i < 2 * n; i++) {
        char ch = s.charAt(i % n);
        if (ch == '1') {
          last = i;
        } else {
          ans = Math.max(ans, i - last);
        }
      }
      System.out.println(ans);

    }
    sc.close();
  }
}
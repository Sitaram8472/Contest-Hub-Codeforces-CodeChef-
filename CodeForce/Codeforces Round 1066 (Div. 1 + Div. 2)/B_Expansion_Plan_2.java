import java.util.*;

public class B_Expansion_Plan_2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      String s = sc.next();

      a = Math.abs(a);
      b = Math.abs(b);

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '8') {
          a = Math.max(a - 1, 0);
          b = Math.max(b - 1, 0);
        } else {
          if (a > b) {
            a = Math.max(a - 1, 0);
          } else {
            b = Math.max(b - 1, 0);
          }

        }
      }

      System.out.println(a <= 0 && b <= 0 ? "YES" : "NO");

    }
    sc.close();
  }
}
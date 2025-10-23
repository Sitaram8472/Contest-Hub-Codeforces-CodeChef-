import java.util.*;

public class Tactical_Conversion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int start = -1;
      int end = -1;
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '1') {
          start = i;
          break;
        }
      }
      for (int i = n - 1; i >= 0; i--) {
        if (s.charAt(i) == '1') {
          end = i;
          break;
        }
      }

      if (start == -1) {
        System.out.println("YES");
        continue;
      }
      boolean ok = false;
      for (int i = start; i <= end; i++) {
        if (s.charAt(i) == '0') {
          ok = true;
          break;
        }
      }

      if (ok) {
        System.out.println("YES");
      } else {
        int k = end - start + 1;
        if (k == 2 || k == 3) {
          System.out.println("No");
        } else {
          System.out.println("Yes");
        }

      }

    }
    sc.close();
  }
}
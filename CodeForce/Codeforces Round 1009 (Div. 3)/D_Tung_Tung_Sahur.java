import java.util.*;

public class D_Tung_Tung_Sahur {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String p = sc.next();
      String s = sc.next();

      int i = 0, j = 0;
      int n = p.length(), m = s.length();
      boolean valid = true;

      while (i < n && j < m) {
        char ch = p.charAt(i);

        int cnt1 = 0;
        while (i + cnt1 < n && p.charAt(i + cnt1) == ch) {
          cnt1++;
        }

        int cnt2 = 0;
        while (j + cnt2 < m && s.charAt(j + cnt2) == ch) {
          cnt2++;
        }

        if (cnt2 < cnt1 || cnt2 > 2 * cnt1) {
          valid = false;
          break;
        }

        i += cnt1;
        j += cnt2;
      }

      if (i == n && j == m && valid) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}

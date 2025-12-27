import java.util.*;

public class A_Yes_or_Yes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int y = 0;
      int n = 0;
      for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch == 'Y') {
          y++;
        } else {
          n++;
        }
      }

      if (y <= 1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }
    sc.close();
  }
}

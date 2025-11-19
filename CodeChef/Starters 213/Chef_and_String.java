import java.util.*;

public class Chef_and_String {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long k = sc.nextLong();
      String s = sc.next();

      long cnt = 0;

      for (int i = 0; i < n - 1; i++) {
        char a = s.charAt(i);
        char b = s.charAt(i + 1);

        if (a == b) {
          cnt++;
        }
      }
      long a = 0;
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == 'I') {
          a++;
        }
      }

      if (s.charAt(0) == s.charAt(n - 1)) {
        cnt++;
      }

      long ans = cnt * k + (a * (k - 1));
      System.out.println(ans);
    }
    sc.close();
  }
}

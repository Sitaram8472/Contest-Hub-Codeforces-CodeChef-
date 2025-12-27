import java.util.*;

public class B_Impost_or_Sus {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = s.length();

      char[] split = s.toCharArray();
      int cnt = 0;

      if (s.charAt(0) != 's') {
        cnt++;
        split[0] = 's';
      }

      if (s.charAt(n - 1) != 's') {
        cnt++;
        split[n - 1] = 's';
      }
      
      for (int i = 1; i < n - 1; i++) {
        if (split[i] == 'u') {
          if (split[i - 1] != 's') {
            cnt++;
            split[i - 1] = 's';
          }
          if (split[i + 1] != 's') {
            cnt++;
            split[i + 1] = 's';
          }
        }
      }

      System.out.println(cnt);
    }
    sc.close();
  }
}
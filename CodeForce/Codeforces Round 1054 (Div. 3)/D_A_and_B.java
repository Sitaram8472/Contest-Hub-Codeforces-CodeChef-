import java.util.*;

public class D_A_and_B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int cnt = 1;

      for (int i = 0; i < n - 1; i++) {
        if (s.charAt(i) != s.charAt(i + 1)) {
          cnt++;
        }
      }
      System.out.println(cnt / 3);
    }
    sc.close();
  }
}
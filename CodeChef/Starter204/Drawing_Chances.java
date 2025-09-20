import java.util.*;

public class Drawing_Chances {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      String s = sc.next();

      int alice = 0;
      for (char c : s.toCharArray()) {
        if (c == '1')
          alice++;
      }
      int bob = m - alice;
      int remaining = n - m;

      int diff = Math.abs(alice - bob);

      if (diff <= remaining && (remaining - diff) % 2 == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }
    sc.close();
  }
}

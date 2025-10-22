import java.util.*;

public class Divisible_Duel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      int e = 0, o = 0;

      for (int i = x; i <= y; i++) {
        if (i % x == 0) {
          if (i % 2 == 0) {
            e += i;
          } else {
            o += i;
          }
        }
      }

      if (e >= o) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    sc.close();
  }
}

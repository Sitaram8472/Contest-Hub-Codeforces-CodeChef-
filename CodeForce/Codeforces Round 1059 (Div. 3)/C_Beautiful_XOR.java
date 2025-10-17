import java.util.*;

public class C_Beautiful_XOR {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      if (a == b) {
        System.out.println(0);
        continue;
      }

      int x = a ^ b;

      if (x <= a) {
        System.out.println(1);
        System.out.println(x);
      } else {
        int x1 = 0;
        for (int i = 30; i >= 0; i--) {
          if ((a & (1 << i)) != 0) {
            x1 = (1 << i) - 1;
            break;
          }
        }
        int x2 = x ^ x1;

        if (x1 <= a && x2 <= (a ^ x1)) {
          System.out.println(2);
          System.out.println(x1 + " " + x2);
        } else {
          System.out.println(-1);
        }
      }
    }
    sc.close();
  }
}

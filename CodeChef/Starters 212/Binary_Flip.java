import java.util.*;

public class Binary_Flip {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      String b = sc.next();

      int c0 = 0;
      int c1 = 0;

      for (int i = 0; i < n - 1; i++) {
        if (b.charAt(i) == '0' && b.charAt(i + 1) == '0') {
          c0++;
        } else if (b.charAt(i) == '1' && b.charAt(i + 1) == '1') {
          c1++;
        }
      }

      if (c1 >= c0) {
        System.out.println(0);
      } else {
        int diff = c0 - c1;
        int f = (diff + 1) / 2;
        System.out.println(f);
      }
    }

    sc.close();
  }
}

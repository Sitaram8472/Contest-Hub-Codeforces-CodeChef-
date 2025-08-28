import java.util.*;

public class A_In_the_Dream {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();

      boolean one = Math.max(a, b) <= 2 * Math.min(a, b) + 2;
      boolean two = Math.max(c - a, d - b) <= 2 * Math.min(c - a, d - b) + 2;

      if (one && two) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}

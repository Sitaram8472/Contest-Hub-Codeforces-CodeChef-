import java.util.*;

public class A_Square_of_Rectangles {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int l1 = sc.nextInt();
      int b1 = sc.nextInt();
      int l2 = sc.nextInt();
      int b2 = sc.nextInt();
      int l3 = sc.nextInt();
      int b3 = sc.nextInt();

      if (l1 + l2 + l3 == b1 && b1 == b2 && b2 == b3) {
        System.out.println("YES");
      } else if (l2 + l3 == l1 && b2 == b3 && b1 + b2 == l1) {
        System.out.println("YES");
      } else if (b1 + b2 + b3 == l1 && l1 == l2 && l2 == l3) {
        System.out.println("YES");
      } else if (b3 + b2 == b1 && l2 == l3 && l1 + l2 == b1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
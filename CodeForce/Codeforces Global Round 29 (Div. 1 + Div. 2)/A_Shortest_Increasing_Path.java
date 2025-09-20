import java.util.*;

public class A_Shortest_Increasing_Path {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long x = sc.nextLong();
      long y = sc.nextLong();

      long diff = x - y;

      if (x == y || y == 1) {
        System.out.println(-1);
      } else if (diff == 1 && x > y) {
        System.out.println(-1);
      } else if (x < y) {
        System.out.println(2);
      } else if (x > y) {
        System.out.println(3);
      }

    }
  }

}

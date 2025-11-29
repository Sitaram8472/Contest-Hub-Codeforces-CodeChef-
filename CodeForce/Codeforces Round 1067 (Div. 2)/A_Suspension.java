import java.util.*;

public class A_Suspension {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      int ans = (x / 2) + y;
      System.out.println(Math.min(ans, n));

    }
    sc.close();
  }
}

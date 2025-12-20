import java.util.*;

public class A_Carnival_Wheel {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int l = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      int ans = a;
      for (int i = 0; i < l; i++) {
        a = (a + b) % l;
        ans = Math.max(ans, a);

      }
      System.out.println(ans);

    }
    sc.close();
  }
}

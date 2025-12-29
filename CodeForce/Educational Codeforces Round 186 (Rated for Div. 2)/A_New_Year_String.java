import java.util.*;

public class A_New_Year_String {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      boolean ans = s.contains("2026");
      boolean ans2 = s.contains("2025");

      if (ans || !ans2) {
        System.out.println(0);
      } else {
        System.out.println(1);
      }

    }
    sc.close();
  }
}
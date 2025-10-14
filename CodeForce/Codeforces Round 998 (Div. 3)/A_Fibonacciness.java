import java.util.*;

public class A_Fibonacciness {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a1 = sc.nextInt();
      int a2 = sc.nextInt();
      int a4 = sc.nextInt();
      int a5 = sc.nextInt();

      int[] f = { a1 + a2, a4 - a2, a5 - a4 };
      int ans = 0;

      for (int a3 : f) {
        int cnt = 0;
        if (a3 == a1 + a2)
          cnt++;
        if (a4 == a3 + a2)
          cnt++;
        if (a5 == a4 + a3)
          cnt++;

        ans = Math.max(ans, cnt);

      }
      System.out.println(ans);
    }
    sc.close();
  }
}
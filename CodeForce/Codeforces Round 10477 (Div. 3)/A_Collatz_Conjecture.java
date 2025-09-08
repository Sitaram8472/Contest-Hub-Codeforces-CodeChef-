import java.util.*;

public class A_Collatz_Conjecture {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int k = sc.nextInt();
      int x = sc.nextInt();

      long ans = x;
      for (int i = 0; i < k; i++) {
        ans *= 2;
      }

      System.out.println(ans);
    }

    sc.close();
  }
}

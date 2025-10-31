import java.util.*;

public class Profits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int p = 0;
      for (int i = x; i <= n; i++) {
        p += (i - x);
      }
      System.out.println(p);

    }
    sc.close();
  }
}
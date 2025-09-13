import java.util.*;

public class B_Lasers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      long x = sc.nextLong();
      long y = sc.nextLong();

      int a[] = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int b[] = new int[m];
      for (int i = 0; i < m; i++) {
        b[i] = sc.nextInt();
      }

      System.out.println(n + m);
    }
    sc.close();
  }
}
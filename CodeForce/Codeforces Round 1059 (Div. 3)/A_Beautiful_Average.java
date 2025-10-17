import java.util.*;

public class A_Beautiful_Average {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int max = a[0];
      for (int i = 1; i < n; i++) {
        max = Math.max(max, a[i]);
      }

      System.out.println(max);
    }
    sc.close();
  }
}

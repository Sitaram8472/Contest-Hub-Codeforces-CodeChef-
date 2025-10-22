import java.util.*;

public class Small_GCD_Sort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      List<int[]> lists = new ArrayList<>();
      for (int i = 1; i <= n; i++) {
        lists.add(new int[] { i, gcd(i, n) });
      }

      Collections.sort(lists, (a, b) -> a[1] == b[1] ? a[0] - b[0] : b[1] - a[1]);

      for (int[] p : lists)
        System.out.print(p[0] + " ");
      System.out.println();
    }
    sc.close();
  }

  static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}

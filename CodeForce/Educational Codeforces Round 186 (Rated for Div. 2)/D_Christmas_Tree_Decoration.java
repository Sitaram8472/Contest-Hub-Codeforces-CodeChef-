import java.util.*;

public class D_Christmas_Tree_Decoration {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {

      int n = sc.nextInt();

      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }

      int[] b = new int[n];
      for (int i = 0; i < n; i++) {
        b[i] = sc.nextInt();
      }

      int[] c = new int[n];
      for (int i = 0; i < n; i++) {
        c[i] = sc.nextInt();
      }

      long valid_A = way(a, b);
      long valid_B = way(b, c);

      System.out.println(valid_A * valid_B * n);
    }

    sc.close();
  }

  static long way(int[] a, int[] b) {
    long way = 0;
    int n = a.length;

    for (int i = 0; i < n; i++) {
      boolean ok = true;
      for (int j = 0; j < n; j++) {
        if (a[j] >= b[(i + j) % n]) {
          ok = false;
          break;
        }
      }
      if (ok) {
        way++;
      }
    }
    return way;
  }
}

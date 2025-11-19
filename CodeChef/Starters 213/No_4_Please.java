import java.util.*;

public class No_4_Please {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] f = new int[4];
      for (int i = 0; i < n; i++) {
        int x = sc.nextInt();
        f[x]++;
      }

      int c1 = f[1];
      int c2 = f[2];
      int c3 = f[3];

      int d3 = Math.min(c1, c3);
      int d2 = Math.max(0, c2 - 1);
      System.out.println(d3 + d2);
    }

    sc.close();
  }
}

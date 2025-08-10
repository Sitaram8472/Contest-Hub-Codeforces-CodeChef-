import java.util.*;

public class code4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[][] ans = new int[n][3];

      for (int i = 0; i < n; i++) {
        int li = sc.nextInt();
        int ri = sc.nextInt();
        int real = sc.nextInt();

        ans[i][0] = li;
        ans[i][1] = ri;
        ans[i][2] = real;
      }

      // Arrays.sort(ans, (x, y) -> Integer.compare(x[0], y[0])); // both are same 
      Arrays.sort(ans, Comparator.comparingDouble(o ->o[0]));

      int max = k;

      for (int i = 0; i < n; i++) {
        int li = ans[i][0];
        int ri = ans[i][1];
        int real = ans[i][2];

        if (li <= max && max <= ri) {
          max = Math.max(max, real);
        }
      }

      System.out.println(max);

    }

    sc.close();
  }
}

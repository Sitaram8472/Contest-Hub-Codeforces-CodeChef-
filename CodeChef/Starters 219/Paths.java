import java.util.*;

public class Paths {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();

      if (n <= 2) {
        System.out.println("-1");
        continue;
      }

      int[][] path = new int[n][n];

      for (int a = n - 3, b = 0; b < n; b++) {
        path[a][b] = 1;
      }

      for (int a = n - 2; a < n; a++) {
        for (int b = n - 2; b < n; b++) {
          path[a][b] = 1;
        }
      }

      for (int a = 0; a < n - 2; a++) {
        path[a][0] = 1;
      }

      for (int a = 0; a < n; a++) {
        for (int b = 0; b < n; b++) {
          System.out.print(path[a][b] + " ");
        }
        System.out.println();
      }
    }

    sc.close();
  }
}

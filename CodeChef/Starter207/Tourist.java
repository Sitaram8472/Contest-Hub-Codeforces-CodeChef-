import java.util.*;

public class Tourist {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();

      int mindis = Integer.MAX_VALUE;

      for (int i = 0; i < n; i++) {
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int dist = Math.abs(A - X) + Math.abs(B - Y);

        mindis = Math.min(mindis, dist);
      }

      System.out.println(mindis);
    }

    sc.close();
  }
}

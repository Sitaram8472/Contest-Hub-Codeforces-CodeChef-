
import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int[] a = new int[n];
      int[] b = new int[n];

      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      for (int i = 0; i < n; i++) {
        b[i] = sc.nextInt();
      }

      long iterations = 0;
      for (int i = 0; i < n; i++) {
        if (a[i] > b[i]) {
          iterations += (a[i] - b[i]);
        }
      }

      System.out.println(iterations+1);

    }
  }
}

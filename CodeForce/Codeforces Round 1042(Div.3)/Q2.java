import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();


      if ((n & 1) == 1) {
        for (int j = 0; j < n; j++) {
          if ((j & 1) == 0) {
            System.out.print(-1 + " ");
          } else {
            System.out.print(3 + " ");
          }
        }
      } else {
        for (int i = 0; i < n - 1; i++) {
          if ((i & 1) == 0) {
            System.out.print(-1 + " ");
          } else {
            System.out.print(3 + " ");
          }
        }
        System.out.println(2);
      }

      System.out.println();
    }

  }
}

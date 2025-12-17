import java.util.*;

public class Add_1_or_3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      if (n > m) {
        System.out.println("no");
      } else if (n == m) {
        System.out.println("yes");
      } else {

        int total3 = m / 3;
        int rem3 = m % 3;
        int left = n - (total3 + rem3);

        if (left >= 0 && left % 2 == 0) {
          if ((left / 2) <= total3) {
            System.out.println("yes");
          } else {
            System.out.println("no");
          }
        } else {
          System.out.println("no");
        }

      }

    }
    sc.close();
  }
}
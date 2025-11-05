import java.util.*;

public class D_Deleting_Divisors {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      if (n % 2 == 1) {
        System.out.println("Bob");
        continue;
      }

      int cnt = 0;
      while (n % 2 == 0) {
        n /= 2;
        cnt++;
      }
      if (n > 1) {
        System.out.println("Alice");
      } else if (cnt % 2 == 0) {
        System.out.println("Alice");
      } else {
        System.out.println("Bob");
      }

    }
    sc.close();
  }
}
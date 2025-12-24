import java.util.*;

public class Collatz_Conjecture_Easy {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      Long n = sc.nextLong();

      if ((n & (n - 1)) == 0) {
        System.out.println("Yes");
      } else if (n < 5 || n == 6) {
        System.out.println("Yes");
      } else if (n % 4 == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }
    sc.close();
  }
}
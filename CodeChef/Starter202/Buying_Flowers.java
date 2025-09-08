import java.util.*;

public class Buying_Flowers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      if (n == 2) {
        System.out.println(4);
        continue;
      }

      int div = n / 3;
      int rem = n % 3;

      if (rem == 0) {
        System.out.println(5 * div);
      } else if (rem == 1) {

        System.out.println(5 * (div - 1) + 8);
      } else {
        System.out.println(5 * div + 4);
      }
    }
    sc.close();
  }
}

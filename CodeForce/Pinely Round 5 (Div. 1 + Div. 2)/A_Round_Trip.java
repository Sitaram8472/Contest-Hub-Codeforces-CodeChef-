import java.util.*;

public class A_Round_Trip {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      long r = sc.nextLong();
      long x = sc.nextLong();
      long d = sc.nextLong();
      int n = sc.nextInt();
      String s = sc.next();

      long rating = r;
      int count = 0;

      for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        if (c == '1') {
          count++;
          rating = Math.max(0, rating - d);
        } else {
          if (rating < x) {
            count++;
            rating = Math.max(0, rating - d);
          }

        }
      }

      System.out.println(count);
    }
    sc.close();
  }
}

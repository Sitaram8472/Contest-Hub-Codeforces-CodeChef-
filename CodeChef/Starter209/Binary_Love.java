import java.util.*;

public class Binary_Love {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int c01 = 0;
      int c10 = 0;

      for (int i = 0; i < n - 1; i++) {
        if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
          c01++;
        } else if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') {
          c10++;
        }
      }

      if (c01 == 0 || c10 == 0) {
        System.out.println("Bob");
        continue;
      }
      System.out.println("Alice");
    }
    sc.close();
  }
}
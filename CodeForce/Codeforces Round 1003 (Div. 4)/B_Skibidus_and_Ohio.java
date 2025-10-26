import java.util.*;

public class B_Skibidus_and_Ohio {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();

      if (s.length() == 1) {
        System.out.println(1);
        continue;
      }

      boolean found = false;
      for (int i = s.length() - 1; i > 0; i--) {
        if (s.charAt(i) == s.charAt(i - 1)) {
          found = true;
          break;
        }
      }

      System.out.println(found ? 1 : s.length());
    }
    sc.close();
  }
}
import java.util.*;

public class B_Skibidus_and_Ohio {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      StringBuilder sb = new StringBuilder(s);

      for (int i = 0; i < s.length(); i++) {
        if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == s.charAt(i)) {
          sb.delete(sb.length() - 1, sb.length());
        } else {
          sb.append(s.charAt(i));
        }

      }
      if (sb.isEmpty()) {
        System.out.println(1);
        continue;
      }
      System.out.println(sb.length());
    }
    sc.close();
  }
}
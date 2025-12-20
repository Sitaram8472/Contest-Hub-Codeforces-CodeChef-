import java.util.*;

public class B_Ashmal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String[] num = new String[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.next();
      }

      StringBuilder sb = new StringBuilder(num[0]);
      for (int i = 1; i < n; i++) {
        String first = sb.toString() + num[i];
        String second = num[i] + sb.toString();
        if (first.compareTo(second) < 0) {
          sb.append(num[i]);
        } else {
          sb = new StringBuilder(num[i] + sb.toString());
        }
      }
      System.out.println(sb.toString());

    }
    sc.close();
  }
}
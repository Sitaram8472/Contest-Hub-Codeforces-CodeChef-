import java.util.*;

public class Stop_The_Count {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int one = 0;
      int way = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '1') {
          one++;
        }

        int curr = i + 1;
        if (2 * one > curr) {
          way++;
        }

      }
      System.out.println(way);

    }
    sc.close();
  }
}
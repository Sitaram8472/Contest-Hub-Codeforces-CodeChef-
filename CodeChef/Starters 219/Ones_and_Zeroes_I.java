import java.util.*;

public class Ones_and_Zeroes_I {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int good = 0;
      int bal = 0;
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '1') {
          bal++;
        } else {
          bal--;
        }
        if (bal >= 0) {
          good++;
        }
      }
      System.out.println(good);

    }
    sc.close();
  }
}
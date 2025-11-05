import java.util.*;

public class Wolf_Down {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int zero = 0;
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '0') {
          zero++;
        } else {
          break;
        }
      }
      System.out.println(zero);

    }
    sc.close();
  }
}
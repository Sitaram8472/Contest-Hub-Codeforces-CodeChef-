import java.util.*;

public class Buying_Chairs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int w = sc.nextInt();
      int p = sc.nextInt();
      int k = sc.nextInt();

      if (k <= w) {
        System.out.println(k * 2);
      } else {
        int rest = k - w;
        System.out.println(w * 2 + rest);
      }

    }
    sc.close();
  }
}
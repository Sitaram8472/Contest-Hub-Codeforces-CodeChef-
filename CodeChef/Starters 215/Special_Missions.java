import java.util.*;

public class Special_Missions {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int c = sc.nextInt();

      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }
      String s = sc.next();

      int profit = 0;
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '0') {
          profit += num[i];
        }
      }
      int profit2 = 0;
      for (int i = 0; i < n; i++) {
        if (s.charAt(i) == '1') {
          profit2 += num[i];
        }
      }

      if (profit >= c && profit - c + profit2 > profit) {
        System.out.println(profit + profit2 - c);
      } else {
        System.out.println(profit);
      }
    }
    sc.close();
  }
}
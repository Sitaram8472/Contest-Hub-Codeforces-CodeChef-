import java.util.*;

public class Differing_Values {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();

      int cnt0 = 0, cnt1 = 0;
      for (char c : s.toCharArray()) {
        if (c == '0') {
          cnt0++;
        } else {
          cnt1++;
        }
      }

      int end = n / k;
      int more = n % k;
      int toatl = 0;

      for (int i = 0; i < more; i++) {
        toatl += (end + 2) / 2;
      }

      for (int i = 0; i < k - more; i++) {
        toatl += (end + 1) / 2;
      }

      System.out.println(cnt0 <= toatl && cnt1 <= toatl ? "Yes" : "No");

    }

    sc.close();
  }
}

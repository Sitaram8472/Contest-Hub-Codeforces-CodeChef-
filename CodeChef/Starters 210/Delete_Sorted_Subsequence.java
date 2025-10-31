import java.util.*;

public class Delete_Sorted_Subsequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      if (n == 0) {
        System.out.println(0);
        continue;
      }
      int ans = 1;
      for (int i = 1; i < n; i++) {
        if (s.charAt(i - 1) == '1' && s.charAt(i) == '0')
          ans++;
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
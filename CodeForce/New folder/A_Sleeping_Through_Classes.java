import java.util.*;

public class A_Sleeping_Through_Classes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();
      int ans = 0;

      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != '1') {
          ans++;
        } else {
         i = i+k;
        }
      }
      System.out.println(ans);

    }
    sc.close();
  }
}
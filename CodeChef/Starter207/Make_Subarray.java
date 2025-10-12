import java.util.*;

public class Make_Subarray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String str = sc.next();

      String[] ans = new String[str.length()];
      for (int i = 0; i < str.length(); i++) {
        ans[i] = String.valueOf(str.charAt(i));
      }

      int start = 0;
      int end = 0;

      for (int i = 0; i < ans.length; i++) {
        if (ans[i].equals("0"))
          continue;
        start = i;
        break;
      }

      for (int i = ans.length - 1; i >= 0; i--) {
        if (ans[i].equals("0"))
          continue;
        end = i;
        break;
      }

      int res = 0;
      for (int i = start; i < end; i++) {
        if (ans[i].equals("0")) {
          res++;
        }
      }

      System.out.println(res);
    }
    sc.close();
  }
}

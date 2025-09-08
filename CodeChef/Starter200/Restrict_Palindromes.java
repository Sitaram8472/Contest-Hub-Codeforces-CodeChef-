import java.util.*;

public class Restrict_Palindromes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String newstr = "abcde";
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < n; i++) {
        sb.append(newstr.charAt(i % 5));
      }

      System.out.println(sb.toString());
    }
    sc.close();
  }
}

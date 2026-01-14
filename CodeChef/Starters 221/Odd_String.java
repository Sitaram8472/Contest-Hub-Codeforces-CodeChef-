import java.util.*;

public class Odd_String {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      int[] freq = new int[26];
      boolean ok = true;

      for (char ch : s.toCharArray()) {
        freq[ch - 'a']++;
        if (freq[ch - 'a'] > 2) {
          ok = false;
          break;
        }
      }

      System.out.println(ok ? "YES" : "NO");
    }
    sc.close();
  }
}

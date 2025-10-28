import java.util.*;

public class B_Your_Name {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = sc.nextInt();

    while (q-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      String t = sc.next();

      char[] sArr = s.toCharArray();
      char[] tArr = t.toCharArray();

      Arrays.sort(sArr);
      Arrays.sort(tArr);

      if (Arrays.equals(sArr, tArr)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }

    sc.close();
  }
}

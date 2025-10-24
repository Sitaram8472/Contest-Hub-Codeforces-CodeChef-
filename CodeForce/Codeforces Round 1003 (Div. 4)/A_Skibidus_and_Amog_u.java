import java.util.*;

public class A_Skibidus_and_Amog_u {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();

      StringBuilder sb = new StringBuilder(s);
      sb.delete(sb.length() - 2, sb.length());
      sb.append('i');
      System.out.println(sb.toString());
    }
    sc.close();
  }
}

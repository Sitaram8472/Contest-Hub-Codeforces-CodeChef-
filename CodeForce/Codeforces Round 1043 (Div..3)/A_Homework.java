import java.util.*;

public class A_Homework {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String a = sc.next();

      int n2 = sc.nextInt();
      String b = sc.next();
      String c = sc.next();

      StringBuilder sb = new StringBuilder();
      sb.append(a);

      for (int i = 0; i < n2; i++) {
        char ch = b.charAt(i);
        if(c.charAt(i) == 'D'){
          sb.append(ch);
        } else {
          sb.insert(0, ch);
        }
      }
      System.out.println(sb.toString());
    }
    sc.close();
  }
}
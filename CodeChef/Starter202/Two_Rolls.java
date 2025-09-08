import java.util.*;

public class Two_Rolls {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      int req = 50-x;
      if (req >= 2 * y && req <= 2 * y + 10) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    sc.close();
  }
}
import java.util.*;

public class Scoring {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();

      int y = sc.nextInt();
      int a = (x + y) / 2;
      int b = (y - x) / 2;
      System.out.println(a + " " + b);

    }
    sc.close();
  }
}
import java.util.*;

public class Chocolate_Eating {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(a == b ? a + b - 1 : a + b);

    }
    sc.close();
  }
}
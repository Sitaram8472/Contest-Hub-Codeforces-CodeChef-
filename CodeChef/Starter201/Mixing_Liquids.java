import java.util.*;

public class Mixing_Liquids {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      int min = Math.min(a, b/2);
      System.out.println(min*3);
    }
    sc.close();
  }
}
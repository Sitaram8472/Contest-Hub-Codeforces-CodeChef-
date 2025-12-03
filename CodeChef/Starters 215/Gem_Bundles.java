import java.util.*;

public class Gem_Bundles {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int min = Math.min(a, Math.min(b, c));
      int ans = (a - min) + (b - min) + (c - min);
      System.out.println((min*10)+(ans*3));

    }
    sc.close();
  }
}
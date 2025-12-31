import java.util.*;

public class Pizza_Comparision {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      int small = 100 * b;
      int large = 225 * a;
      
      if (small > large) {
        System.out.println("Small");
      } else if (large > small) {
        System.out.println("Large");
      } else {
        System.out.println("Equal");
      }

    }
    sc.close();
  }
}
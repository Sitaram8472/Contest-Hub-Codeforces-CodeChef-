import java.util.*;

public class A_Binary_Array_Game {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();

      }

      System.out.println(num[0] == 0 && num[n - 1] == 0 ? "Bob" : "Alice");

    }
    sc.close();
  }
}

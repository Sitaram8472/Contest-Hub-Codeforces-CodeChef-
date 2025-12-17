import java.util.*;

public class Make_An_AP {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int gcd = 0;
      for (int i = 1; i < n; i++) {
        gcd = findgcd(num[i] - num[i - 1], gcd);
      }

      int total = (num[n - 1] - num[0]) / gcd;
      int totalnum = total - n + 1;
      System.out.println(totalnum);

    }

  }

  public static int findgcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

}
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C_Blackslex_and_Number_Theory {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        if (num[i] < min) {
          min = num[i];
        }
      }

      // int g = 0;
      // for (int i = 0; i < n; i++) {
      // if (num[i] != min) {
      // int diff = num[i] - min;
      // if (g == 0) {
      // g = diff;
      // } else {
      // g = gcd(g, diff);
      // }
      // }

      // }

      Arrays.sort(num);

      System.out.println(Math.max(num[0], num[1] - num[0]));

    }

  }

  // private static int gcd(int a, int b) {
  // return b == 0 ? a : gcd(b, a % b);
  // }
}

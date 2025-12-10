import java.util.*;

public class XOR_Equal_Subtract {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int max = 1;
      int j = 0;
      for (int i = 0; i < n - 1; i++) {

        if ((num[i] ^ num[i + 1]) == Math.abs(num[i] - num[i + 1])) {
          i++;
        } else {
          max = Math.max(j - i + 1, max);
          j = i;
        }

      }
      System.out.println(max);
    }
    sc.close();
  }
}
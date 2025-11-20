import java.util.*;

public class B_Yuu_Koito_and_Minimum_Absolute_Sum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }
      if (num[0] == -1) {
        num[0] = num[n - 1];
      } else if (num[n - 1] == -1) {
        num[n - 1] = num[0];
      }

      long cnt = 0;

      for (int i = 1; i < n; i++) {
        int gap = num[i] - num[i - 1];
        cnt += gap;
      }

      System.out.println(Math.abs(cnt));

      for (int i = 0; i < n; i++) {
        if (num[i] == -1) {
          System.out.print(0 + " ");
        } else {
          System.out.print(num[i] + " ");
        }
      }

      System.out.println();

    }
    sc.close();
  }
}
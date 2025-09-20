import java.util.*;

public class B_Multiple_Construction {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] ans = new int[n * 2];

      int j = 0;
      for (int i = n; i >= 1; i--) {
        ans[j] = i;
        j++;
      }

      ans[n] = n;
      int k = 1;
      for (int i = n + 1; i <= n * 2 - 1; i++) {
        ans[i] = k++;
      }

      for (int i = 0; i < n * 2; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}

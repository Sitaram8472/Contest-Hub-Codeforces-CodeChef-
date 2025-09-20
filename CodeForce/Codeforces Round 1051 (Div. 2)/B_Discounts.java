import java.util.*;

public class B_Discounts {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int[] discount = new int[k];
      for (int i = 0; i < k; i++) {
        discount[i] = sc.nextInt();
      }

      Arrays.sort(arr);
      Arrays.sort(discount);

      int idx = n - 1;
      long totalCost = 0;

      for (int i = 0; i < k; i++) {
        int curr = discount[i];
        for (int j = 0; j < curr; j++) {
          if (idx < 0)
            break;
          if (j == curr - 1) {
            idx--;
          } else {
            totalCost += arr[idx];
            idx--;
          }
        }
      }

      while (idx >= 0) {
        totalCost += arr[idx];
        idx--;
      }

      System.out.println(totalCost);
    }
    sc.close();
  }
}

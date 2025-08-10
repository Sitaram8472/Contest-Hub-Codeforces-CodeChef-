import java.util.Arrays;
import java.util.Scanner;

public class code {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int c = sc.nextInt();

      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      Arrays.sort(arr);
      int mul = 1;
      int coin = 0;

      for (int i = 0; i < n; i++) {
        if (arr[i] * mul <= c) {
          continue;
        } else {
          coin++;
          mul++;
        }
      }
      System.out.println(coin);

    }
  }
}

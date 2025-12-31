import java.util.*;

public class New_Operation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];

      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int[] arr2 = new int[n];
      for (int i = 0; i < n; i++) {
        arr2[i] = num[i];
      }

      for (int i = 1; i < n; i++) {
        num[i] = num[i - 1] + (2 * num[i]);
      }

      for (int i = n - 2; i >= 0; i--) {
        arr2[i] = arr2[i] + (2 * arr2[i + 1]);
      }

      System.out.println(num[n - 1] + " " + arr2[0]);
      
    }

    sc.close();
  }
}

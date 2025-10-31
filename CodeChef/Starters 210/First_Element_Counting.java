import java.util.*;

public class First_Element_Counting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }

      Arrays.sort(arr);
      long[] ans = new long[n];

      for (int i = 0; i < n; i++) {
        if (i == 0 || i == n - 1) {
          ans[i] = -1;
        } else {
          long left = (arr[i - 1] + arr[i] + 1) / 2;
          long right = (arr[i] + arr[i + 1]) / 2;
          ans[i] = Math.max(0, right - left );
        }
      }

      for (int i = 0; i < n; i++) {
        System.out.print(ans[i] + " ");
      }
      System.out.println();
    }

    sc.close();
  }
}

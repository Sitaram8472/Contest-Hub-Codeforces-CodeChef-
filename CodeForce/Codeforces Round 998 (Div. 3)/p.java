import java.util.*;

public class p {
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

      int s = 0;
      Arrays.sort(arr);
      int i = 0, j = n - 1;
      while (i < j) {
        if (arr[i] + arr[j] == k) {
          s++;
          i++;
          j--;
        } else if (arr[i] + arr[j] < k) {
          i++;
        } else {
          j--;
        }
      }

      System.out.println(s);
    }

    sc.close();
  }
}

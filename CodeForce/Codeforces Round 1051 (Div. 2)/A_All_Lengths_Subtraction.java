import java.util.*;

public class A_All_Lengths_Subtraction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      if (n <= 2) {
        System.out.println("yes");
        continue;
      }
      int i = 0;
      // while (i + 1 < n && arr[i] <= arr[i + 1]) {
      // i++;

      // }
      // while (i + 1 < n && arr[i] >= arr[i + 1]) {
      // i++;
      // }

      for (int j = 0; j < n - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          i = j;
          break;
        }
        i = j + 1;
      }

      for (int j = i; j < n - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          i = j;
          break;
        }
        i = j + 1;
      }

      if (i == n - 1) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
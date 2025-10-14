import java.util.*;

public class D_Subtract_Min_Sort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      boolean found = true;

      if(arr[1] < arr[0]){
        System.out.println("NO");
        continue;
      }

      for (int i = 1; i < n - 1; i++) {
        arr[i] -= arr[i - 1];
        if (arr[i] > arr[i + 1]) {
          found = false;
          break;
        }
      }
      if (found) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }
}
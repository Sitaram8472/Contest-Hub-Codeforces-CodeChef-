import java.util.*;

public class If_Only_I_Could_Read {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int l = 0;
      int r = 0;
      for (int i = 0; i < n-1; i++) {
        if (arr[i] > arr[i + 1]) {
          l = i + 1;
          r = i + 2;
          break;
        }
      }
      if (r != 0) {
        System.out.println(l + " " + r);
      } else {
        System.out.println(-1);
      }
    }
    sc.close();
  }
}
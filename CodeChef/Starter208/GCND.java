import java.util.*;

public class GCND {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      Arrays.sort(arr);

      int big = arr[n - 1];
      int copy = big;
      int small = arr[0];

      while (big > 0) {
        if (copy % big != 0 && small % big != 0) {
          System.out.println(big);
          break;
        }
        big--;
      }

    }
    sc.close();
  }
}
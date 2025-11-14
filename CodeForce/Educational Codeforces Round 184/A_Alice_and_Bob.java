import java.util.*;

public class A_Alice_and_Bob {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int l = -1;
      int r = -1;
      int i = 0;

      while (i < n) {
        if (k > num[i]) {
          l++;
        }
        i++;
      }
      int j = n - 1;
      while (j >= 0) {
        if (k < num[j]) {
          r++;
        }
        j--;
      }

      if (l >= r) {
        System.out.println(k - 1);
      } else {
        System.out.println(k + 1);
      }

    }
    sc.close();
  }
}

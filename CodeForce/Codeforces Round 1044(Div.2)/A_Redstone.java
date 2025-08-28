import java.util.*;

public class A_Redstone {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int[] freq = new int[101];
      for (int i = 0; i < n; i++) {
        freq[arr[i]]++;
      }

      boolean found = (n == 1);
      for (int i = 0; i < 101; i++) {
        if (freq[i] >= 2) {
          found = true;
          break;
        }
      }

      if (found) {
        System.out.println("Yes");
      } else {
        System.out.println("NO");
      }
    }
    sc.close();
  }

}

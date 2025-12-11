import java.util.*;

public class A_Operations_with_Inversions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int ans = 0;
      for (int i = 0; i < n; i++) {
        boolean found = false;
        for (int j = 0; j < i; j++) {
          if (num[i] < num[j]) {
            found = true;
            break;
          }
        }
        if (found) {
          ans++;
        }
      }
      System.out.println(ans);
    }
    sc.close();
  }
}

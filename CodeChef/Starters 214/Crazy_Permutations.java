import java.util.*;

public class Crazy_Permutations {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      int[] num2 = new int[n];
      for (int i = 0; i < n; i++) {
        num2[i] = sc.nextInt();
      }

      boolean found = true;
      for (int i = 0; i < n; i++) {
        if (num[i] != num2[i]) {
          found = false;
          break;
        }
      }

      if (found) {
        System.out.println("Yes");
        continue;
      }

      boolean flag = true;

      for (int i = 0; i < n - 1; i++) {
        if (num[i] - num[i + 1] > 0 && num2[i] - num2[i + 1] < 0) {
          flag = false;
        }
      }
      for (int i = 0; i < n - 1; i++) {
        if (num[i] - num[i + 1] < 0 && num2[i] - num2[i + 1] > 0) {
          flag = false;
        }
      }

      if (flag) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    sc.close();
  }
}
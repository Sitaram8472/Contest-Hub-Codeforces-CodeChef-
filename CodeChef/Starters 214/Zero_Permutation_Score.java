import java.util.*;

public class Zero_Permutation_Score {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      if (n == 1 || n == 2) {
        System.out.println(0);
        continue;
      }

      int res = 0;
      for (int i = 2; i < n; i += 2) {
        res += (n - i) - 1;
      }
      System.out.println(res);

    }
    sc.close();
  }
}
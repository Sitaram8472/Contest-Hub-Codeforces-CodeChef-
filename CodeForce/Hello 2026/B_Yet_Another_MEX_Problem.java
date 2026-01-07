import java.util.*;

public class B_Yet_Another_MEX_Problem {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] num = new int[n];
      int max = -1;
      Set<Integer> s = new HashSet<>();

      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        s.add(num[i]);
      }

      for (int i = 0; i < n + 1; i++) {
        if (!s.contains(i)) {
          max = i;
          break;
        }
      }

      System.out.println(Math.min(max, k - 1));

    }
    sc.close();
  }
}
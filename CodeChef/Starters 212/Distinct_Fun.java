import java.util.*;

public class Distinct_Fun {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      HashSet<Integer> set = new HashSet<>();
      int oper = 0;

      for (int x : num) {
        if (set.contains(x)) {
          oper++;
          set.clear();
        }
        set.add(x);
      }

      System.out.println(oper);
    }

    sc.close();
  }
}

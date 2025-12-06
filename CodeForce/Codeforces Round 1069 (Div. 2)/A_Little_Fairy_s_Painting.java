import java.util.*;

public class A_Little_Fairy_s_Painting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      Set<Integer> s = new HashSet<>();

      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        s.add(num[i]);
      }

      int ans = s.size();
      while (!s.contains(ans)) {
        ans++;
      }

      System.out.println(ans);
    }
    sc.close();
  }
}
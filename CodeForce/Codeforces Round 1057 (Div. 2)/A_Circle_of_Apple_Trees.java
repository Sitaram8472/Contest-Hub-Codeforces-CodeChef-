import java.util.*;

public class A_Circle_of_Apple_Trees {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      HashSet<Integer> s = new HashSet<>();
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        s.add(a[i]);
      }
      System.out.println(s.size());
    }
    sc.close();
  }
}

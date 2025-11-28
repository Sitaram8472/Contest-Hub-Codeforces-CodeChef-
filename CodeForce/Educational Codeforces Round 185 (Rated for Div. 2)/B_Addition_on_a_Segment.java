import java.util.*;

public class B_Addition_on_a_Segment {

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

      System.out.println(s.size());

    }
    sc.close();
  }
}
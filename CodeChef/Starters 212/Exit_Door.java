import java.util.*;

public class Exit_Door {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] p = new int[n];
      for (int i = 0; i < n; i++) {
        p[i] = sc.nextInt();
      }

      ArrayList<Integer> list = new ArrayList<>();
      for (int x : p) {
        list.add(x);
      }

      int d = 0;

      for (int i = n; i >= 1; i--) {
        int index = list.indexOf(i);
        int left = index;
        int right = list.size() - index - 1;
        d += Math.min(left, right);
        list.remove(index);
      }

      System.out.println(d);
    }
    sc.close();
  }
}

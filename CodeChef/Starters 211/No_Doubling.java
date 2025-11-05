import java.util.*;

public class No_Doubling {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      Integer[] num = new Integer[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      HashMap<Integer, Integer> map = new HashMap<>();
      for (int a : num) {
        map.put(a, map.getOrDefault(a, 0) + 1);
      }

      Arrays.sort(num, Collections.reverseOrder());

      if (map.get(num[0]) == 1) {
        for (int a : num) {
          System.out.print(a + " ");
        }
        System.out.println();
      } else {
        System.out.print(num[0] + " " + num[n - 1] + " ");
        for (int i = 1; i < n - 1; i++) {
          System.out.print(num[i] + " ");
        }
      }
    }
    sc.close();
  }
}
import java.util.*;

public class C_Against_the_Difference {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      HashMap<Integer, Integer> map = new HashMap<>();

      for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
      }

      if (map.size() == 1) {
        System.out.println(n);
        continue;
      }

      int a = n;
      for (int num : map.keySet()) {
        if (num == 1) {
          continue;
        }
        if (map.get(num) % num != 0) {
          a -= map.get(num);
        }
      }
      System.out.println(a);

    }
    sc.close();
  }
}
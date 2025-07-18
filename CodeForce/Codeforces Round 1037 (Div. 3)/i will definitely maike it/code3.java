import java.util.*;


public class code3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      int ans = arr[k - 1];

      HashSet<Integer> set = new HashSet<>();
      for (int num : arr) {
        set.add(num - ans);
      }

      ArrayList<Integer> list = new ArrayList<>();
      for (int num : set) {
        list.add(num);
      }

      Collections.sort(list);
      boolean found = true;

      for (int i = 0; i < list.size() - 1; i++) {
        int diff = list.get(i + 1) - list.get(i);
        if (diff > ans) {
          found = false;
          break;
        }
      }

      if (found) {
        System.out.println("yes");
      } else {
        System.out.println("NO");
      }

    }
  }
}

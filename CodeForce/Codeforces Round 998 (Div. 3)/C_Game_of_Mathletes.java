import java.util.*;

public class C_Game_of_Mathletes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++)
        arr[i] = sc.nextInt();

      HashMap<Integer, Integer> map = new HashMap<>();
      for (int num : arr)
        map.put(num, map.getOrDefault(num, 0) + 1);

      int s = 0;

      for (int x : new ArrayList<>(map.keySet())) { // iterate on a copy to avoid concurrent modification
        int y = k - x;

        if (!map.containsKey(x) || !map.containsKey(y))
          continue;

        if (x == y) {
          s += map.get(x) / 2;
          map.remove(x);
        } else {
          int pair = Math.min(map.get(x), map.get(y));
          s += pair;
          map.put(x, map.get(x) - pair);
          map.put(y, map.get(y) - pair);

          if (map.get(x) == 0)
            map.remove(x);
          if (map.get(y) == 0)
            map.remove(y);
        }
      }

      // method 2
      // int s = 0;
      // Arrays.sort(arr);
      // int i = 0, j = n - 1;
      // while (i < j) {
      // if (arr[i] + arr[j] == k) {
      // s++;
      // i++;
      // j--;
      // } else if (arr[i] + arr[j] < k) {
      // i++;
      // } else {
      // j--;
      // }
      // }

      System.out.println(s);
    }

    sc.close();
  }
}

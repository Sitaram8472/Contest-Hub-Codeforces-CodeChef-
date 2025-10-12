import java.util.*;

public class A_MEX_Partition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      int max = 0;

      HashSet<Integer> set = new HashSet<>();
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        set.add(arr[i]);
        max = Math.max(max, arr[i]);
      }

      int x = 0;
      while(set.contains(x)) {
        x++;
      }

      System.out.println(x);

    }

  }

}

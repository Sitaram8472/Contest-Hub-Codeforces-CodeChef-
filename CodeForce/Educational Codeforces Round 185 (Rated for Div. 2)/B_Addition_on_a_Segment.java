import java.util.*;

public class B_Addition_on_a_Segment {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      long sum = 0;
      int cnt = 0;
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        sum += num[i];
        if (num[i] == 0) {
          cnt++;
        }
      }

      System.out.println(Math.min(sum - n + 1, n - cnt));

    }
    sc.close();
  }
}
import java.util.*;

public class Separation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] num = new int[n];
      int max = -1;
      int min = Integer.MAX_VALUE;
      boolean found = false;
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        min = Math.min(num[i], min);
        max = Math.max(num[i], max);
        if (num[i] == x) {
          found = true;
        }
      }

      
      if (max < x) {
        System.out.println("Yes");
      } else if (found) {
        System.out.println("Yes");
      } else if (min > x) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    }
    sc.close();
  }
}
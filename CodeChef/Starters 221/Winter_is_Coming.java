import java.util.*;

public class Winter_is_Coming {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      int[] temp = new int[n];
      for (int i = 0; i < n; i++) {
        temp[i] = sc.nextInt();
      }

      boolean wear = false;
      int count = 0;

      for (int i = 0; i < n; i++) {
        if (temp[i] < a) {
          if (!wear) {
            count++;
            wear = true;
          }
        } else if (temp[i] > b) {
          wear = false;
        }

      }

      System.out.println(count);
    }
    sc.close();
  }
}

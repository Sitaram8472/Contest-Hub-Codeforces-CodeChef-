import java.util.*;

public class B_Even_Modulo_Pair {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      boolean found = false;
      for (int i = 0; i < n && !found; i++) {
        for (int j = i + 1; j < n && !found; j++) {
          int mod = a[j] % a[i];
          if (mod % 2 == 0) {
            System.out.println(a[i] + " " + a[j]);
            found = true;
          }
        }
      }

      if (!found)
        System.out.println(-1);

    }
    sc.close();
  }

}
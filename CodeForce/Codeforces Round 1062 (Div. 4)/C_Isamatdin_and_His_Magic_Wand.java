import java.util.*;

public class C_Isamatdin_and_His_Magic_Wand {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] a = new int[n];
      int even = 0, odd = 0;
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        if (a[i] % 2 == 0) {
          even++;
        } else {
          odd++;
        }
      }
      if (even > 0 && odd > 0) {
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
          System.out.print(a[i] + " ");
        }
        System.out.println();

      } else {
        for (int i = 0; i < n; i++) {
          System.out.print(a[i] + " ");
        }
        System.out.println();
      }

    }
    sc.close();
  }
}
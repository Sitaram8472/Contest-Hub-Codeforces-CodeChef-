import java.util.*;

public class C_Pacer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long m = sc.nextLong();

      long a[] = new long[(int) n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextLong();
      }

      long b[] = new long[(int) m];
      for (int i = 0; i < m; i++) {
        b[i] = sc.nextInt();
      }


    }
    sc.close();
  }
}
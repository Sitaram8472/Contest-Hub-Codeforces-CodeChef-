import java.util.*;

public class B_Cake_Collection {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long m = sc.nextLong();

      Long arr[] = new Long[(int) n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }

      Arrays.sort(arr, Collections.reverseOrder());
      long temp = m;
      long sum = 0;
      for (int i = 0; i < Math.min(n, temp); i++) {
        sum += (m * arr[i]);
        m--;
      }
      System.out.println(sum);

    }
    sc.close();
  }
}
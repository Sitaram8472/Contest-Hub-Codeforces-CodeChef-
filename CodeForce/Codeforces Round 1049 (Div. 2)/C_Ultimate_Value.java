import java.util.*;

public class C_Ultimate_Value {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      long arr[] = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      long sum = 0;

      for (int i = 0; i < n; i++) {
        if (i % 2 == 0)
          sum += arr[i];
        else
          sum -= arr[i];
      }
      System.out.println(sum);
    }
    sc.close();
  }
}
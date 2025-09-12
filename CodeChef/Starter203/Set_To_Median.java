import java.util.*;

public class Set_To_Median {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      long arr[] = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }
      long totalsum = 0;
      long[] copy = new long[n];

      for (int i = 0; i < n; i++) {
        copy[i] = arr[i];
        totalsum += arr[i];
      }

      long median = 0;
      Arrays.sort(copy);
      if (n % 2 == 0) {
        median = copy[(n - 1) / 2];
      } else {
        median = copy[n / 2];
      }

      long currsum = 0;
      long temp = 0;

      int i = 0;
      int j = 0;

      if (totalsum >= (n * median)) {
        System.out.println(totalsum);
      } else {
        while (i < n) {
          
        }

      }

    }
    sc.close();
  }
}
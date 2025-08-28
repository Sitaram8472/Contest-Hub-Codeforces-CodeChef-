import java.util.*;

public class B_Villagers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextLong();
      }

      Arrays.sort(arr);

      long sum = 0;

      if (n % 2 == 0) {
        for (int i = 0; i < n - 1; i += 2) {
          sum += Math.max(arr[i], arr[i + 1]);
        }
        System.out.println(sum);
      } else {
        long start = arr[n - 1];
        long end = arr[0];

        for (int i = 0; i < n - 2; i += 2) {
          start += Math.max(arr[i], arr[i + 1]);
        }
        for (int i = n - 1; i > 0; i -= 2) {
          end += Math.max(arr[i], arr[i - 1]);
        }

        System.out.println(Math.min(start, end));
        ;

      }

    }
    sc.close();
  }
}
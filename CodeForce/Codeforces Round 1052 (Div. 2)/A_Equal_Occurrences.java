import java.util.*;

public class A_Equal_Occurrences {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int[] freq = new int[n + 1];

      for (long x : arr) {
        freq[(int) x]++;
      }

      int cnt = 0;
      for (int m : freq) {
        if (m > 0) {
          cnt++;
        }
      }

      Arrays.sort(freq);

      int j = 0;
      while (j < n && freq[j] == 0) {
        j++;
      }

      int size = 0;
      for (int k = j; j < n + 1; j++) {
        size = Math.max(size, freq[j] * cnt);
        cnt--;
      }
      System.out.println(size);

    }
  }

}

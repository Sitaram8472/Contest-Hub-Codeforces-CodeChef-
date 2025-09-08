import java.util.*;

public class Random_NIM {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int one1 = 0;
      int second = 0;

      for (int i : arr) {
        if (i == 1) {
          one1++;
        } else {
          second++;
        }
      }

      if (second > 0) {
        System.out.println(499122177);
      } else {
        if (one1 % 2 == 0) {
          System.out.println(0);
        } else {
          System.out.println(1);
        }
      }

    }
    sc.close();
  }
}
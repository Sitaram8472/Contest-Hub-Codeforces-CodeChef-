import java.util.*;

public class A_Arithmetic_Array {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      int sum = 0;
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
        sum += num[i];
      }

      if (sum < n) {
        System.out.println(1);
      } else {
        System.out.println(sum - n);
      }

    }
    sc.close();
  }
}
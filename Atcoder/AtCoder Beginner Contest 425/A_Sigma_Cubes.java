import java.util.*;

public class A_Sigma_Cubes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0) {
        sum += (long) i * i * i;
      } else {
        sum -= (long) i * i * i;
      }
    }

    System.out.println(sum);
  }
}

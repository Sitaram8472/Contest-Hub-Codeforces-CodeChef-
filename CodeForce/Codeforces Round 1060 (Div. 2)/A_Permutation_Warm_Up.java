import java.util.*;

public class A_Permutation_Warm_Up {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      System.out.println((n * n / 4) + 1);
    }
    sc.close();
  }
}
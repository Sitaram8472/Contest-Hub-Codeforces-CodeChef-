import java.util.*;

public class Playing_with_Toys {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int ans = Math.max(0, n - m);
    System.out.println(ans);

  }
}
import java.util.*;

public class Minimum_Set {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
        int n = sc.nextInt();
        long ans = 0;
        for(long i=1; i<=n; i++){
          ans += (i^(i+1));
        }
        System.out.println(ans);
      }
      sc.close();
    }
}
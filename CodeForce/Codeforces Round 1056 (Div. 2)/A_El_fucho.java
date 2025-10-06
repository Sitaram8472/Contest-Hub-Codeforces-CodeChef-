import java.util.*;

public class A_El_fucho {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
        int n = sc.nextInt();
          System.out.println(2*(n-1));
      }
      sc.close();
    }
}
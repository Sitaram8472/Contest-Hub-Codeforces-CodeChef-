import java.util.*;
public class Episodes {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
        int n = sc.nextInt();
        int k = sc.nextInt();

       int total = n*k;
       int div = total / 60;
       int rem = total  % 60;
       System.out.println(div + " " + rem);
      }
      sc.close();
    }
}

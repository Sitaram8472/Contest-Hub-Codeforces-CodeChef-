import java.util.*;

public class Fuel_Check {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      int m = sc.nextInt();
      System.out.println(t*m>=100 ?  "YES" : "NO");
    }
}
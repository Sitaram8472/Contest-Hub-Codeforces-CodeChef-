import java.util.*;

public class Cab_Rides {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      if(n == 1){
        System.out.println(200);
      } else {
        System.out.println(100*n);
      }
    }
    sc.close();
  }
}

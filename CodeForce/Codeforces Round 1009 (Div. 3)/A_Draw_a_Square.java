import java.util.*;

public class A_Draw_a_Square {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if( a== b && a == c && a ==d){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
      sc.close();
    }
}
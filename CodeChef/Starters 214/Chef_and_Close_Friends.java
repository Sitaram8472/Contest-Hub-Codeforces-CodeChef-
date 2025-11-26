import java.util.*;

public class Chef_and_Close_Friends {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();

      if(a>b){
        System.out.println(b*2);
      } else {
        System.out.println(a*2);
      }

    }
    sc.close();
  }
}
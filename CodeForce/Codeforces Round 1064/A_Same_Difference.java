import java.util.*;

public class A_Same_Difference {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      int cnt = 0;
      for(int i =0; i<n; i++){
        if(s.charAt(i) == s.charAt(n-1)){
          cnt++;
        }
      }
      System.out.println(n-cnt);

    }
    sc.close();
  }
}

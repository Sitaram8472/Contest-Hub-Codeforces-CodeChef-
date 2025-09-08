import java.util.*;

public class Mark_Points {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String str = sc.next();

      boolean found = true;

      for (int i = 0; i < n; i++) {
        if (str.charAt(i) == '1') {
          int j = i;
          while (j < n && str.charAt(j) == '1') {
            j++;
          }
          int currl = j-i;
          if(currl < 3){
            found = false;
            break;
          }
          i = j;
        }
      }
      System.out.println(found ? "yes": "no");
    }
    sc.close();
  }
}
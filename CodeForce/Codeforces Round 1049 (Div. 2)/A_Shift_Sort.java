import java.util.*;

public class A_Shift_Sort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();

      // int left = 0;
      // int rigth = 0;

      int totalzero = 0;

      for (int i = 0; i < n; i++) {
        char ch = s.charAt(i);
        if (ch == '0') {
          totalzero++;
        }
      }

      int one = 0;
       for (int i = 0; i < totalzero; i++) {
        char ch = s.charAt(i);
        if (ch == '1') {
          one++;
        }
      }

      System.out.println(one);


      

      // int len = 0;

      // for (int i = 0; i < n; i++) {
      //   char ch = s.charAt(i);
      //   if (ch == '0') {
      //     left++;
      //   }
      //   if (left == totalzero) {
      //     len = i;
      //   }
      // }

      // for (int i = n - 1; i >= 0; i--) {
      //   char ch = s.charAt(i);
      //   if (ch == '0') {
      //     rigth++;
      //   }
      //   if (rigth == totalzero) {
      //     len = Math.min(len, rigth);
      //   }
      // }
      // System.out.println(left);

    }
    sc.close();
  }
}
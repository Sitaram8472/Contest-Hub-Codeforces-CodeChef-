import java.util.*;

public class B_Drifting_Away {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = s.length();
      if(n == 1){
        System.out.println(1);
        continue;
      }

      int c = 2;
      for (int i = 0; i < n - 1; i++) {
        if (s.charAt(i) == '*' && s.charAt(i + 1) == '<') {
          c = 1;
          break;
        } else if (s.charAt(i) == '>' && s.charAt(i + 1) == '<') {
          c = 1;
          break;
        } else if (s.charAt(i) == '>' && s.charAt(i + 1) == '*') {
          c = 1;
          break;
        } else if (s.charAt(i) == '*' && s.charAt(i + 1) == '*') {
          c = 1;
          break;
        }
      }
      if (c == 1) {
        System.out.println(-1);
        continue;
      }

      int i = 0;
      int j = n - 1;

      while (i < s.length() && s.charAt(i) == '<') {
        i++;
      }
      if (i < s.length() && s.charAt(i) == '*') {
        i++;
      }

      while (j >= 0 && s.charAt(j) == '>') {
        j--;
      }
      if (j >= 0 && s.charAt(j) == '*') {
        j--;
      }
      System.out.println(Math.max(i, n - j - 1));

    }
    sc.close();
  }
}
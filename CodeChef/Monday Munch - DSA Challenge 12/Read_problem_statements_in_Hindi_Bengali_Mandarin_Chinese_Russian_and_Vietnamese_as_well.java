import java.util.*;

public class Read_problem_statements_in_Hindi_Bengali_Mandarin_Chinese_Russian_and_Vietnamese_as_well {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      System.out.println(findMaximumPairs(s));
    }
    sc.close();
  }

  public static int findMaximumPairs(String s) {
    // write your code here
    int n = s.length();
    int ans = 0;

    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) != s.charAt(i + 1)) {
        ans++;
        i++;
      }
    }

    return ans;
  }

}
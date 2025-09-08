import java.util.*;

public class Huge_Grid_Easy_Version {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String str = sc.next();

      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        int s = str.charAt(i)-'0';
        arr[i] = s;
      }

      int sum = 0;
      for (int i = 0; i < n; i++) {
        sum += arr[i];
        
      }
       for (int i = 0; i < n-1; i++) {
        sum += arr[i]+arr[i+1];
      }
      System.out.println(sum);

    }
    sc.close();
  }
}
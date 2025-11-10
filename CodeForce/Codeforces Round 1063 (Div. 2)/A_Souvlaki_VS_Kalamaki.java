import java.util.*;

public class A_Souvlaki_VS_Kalamaki {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] num = new int[n];
      for (int i = 0; i < n; i++) {
        num[i] = sc.nextInt();
      }

      boolean found = true;
      Arrays.sort(num);
      for (int i = 1; i < n - 1; i += 2) {
        if(num[i] != num[i+1]){
          found = false;
          break;
        }
      }

      System.out.println(found ? "YES": "NO");

    }
    sc.close();
  }
}

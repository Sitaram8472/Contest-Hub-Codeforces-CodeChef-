import java.util.*;

public class C_MEX_rose {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] arr = new int[n];
      int same = 0;
      int max = 0;
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if (arr[i] == k) {
          same++;
        }
      }
      int ans[] = new int[k];
       for (int i = 0; i < n; i++) {
        if(arr[i] < k){
          ans[arr[i]]++;
        }
      }
      for (int i = 0; i < k; i++) {
        if (ans[i] == 0) {
          max++;
        }
      }
      System.out.println(Math.max(same, max));
    }
    sc.close();
  }
}
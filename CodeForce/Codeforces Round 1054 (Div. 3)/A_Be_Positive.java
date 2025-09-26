import java.util.*;

public class A_Be_Positive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int zero = 0;
      int neg = 0;
      int min = 0;
      for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
          zero++;
        } else if (arr[i] < 0) {
          neg++;
          min = Math.min(min, arr[i]);
        } else {
          continue;
        }
      }
      if((neg & 1) == 0){
        System.out.println(zero);
      } else {
        System.out.println(zero+Math.abs(min)+1);
      }

    }
    sc.close();
  }

}

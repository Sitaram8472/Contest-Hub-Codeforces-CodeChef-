import java.util.*;
public class B_The_Third_Side {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while (t-- > 0) {
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
          sum += arr[i];
        }

        System.out.println(sum-n+1);
      }
      sc.close();
    }
}
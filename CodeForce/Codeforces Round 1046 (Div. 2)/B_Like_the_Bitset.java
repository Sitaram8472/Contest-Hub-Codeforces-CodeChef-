import java.util.*;

public class B_Like_the_Bitset {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      String str = sc.next();

      int max = 0, curr = 0;

      for (int i = 0; i < n; i++) {
        if (str.charAt(i) == '1') {
          curr++;
          max = Math.max(max, curr);
        } else {
          curr = 0;
        }
      }

      if (max >= k) {
        System.out.println("NO");
        continue;
      }

      int[] arr = new int[n];
      int a = n;
      for (int i = 0; i < n; i++) {
        if (str.charAt(i) == '0') {
          arr[i] = a;
          a--;
        }
      }

      int b = 1;

      for(int i=0; i<n; i++){
        if(str.charAt(i) == '1'){
          arr[i] = b;
          b++;
        }
      }


      System.out.println("YES");
      for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();

    }
    sc.close();
  }
}
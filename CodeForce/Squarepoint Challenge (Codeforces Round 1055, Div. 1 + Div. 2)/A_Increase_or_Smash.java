import java.util.*;

public class A_Increase_or_Smash {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      HashSet<Integer> set =  new HashSet<>();
      for(int num : arr){
        set.add(num);
      }
      System.out.println((2*set.size())-1);
    }
    sc.close();
  }

}

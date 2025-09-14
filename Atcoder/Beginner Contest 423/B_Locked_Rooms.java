import java.util.*;

public class B_Locked_Rooms {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int start = 1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        start++;
      } else {
        break;
      }
    }
    int end = 1;
    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] == 0) {
        end++;
      } else {
        break;
      }
    }

    int unreach = (n+1)-(start+end);
    if(unreach< 0){
      unreach = 0;
    }

    
    System.out.println(unreach);

  }

}
